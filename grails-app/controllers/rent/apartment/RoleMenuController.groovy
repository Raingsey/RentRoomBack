package rent.apartment


import grails.rest.*
import grails.converters.*

class RoleMenuController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RoleMenuController() {
        super(RoleMenu)
    }
}
