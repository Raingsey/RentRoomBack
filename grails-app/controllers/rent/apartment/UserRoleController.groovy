package rent.apartment


import grails.rest.*
import grails.converters.*

class UserRoleController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UserRoleController() {
        super(UserRole)
    }
}
