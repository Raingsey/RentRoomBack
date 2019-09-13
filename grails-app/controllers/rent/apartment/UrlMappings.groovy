package rent.apartment

class UrlMappings {

    static mappings = {
        delete "/$controller/$id(.$format)?"(action:"delete")
        get "/$controller(.$format)?"(action:"index")
        get "/$controller/$id(.$format)?"(action:"show")
        post "/$controller(.$format)?"(action:"save")
        put "/$controller/$id(.$format)?"(action:"update")
        patch "/$controller/$id(.$format)?"(action:"patch")

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')

        "/district/getByProvinceId/$id"(controller: 'district', action: 'getByProvinceId', method: 'get')
        "/commune/getByDistrictId/$id"(controller: 'commune', action: 'getByDistrictId', method: 'get')
        "/village/getByCommuneId/$id"(controller: 'village', action: 'getByCommuneId', method: 'get')

        "/role"(controller: "role", action: "index", method: "GET")
        "/users/login"(controller: "Users", action: "login", method: "POST")
        "/users/getMenuItem"(controller: "Users", action: "getMenuItem", method: 'POST')
        "/users/list"(controller: "Users", action: "list")
        "/users/users"(controller: "Users", action: "users", method: 'GET')
        "/users/addNewUser"(controller: "Users", action: "addNewUser", method: 'POST')

        "/itemProperty/list"(controller: "ItemProperty", action: "list")
        "/role/list"(controller: "Role", action: "list")

    }
}
