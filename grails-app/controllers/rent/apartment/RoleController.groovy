package rent.apartment

import grails.rest.*
import grails.converters.*

class RoleController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RoleController() {
        super(Role)
    }

    def index() {
        def res = Role.listOrderByRole_name()
        render res as JSON
    }
    def list() {
        def lists = Role.createCriteria().list (params) {
            if (params?.query) {
                or {
                    ilike("role_name", "%${params.query}%")
                    ilike("description", "%${params.query}%")
                }
            }
        }

        HashMap jsonMap = new HashMap()
        jsonMap.results = lists.collect {m ->
            return [
                    id: m.id,
                    role_name: m.role_name,
                    description: m.description
            ]
        }
        jsonMap.length = lists.totalCount
        render jsonMap as JSON
    }
}
