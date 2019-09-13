package rent.apartment


import grails.rest.*
import grails.converters.*

class CommuneController extends RestfulController {
    static responseFormats = ['json', 'xml']
    CommuneController() {
        super(Commune)
    }

    def index() {
        def res = Commune.findAllByB_status(true, [sort: "commune"])
        render res as JSON
    }

    def list() {
        def lists = Commune.createCriteria().list (params) {
            if (params?.query) {
                or {
                    district {
                        ilike("district", "%${params.query}%")
                    }
                    ilike("commid", "%${params.query}%")
                    ilike("commune", "%${params.query}%")
                    ilike("commune_kh", "%${params.query}%")
                }
            }
            eq('b_status', true)
        }
        HashMap jsonMap = new HashMap()
        jsonMap.results = lists.collect { m ->
            return [
                    id: m.id,
                    commid: m.commid,
                    commune: m.commune,
                    commune_kh: m.commune_kh,
                    district: [
                            id: m.district.id,
                            district: m.district.district,
                            province: m.district.province.id
                    ],
                    province: [
                            id: m.district.province.id,
                            province: m.district.province.province
                    ]
            ]
        }
        jsonMap.length = lists.totalCount
        render jsonMap as JSON
    }

    def getByDistrictId(long id) {
        def lists = Commune.createCriteria().list () {
            district {
                eq('id', id)
            }
        }
        render lists as JSON
    }
}
