package services

import dao.DBConnector.DatabaseFactory
import dao.entitys.User
import dao.entitys.Users
import dao.entitys.Users.id
import org.jetbrains.exposed.sql.select
import org.jetbrains.exposed.sql.transactions.transaction

class UserService {
    public fun getAllUsers(): User {
        DatabaseFactory.connect()

        return transaction {
            Users.select { Users.id eq 1L }
                .map { User(id = it[Users.id],
                    firstName = it[Users.firstName],
                    lastName = it[Users.lastName],
                    accountName = it[Users.accountName]) }
                .first()
        }
    }
}

