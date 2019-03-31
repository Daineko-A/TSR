package dao.entitys

import dao.entitys.common.BaseEntity

data class User(override var id: Long,
           var firstName: String,
           var lastName: String,
           var accountName: String
) : BaseEntity() {

}