package rent.apartment

class Rent {

    static belongsTo = [user: Users, rent_type: RentType]

    static constraints = {
    }
}
