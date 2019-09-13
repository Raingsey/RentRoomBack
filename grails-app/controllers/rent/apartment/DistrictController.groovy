package rent.apartment


import grails.rest.*
import grails.converters.*

class DistrictController extends RestfulController {
    static responseFormats = ['json', 'xml']
    DistrictController() {
        super(District)
    }

    def index() {
        def res = District.findAllByB_status(true, [sort: "district"])
        render res as JSON
    }

    def list() {
        def lists = District.createCriteria().list (params) {
            if (params?.query) {
                or {
                    province {
                        ilike("province", "%${params.query}%")
                    }
                    ilike("district", "%${params.query}%")
                    ilike("district_kh", "%${params.query}%")
                }
            }
            eq('b_status', true)
        }
        HashMap jsonMap = new HashMap()
        jsonMap.results = lists.collect {m ->
            return [
                    id: m.id,
                    distid: m.distid,
                    district: m.district,
                    district_kh: m.district_kh,
                    province: [
                            id: m.province.id,
                            province: m.province.province
                    ]
            ]
        }
        jsonMap.length = lists.totalCount
        render jsonMap as JSON
    }

    def getByProvinceId(Long id) {
        def lists = District.createCriteria().list () {
            province {
                eq('id', id)
            }
        }
        render lists as JSON
    }
}
