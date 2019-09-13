package rent.apartment


import grails.rest.*
import grails.converters.*

class LocationController extends RestfulController {
    static responseFormats = ['json', 'xml']
    LocationController() {
        super(Location)
    }
}
