package rent.apartment

class UserRole {
    static belongsTo = [role: Role, user: Users, created_by: Users]
    Date created_date = new Date()
    static constraints = {
    }
}
