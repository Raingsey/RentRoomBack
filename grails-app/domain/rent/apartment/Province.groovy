package rent.apartment

class Province {
    String provid
    String province
    String province_kh
    Boolean b_status = true
    Date dateCreated
    Date lastUpdated
    String flag
    static belongsTo = [
            created_by: Users,
            updated_by: Users
    ]
    static hasMany = [districts: District]
    static constraints = {
        province blank: false
        province_kh nullable: true
        b_status nullable: true
        updated_by nullable: true
        flag nullable: true
        provid nullable: true
    }
    static mapping = {
        autoTimestamp true
        provid length: 2
    }
}
