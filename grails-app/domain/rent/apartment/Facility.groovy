package rent.apartment

class Facility {
    String name
    boolean status
    String note
    Integer created_by
    Integer updated_by
    Date dateCreated
    Date lastUpdated

    static constraints = {
        note nullable: true
        updated_by nullable: true
    }
    static mapping = {
        autoTimestamp true
    }
}
