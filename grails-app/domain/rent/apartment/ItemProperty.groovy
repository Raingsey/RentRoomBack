package rent.apartment

class ItemProperty {
    String house_name
    boolean status
    String note
    Date dateCreated
    Date lastUpdated
    static belongsTo = [created_by: Users,
                        updated_by: Users,
                        rent_type: RentType,
                        location: Location,
                        owner: Users,
                        rule: Rule,
                        village: Village,
                        communce: Commune,
                        district: District,
                        province: Province]
    static hasMany = [facility: Facility]

    static constraints = {
        autoTimeStamp true
    }
}
