package rent.apartment

class Commune {

    String commid
    String commune
    String commune_kh
    Date dateCreated
    Date lastUpdated
    String flag
    Boolean b_status = true

    static  belongsTo = [
            district: District,
            created_by: Users,
            updated_by: Users
    ]
    static constraints = {
        commid blank: false
        commune blank: false
        commune_kh nullable: true
        updated_by nullable: true
        b_status nullable: true
        flag nullable: true
    }
    static mapping = {
        autoTimestamp true
        commid length: 6
    }
}
