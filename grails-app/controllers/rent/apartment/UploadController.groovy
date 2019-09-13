package rent.apartment


import grails.rest.*
import grails.converters.*

class UploadController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UploadController() {
        super(Upload)
    }

//    def list() {
//        def upload = Upload.
//    }
}
