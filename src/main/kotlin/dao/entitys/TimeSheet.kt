package dao.entitys

import dao.entitys.common.BaseEntity
import org.jetbrains.exposed.sql.Table
import java.time.DayOfWeek
import java.time.Year

data class TimeSheet(override val id: Long,
                     val year: Year,
                     val weekNum: Long,
                     val idUser: User) : BaseEntity() {}

object TimeSheets : Table() {
    val id = long("id").primaryKey().autoIncrement()
    val year = date("year")
    val weekNum = long("weekNum")
    val userId = long("userId")
}