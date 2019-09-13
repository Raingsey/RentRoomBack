package rent.apartment

class MenuItem {
    String title
    String icon_class
    String icon_color
    String icon_bg
    String color
    Boolean active
    Boolean disabled
    String routing
    String externalLink
    Boolean groupTitle
    Integer menu_order
    Integer parent_id
    static hasMany = [roleMenu: RoleMenu, subMenu: MenuItem]
    static mappedBy = [subMenu: 'none']
    static constraints = {
        title(nullable: true)
        icon_class(nullable: true)
        icon_color(nullable: true)
        icon_bg(nullable: true)
        color(nullable: true)
        active(nullable: true)
        disabled(nullable: true)
        routing(nullable: true)
        externalLink(nullable: true)
        groupTitle(nullable: true)
        subMenu(nullable: true)
        menu_order(nullable: true)
        parent_id(nullable: true)
    }
}
