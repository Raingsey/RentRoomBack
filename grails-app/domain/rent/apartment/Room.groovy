package rent.apartment

class Room {

    String name
    Boolean isAvalable = true
    Boolean status = true
    Double price
    String photo
    Date dateCreated
    Date lastUpdated


    static constraints = {
    }

    static mapping = {
        autoTimestamp true
    }
}
