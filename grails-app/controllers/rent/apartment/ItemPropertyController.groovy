package rent.apartment


import grails.rest.*
import grails.converters.*

class ItemPropertyController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ItemPropertyController() {
        super(ItemProperty)
    }

    def list(){
        def house = ItemProperty.createCriteria().list(params){
            if (params?.query){
                or{
                    ilike('house_name',"%${params?.query}%")
                }
            }
            eq('status', true)
        }
        HashMap jsonMap = new HashMap()
        jsonMap.lenght = house.totalCount
        jsonMap.results = house.collect{
            h -> return [
                    id: h.id,
                    house_name: h.house_name,
                    village: [
                            id: h.village.id,
                            village: h.village.village,
                            village_kh: h.village.village_kh
                    ],
                    commune: [
                            id: h.communce.id,
                            commune: h.communce.commune,
                            commune_kh: h.communce.commune_kh
                    ],
                    district: [
                            id: h.district.id,
                            district: h.district.district,
                            district_kh: h.district.district_kh
                    ],
                    province: [
                            id: h.province.id,
                            province: h.province.province,
                            province_kh: h.province.province_kh
                    ],
                    created_by_id:[
                            id: h.created_by.id,
                            name_eng: h.created_by.name_eng
                    ],
                    owner: [
                            id: h.owner.id,
                            name_eng: h.owner.name_eng,
                            name_kh: h.owner.name_kh
                    ],
                    rent_type: [
                            id: h.rent_type.id,
                            name: h.rent_type.name
                    ],
                    rule: [
                            id: h.rule.id,
                            name: h.rule.name
                    ],
                    status: h.status,
                    note: h.note
            ]
        }
        render jsonMap as JSON
    }
    def houseDetail(){
        def getHouseId = Houses.get(params.id)
    }
    def addNewPost() {

    }
}
