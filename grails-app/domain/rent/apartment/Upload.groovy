package rent.apartment

class Upload {

    static belongsTo = [user: Users, rent_type: RentType]

    static constraints = {
    }
}
