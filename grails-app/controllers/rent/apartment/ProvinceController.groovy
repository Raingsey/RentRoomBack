package rent.apartment


import grails.rest.*
import grails.converters.*

class ProvinceController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ProvinceController() {
        super(Province)
    }

    def index() {
        def res = Province.findAllByB_status(true, [sort: "province"])
        render res as JSON
    }

    def list() {
        def lists = Province.createCriteria().list (params) {
            if (params?.query) {
                or {
                    ilike("provid", "%${params.query}%")
                    ilike("province", "%${params.query}%")
                    ilike("province_kh", "%${params.query}%")
                }
            }
            eq('b_status', true)
        }
        HashMap jsonMap = new HashMap()
        jsonMap.results = lists.collect {m ->
            return [
                    id: m.id,
                    provid: m.provid,
                    province: m.province,
                    province_kh: m.province_kh
            ]
        }
        jsonMap.length = lists.totalCount
        render jsonMap as JSON
    }
}
