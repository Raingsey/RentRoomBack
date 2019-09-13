package rent.apartment


import grails.rest.*
import grails.converters.*

class GenderController extends RestfulController {
    static responseFormats = ['json', 'xml']
    GenderController() {
        super(Gender)
    }
}
