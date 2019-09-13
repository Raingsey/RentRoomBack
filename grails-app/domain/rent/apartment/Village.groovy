package rent.apartment

class Village {
    String villid
    String village
    String village_kh
    Date dateCreated
    Date lastUpdated
    String flag
    Boolean b_status = true

    static belongsTo = [
            commune: Commune,
            created_by: Users,
            updated_by: Users
    ]
    static constraints = {
        villid blank: false
        village blank: false
        village_kh nullable: true
        updated_by nullable: true
        b_status nullable: true
        flag nullable: true
    }
    static mapping = {
        autoTimestamp true
        villid length: 8
    }
}
