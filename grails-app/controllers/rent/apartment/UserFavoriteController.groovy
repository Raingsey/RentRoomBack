package rent.apartment


import grails.rest.*
import grails.converters.*

class UserFavoriteController extends RestfulController {
    static responseFormats = ['json', 'xml']
    UserFavoriteController() {
        super(UserFavorite)
    }
}
