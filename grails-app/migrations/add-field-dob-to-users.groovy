databaseChangeLog = {

    changeSet(author: "IG_Sopheak (generated)", id: "1568000872229-1") {
        addColumn(tableName: "users") {
            column(name: "dob", type: "datetime")
        }
    }
}
