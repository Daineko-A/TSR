package dao.entitys

import dao.entitys.common.BaseEntity
import org.jetbrains.exposed.sql.Table

data class User(
    override val id: Long,
    val firstName: String,
    val lastName: String,
    val accountName: String
) : BaseEntity() {}

object Users : Table() {
    val id = long("id").primaryKey().autoIncrement()
    val firstName = varchar("firstname", 255)
    val lastName = varchar("lastname", 255)
    val accountName = varchar("accountName", 255)
}