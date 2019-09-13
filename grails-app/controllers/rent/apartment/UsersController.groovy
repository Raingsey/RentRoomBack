package rent.apartment

import grails.rest.*
import grails.converters.*

class UsersController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UsersController() {
        super(Users)
    }
    def list(){
        def users = Users.createCriteria().list(params){
            if (params?.query){
                or{
                    ilike('username',"%${params?.query}%")
                    ilike('name_eng',"%${params?.query}%")
                    ilike( 'name_kh',"%${params.query}%")
                }
            }
            eq('status',"Active")
        }
        HashMap jsonMap = new HashMap()
        jsonMap.results = users.collect{ u ->
        return [
                id: u.id,
                name_eng: u.name_eng,
                username: u.username,
                name_kh: u.name_kh,
                email: u.email,
                phone: u.phone,
                dob: u.dob,
                gender: [
                        id: u.gender.id,
                        sex: u.gender.sex
                ],
                create_by: u.created_by,
                status: u.status
            ]
        }
        jsonMap.length = users.totalCount
        render jsonMap as JSON
    }
    def addNewUser(){
        def username = Users.findAllByUsername(params.username as String)
        def email = Users.findAllByEmail(params.email as String)
        if (username || email){
            respond(
                    code: "402",
                    message: "username or email already existed"
            )
        } else {
            def newUser = new Users(name_eng: params.name_eng, name_kh: params.name_kh,username: params.username,password: params.password,
                    status: "Active", phone: params.phone, email: params.email, gender: params.gender_id)
            if (newUser.save(flush: true)){
                respond(
                        code: 200,
                        message: "success",
                        data: newUser
                )
            }else {
                newUser.errors.allErrors.each {
                    println it
                }
                respond (
                        code: 500,
                        Message: "Internal server Error"
                )
            }
        }
    }
    def login() {
        def data = params
        if (!data.username?.trim()) {
            respond code: 400, message: "Username not provided"
            return
        }
        if (!data.password?.trim()) {
            respond code: 400, message: "Password not provided"
            return
        }
        def user = Users.findByUsernameAndPassword("${data.username}", "${data.password}")

        if (!user){
            respond code: 400, message: "Username or Password not match!"
            return
        }
        if (user.status != "Active") {
            respond code: 400, message: "User is inactive!!!"
            return
        }
        respond code: 200, message: "Success",
                user: [
                        id: user.id,
                        name_eng: user.name_eng,
                        name_kh: user.name_kh,
                        email: user.email,
                        phone: user.phone,
                        gender: [
                                id: user?.gender?.id,
                                gender: user?.gender?.sex
                        ],
                        role: user?.userRoles?.collect { a->
                            return [
                                    id: a.id,
                                    role_name: a?.role?.role_name,
                            ]
                        },
                        dob: user.dob,
                        username: user.username,
                        image_path: user.image_path,
                        status: user.status
                ]
    }

    def getMenuItem() {
        def id = request.JSON.user_id as Long
        println('id : ' + id)
        if (id > 0) {
            def result
            def main = MenuItem.executeQuery("SELECT DISTINCT MI FROM MenuItem MI INNER JOIN RoleMenu RM ON MI.id = RM.menu.id INNER JOIN UserRole UR " +
                    "on RM.role.id = UR.role.id AND UR.user.id=?" +
                    " WHERE MI.parent_id IS NULL AND (RM.menu.id IS NOT NULL OR MI.routing IS NULL) ORDER BY MI.menu_order",[id])

            result = main.collect { m ->
                def subm = MenuItem.executeQuery("SELECT DISTINCT MI FROM MenuItem MI INNER JOIN RoleMenu RM ON MI.id = RM.menu.id INNER JOIN UserRole UR " +
                        "on RM.role.id = UR.role.id AND UR.user.id=?" +
                        " WHERE MI.parent_id IS NOT NULL AND RM.menu.id IS NOT NULL AND MI.parent_id=? ORDER BY MI.menu_order",[id, m.id.toInteger()])
                return [
                        id: m.id,
                        title: m.title,
                        icon_class: m.icon_class,
                        icon_color: m.icon_color,
                        icon_bg: m.icon_bg,
                        color: m.color,
                        active: m.active,
                        routing: m.routing,
                        groupTitle: m.groupTitle,
                        sub: subm.collect { s ->
                            [
                                    id: s.id,
                                    title: s.title,
                                    routing: s.routing
                            ]
                        }
                ]
            }
            render result as JSON
        }else {
            render status: 200
        }
    }

}
