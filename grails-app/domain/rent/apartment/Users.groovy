package rent.apartment

class Users {
    String name_eng
    String name_kh
    String email
    String phone
    String username
    String password
    Date dob
    String image_path
    String status = 'Active'
    Date created_date =  new Date()
    Date updated_date
    static belongsTo = [created_by: Users, updated_by: Users, gender: Gender]
    static hasMany = [userRoles: UserRole]
    static constraints = {
        name_eng(blank: false)
        name_kh(nullable: true)
        email(blank: false)
        username(blank: false)
        password(blank: false)
        image_path(nullable: true)
        dob nullable: true
        status(nullable: true)
        updated_by(nullable: true)
        created_by(nullable: true)
        updated_date(nullable: true)
        gender(nullable: true)
        phone nullable: true
    }
    static mapping = {
        autoTimestamp true
    }
}
