package dao.DBConnector

import org.jetbrains.exposed.sql.Database
import java.io.File

object  DatabaseFactory{
    val dbPath = "dao" + File.separator + "database" + File.separator
    val dbName = "TSR.db"
    val dbFullName = dbPath + dbName

    fun initDB() {
        Database.connect("jdbc:sqlite:$dbFullName", "org.sqlite.JDBC")
    }
}