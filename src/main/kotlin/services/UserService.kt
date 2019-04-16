package services

import dao.DBConnector.DatabaseFactory
import dao.entitys.User
import dao.entitys.Users
import org.jetbrains.exposed.sql.Query
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

class UserService {
    public fun getAllUsers(): ResultRow {
        DatabaseFactory.connect()

        val jamesList = transaction {
            Users.selectAll()
        }

        return jamesList.first()
    }
}