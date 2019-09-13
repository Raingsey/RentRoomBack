package rent.apartment

class AmountRoom {

    static belongsTo = [item_property: ItemProperty]
    static hasMany = [room: Room]

    static constraints = {
    }
}
