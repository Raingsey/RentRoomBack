package rent.apartment


import grails.rest.*
import grails.converters.*

class MenuItemController extends RestfulController {
    static responseFormats = ['json', 'xml']
    MenuItemController() {
        super(MenuItem)
    }
}
