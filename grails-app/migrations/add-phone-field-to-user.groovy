databaseChangeLog = {

    changeSet(author: "IG_Sopheak (generated)", id: "1568273150629-1") {
        addColumn(tableName: "users") {
            column(name: "phone", type: "varchar(255)")
        }
    }
}
