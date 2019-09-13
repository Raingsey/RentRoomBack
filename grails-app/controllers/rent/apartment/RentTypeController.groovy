package rent.apartment


import grails.rest.*
import grails.converters.*

class RentTypeController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RentTypeController() {
        super(RentType)
    }
}
