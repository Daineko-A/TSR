package dao.DBConnector

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database
import java.io.File

object DatabaseFactory {
    private val dbPath = "." + File.separator
    private val dbName = "TSR.db"
    private val dbFullName = dbPath + dbName

    private fun sourceDB(): HikariDataSource {
        val config = HikariConfig()
        config.driverClassName = "org.sqlite.JDBC"
        config.jdbcUrl = "jdbc:sqlite:$dbFullName"
        config.transactionIsolation = "TRANSACTION_SERIALIZABLE"

        config.validate()
        return HikariDataSource(config)
    }

    fun connect(): Database {
        return Database.connect(sourceDB())
    }

}