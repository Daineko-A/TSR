package services

import dao.DBConnector.DatabaseFactory
import dao.entitys.User
import dao.entitys.Users
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.selectAll
import org.jetbrains.exposed.sql.transactions.transaction

class UserService {
    public fun getAllUsers() {
        DatabaseFactory.connect()

        val user = User(3, "dasf", "asdfgfsd", "aeadfvaertvaervadf")

        transaction {
            Users.insert { user }
        }
    }
}