package rent.apartment

class Gender {
    String sex
    Boolean status = true
    Date dateCreated
    Date lastUpdated

    static mapping = {
        autoTimestamp true
    }
    static constraints = {
    }
}
