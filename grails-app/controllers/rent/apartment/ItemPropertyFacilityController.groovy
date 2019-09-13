package rent.apartment


import grails.rest.*
import grails.converters.*

class ItemPropertyFacilityController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ItemPropertyFacilityController() {
        super(ItemPropertyFacility)
    }
}
