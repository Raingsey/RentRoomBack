package rent.apartment

class RoleMenu {
    static belongsTo = [role: Role, menu: MenuItem, created_by: Users]
    Date created_date = new Date()
    static constraints = {
        created_by(nullable: true)
    }
}
