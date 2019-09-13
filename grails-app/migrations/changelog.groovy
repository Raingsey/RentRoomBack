databaseChangeLog = {

   // include file: 'new-migrate.groovy'
    include file: 'add-relation-to-user.groovy'
    include file: 'add-field-dob-to-users.groovy'
    include file: 'add-more-field-on-itemProperty.groovy'
    include file: 'change-relation-many-from-house-to-facility.groovy'
    include file: 'add-phone-field-to-user.groovy'
}
