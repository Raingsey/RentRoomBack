package rent.apartment


import grails.rest.*
import grails.converters.*

class RentController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RentController() {
        super(Rent)
    }
}
