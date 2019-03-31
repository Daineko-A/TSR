package dao.entitys

import dao.entitys.common.BaseEntity
import java.time.DayOfWeek
import java.time.Year

data class TimeSheet(override var id: Long,
                     var year: Year,
                     var week: DayOfWeek) : BaseEntity() {
}