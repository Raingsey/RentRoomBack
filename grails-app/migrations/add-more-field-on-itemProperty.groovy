databaseChangeLog = {

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-1") {
        addColumn(tableName: "item_property") {
            column(name: "created_by_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-2") {
        addColumn(tableName: "item_property") {
            column(name: "date_created", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-3") {
        addColumn(tableName: "item_property") {
            column(name: "house_name", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-4") {
        addColumn(tableName: "item_property") {
            column(name: "last_updated", type: "datetime") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-5") {
        addColumn(tableName: "item_property") {
            column(name: "note", type: "varchar(255)") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-6") {
        addColumn(tableName: "item_property") {
            column(name: "status", type: "bit") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-7") {
        addColumn(tableName: "item_property") {
            column(name: "updated_by_id", type: "bigint") {
                constraints(nullable: "false")
            }
        }
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-8") {
        addForeignKeyConstraint(baseColumnNames: "updated_by_id", baseTableName: "item_property", constraintName: "FK7eeg8isqm4j2imikyme127csd", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "users")
    }

    changeSet(author: "IG_Sopheak (generated)", id: "1568081873862-9") {
        addForeignKeyConstraint(baseColumnNames: "created_by_id", baseTableName: "item_property", constraintName: "FKodxy98mbo36t31ft0te0sol2o", deferrable: "false", initiallyDeferred: "false", referencedColumnNames: "id", referencedTableName: "users")
    }
}
