package rent.apartment

class ItemPhoto {

    String photo
    Boolean status = true
    Date dateCreated
    Date lastUpdated

    static hasMany = [item_property: ItemProperty]

    static mapping = {
        autoTimestamp true
    }

    static constraints = {
        photo nullable: true
    }
}
