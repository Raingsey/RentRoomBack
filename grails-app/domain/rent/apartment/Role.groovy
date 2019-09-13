package rent.apartment

class Role {
    String role_name
    String description
    Date created_date = new Date()
    Date updated_date
    static hasMany = [userRoles: UserRole, roleMenus: RoleMenu]
    static belongsTo = [created_by: Users, updated_by: Users]
    static constraints = {
        role_name(blank: false)
        description(nullable: true)
        updated_by(nullable: true)
        updated_date(nullable: true)
        created_by(nullable: true)
    }
}
