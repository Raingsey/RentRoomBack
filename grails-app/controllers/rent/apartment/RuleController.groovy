package rent.apartment


import grails.rest.*
import grails.converters.*

class RuleController extends RestfulController {
    static responseFormats = ['json', 'xml']
    RuleController() {
        super(Rule)
    }
}
