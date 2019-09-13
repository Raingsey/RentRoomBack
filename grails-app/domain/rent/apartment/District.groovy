package rent.apartment

class District {

    String distid
    String district
    String district_kh
    Date dateCreated
    Date lastUpdated
    String flag
    Boolean b_status = true

    static  belongsTo = [
            province: Province,
            created_by: Users,
            updated_by: Users
    ]
    static constraints = {
        distid blank: false
        district blank: false
        district_kh nullable: true
        updated_by nullable: true
        b_status nullable: true
        flag nullable: true
    }
    static mapping = {
        autoTimestamp true
        distid length: 4
    }
}
