package dao.entitys

import dao.entitys.common.BaseEntity
import org.jetbrains.exposed.sql.Table

data class Week(
    override val id: Long,
    val monday: String,
    val mondaySpendMin: Long,
    val tuesday: String,
    val tuesdaySpendMin: Long,
    val wednesday: String,
    val wednesdaySpendMin: Long,
    val thursday: String,
    val thursdaySpendMin: Long,
    val friday: String,
    val fridaySpendMin: Long,
    val saturday: String,
    val saturdaySpendMin: Long,
    val sunday: String,
    val sundaySpendMin: Long,
    val idTimeSheet: TimeSheet
) : BaseEntity() {}

object Weeks : Table() {
    val id = long("id").primaryKey().autoIncrement()
    val monday = varchar("monday", 255)
    val mondaySpendMin = long("mondaySpendMin")
    val tuesday = varchar("monday", 255)
    val tuesdaySpendMin = long("tuesdaySpendMin")
    val wednesday = varchar("monday", 255)
    val wednesdaySpendMin = long("wednesdaySpendMin")
    val thursday = varchar("monday", 255)
    val thursdaySpendMin = long("thursdaySpendMin")
    val friday = varchar("monday", 255)
    val fridaySpendMin = long("fridaySpendMin")
    val saturday = varchar("monday", 255)
    val saturdaySpendMin = long("saturdaySpendMin")
    val sunday = varchar("monday", 255)
    val sundaySpendMin = long("sundaySpendMin")
    val idTimeSheet = long("idTimeSheet")
}