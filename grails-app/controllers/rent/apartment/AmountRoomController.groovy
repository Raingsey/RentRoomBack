package rent.apartment


import grails.rest.*
import grails.converters.*

class AmountRoomController extends RestfulController {
    static responseFormats = ['json', 'xml']
    AmountRoomController() {
        super(AmountRoom)
    }
}
