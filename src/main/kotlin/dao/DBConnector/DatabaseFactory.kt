package dao.DBConnector

import com.zaxxer.hikari.HikariConfig
import com.zaxxer.hikari.HikariDataSource
import org.jetbrains.exposed.sql.Database

object DatabaseFactory {
    private val dbFullName = "E:/Projects/TSR/src/main/resources/TSR.db"

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