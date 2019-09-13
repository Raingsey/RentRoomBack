databaseChangeLog = {

    changeSet(author: "IG_Sopheak (generated)", id: "1568189823902-1") {
        addColumn(tableName: "item_property_facility") {
            column(name: "facility_id", type: "bigint")
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568189823902-2") {
        addColumn(tableName: "item_property_facility") {
            column(name: "item_property_facility_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568189823902-3") {
        addForeignKeyConstraint(baseColumnNames: "item_property_facility_id", baseTableName: "item_property_facility", constraintName: "FK6mqv0t79kgcl5qhgp5x11i4yo", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "item_property")
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568189823902-4") {
        addForeignKeyConstraint(baseColumnNames: "facility_id", baseTableName: "item_property_facility", constraintName: "FKe4l2db7t9gs168rfhpyqnk8ev", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "facility")
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568189823902-5") {
        dropForeignKeyConstraint(baseTableName: "item_property", constraintName: "FKjfj0j7hifg2vxecoq6u53gxg")
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568189823902-6") {
        dropColumn(columnName: "facility_id", tableName: "item_property")
    }
}
