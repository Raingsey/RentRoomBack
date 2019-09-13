package rent.apartment


import grails.rest.*
import grails.converters.*

class RoomController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RoomController() {
        super(Room)
    }
}
