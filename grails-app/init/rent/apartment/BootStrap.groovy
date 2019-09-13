package rent.apartment

class BootStrap {

    def init = { servletContext ->
//        Role.findOrSaveByRole_name("Admin")
//        Role.findOrSaveByRole_name("Owner")
//        Role.findOrSaveByRole_name("Renter")
//
//        MenuItem.findOrSaveByTitleAndActiveAndDisabledAndGroupTitleAndMenu_order( 'Rent System', false, false, true, 1)
//        MenuItem.findOrSaveByTitleAndIcon_bgAndMenu_orderAndRoutingAndIcon_colorAndActiveAndDisabledAndGroupTitle('Dashboards','#ffcc99', 2, '/app/dashboard', 'rgba(0,0,0,.87)', false, false, false)
//        MenuItem.findOrSaveByTitleAndIcon_classAndIcon_bgAndMenu_orderAndIcon_colorAndActiveAndDisabledAndGroupTitle('Privileges', 'fa fa-lock','#C2C2D6', 3, 'rgba(0,0,0,.87)', false, false, false)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('User', 4, '/app/user', false, false,false,MenuItem.findByTitle('Privileges').id)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Role', 5, '/app/role', false, false, false, MenuItem.findByTitle('Privileges').id)
        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Post', 16, '/app/role', false, false, false, MenuItem.findByTitle('Privileges').id)
//
//        MenuItem.findOrSaveByTitleAndIcon_classAndIcon_bgAndMenu_orderAndIcon_colorAndActiveAndDisabledAndGroupTitle('Address', 'fa fa-wrench','#9999FF', 6, 'rgba(0,0,0,.87)', false, false, false)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Province',7, '/app/province', false, false, false, MenuItem.findByTitle('Address').id)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('District', 8, '/app/district', false, false, false, MenuItem.findByTitle('Address').id)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Commune', 9, '/app/commune', false, false, false, MenuItem.findByTitle('Address').id)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Village', 10, '/app/village', false, false, false, MenuItem.findByTitle('Address').id)
//
//
//        MenuItem.findOrSaveByTitleAndIcon_classAndIcon_bgAndMenu_orderAndIcon_colorAndActiveAndDisabledAndGroupTitle('Setting', 'fa fa-gear','#cc99ff', 11, 'rgba(0,0,0,.87)', false, false, false)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Gender', 12, '/app/gender', false, false, false, MenuItem.findByTitle('Setting').id)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Room Status', 13, '/app/roomStatus', false, false, false, MenuItem.findByTitle('Setting').id)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Facility', 14, '/app/facility', false, false, false, MenuItem.findByTitle('Setting').id)
//        MenuItem.findOrSaveByTitleAndMenu_orderAndRoutingAndActiveAndDisabledAndGroupTitleAndParent_id('Property Type', 15, '/app/propertyType', false, false, false, MenuItem.findByTitle('Setting').id)
//
//        new RoleMenu(role: 1, menu: 1).save()
//        new RoleMenu(role: 1, menu: 2).save()
//        new RoleMenu(role: 1, menu: 3).save()
//        new RoleMenu(role: 1, menu: 4).save()
//        new RoleMenu(role: 1, menu: 5).save()
//        new RoleMenu(role: 1, menu: 6).save()
//        new RoleMenu(role: 1, menu: 7).save()
//        new RoleMenu(role: 1, menu: 8).save()
//        new RoleMenu(role: 1, menu: 9).save()
//        new RoleMenu(role: 1, menu: 10).save()
//        new RoleMenu(role: 1, menu: 11).save()
//        new RoleMenu(role: 1, menu: 12).save()
//        new RoleMenu(role: 1, menu: 13).save()
//        new RoleMenu(role: 1, menu: 14).save()
//        new RoleMenu(role: 1, menu: 15).save()
//
//        new Users(name_eng: 'Administrator', username: 'admin', password: '123123', email: 'admin@mail.com', status: 'Active').save()
        new UserRole(user: 1, role: 1).save()
        //UserRole.findOrSaveByUserAndRoleAndCreated_by(1,1,1)
    }
    def destroy = {
    }
}
