package dao.entitys

import dao.entitys.common.BaseEntity
import org.jetbrains.exposed.sql.Table

data class User(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val accountName: String
)

object Users : Table() {
    val id = long("id").primaryKey().autoIncrement()
    val firstName = varchar("first_name", 255)
    val lastName = varchar("last_name", 255)
    val accountName = varchar("account_name", 255)
}