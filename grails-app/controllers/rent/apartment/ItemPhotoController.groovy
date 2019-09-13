package rent.apartment


import grails.rest.*
import grails.converters.*

class ItemPhotoController extends RestfulController {
    static responseFormats = ['json', 'xml']
    ItemPhotoController() {
        super(ItemPhoto)
    }
}
