package rent.apartment


import grails.rest.*
import grails.converters.*

class FacilityController extends RestfulController {
    static responseFormats = ['json', 'xml']
    FacilityController() {
        super(Facility)
    }
}
