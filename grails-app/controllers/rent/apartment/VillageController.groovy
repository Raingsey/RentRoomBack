package rent.apartment


import grails.rest.*
import grails.converters.*

class VillageController extends RestfulController {
    static responseFormats = ['json', 'xml']
    VillageController() {
        super(Village)
    }

    def index() {
        def res = Village.findAllByB_status(true, [sort: "village"])
        render res as JSON
    }

    def list() {
        def lists = Village.createCriteria().list (params) {
            if (params?.query) {
                or {
                    commune {
                        ilike("commune", "%${params.query}%")
                    }
                    ilike("villid", "%${params.query}%")
                    ilike("village", "%${params.query}%")
                    ilike("village_kh", "%${params.query}%")
                }
            }
            eq('b_status', true)
        }
        HashMap jsonMap = new HashMap()
        jsonMap.results = lists.collect {m ->
            return [
                    id: m.id,
                    villid: m.villid,
                    village: m.village,
                    village_kh: m.village_kh,
                    commune: [
                            id: m.commune.id,
                            commune: m.commune.commune,
                            district: m.commune.district.id
                    ],
                    district: [
                            id: m.commune.district.id,
                            district: m.commune.district.district,
                            province: m.commune.district.province.id,
                    ],
                    province: [
                            id: m.commune.district.province.id,
                            province: m.commune.district.province.province
                    ]
            ]
        }
        jsonMap.length = lists.totalCount
        render jsonMap as JSON
    }
    def getByCommuneId(long id) {
        def lists = Village.createCriteria().list () {
            commune {
                eq('id', id)
            }
        }
        render lists as JSON
    }
}
