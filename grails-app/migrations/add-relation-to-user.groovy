databaseChangeLog = {

    changeSet(author: "IG_Sopheak (generated)", id: "1567995015882-1") {
        addForeignKeyConstraint(baseColumnNames: "gender_id", baseTableName: "users", constraintName: "FKo0h29eo9e4y4wvd5yh0sn03rp", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "gender")
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1567995015882-2") {
        dropNotNullConstraint(columnDataType: "bigint", columnName: "gender_id", tableName: "users")
    }
}
