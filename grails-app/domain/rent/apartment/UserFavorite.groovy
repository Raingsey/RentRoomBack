package rent.apartment

class UserFavorite {

    Boolean isFavorite = true
    Boolean status = true
    Date dateCreated
    Date lastUpdated

    static belongsTo = [user: Users]

    static hasMany = [item_property: ItemProperty]

    static constraints = {
    }

    static mapping = {
        autoTimestamp true
    }
}
