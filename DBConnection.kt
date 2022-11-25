package app

import java.sql.Connection
import java.sql.DriverManager

class DbConnection {
    fun connect(): Connection {
        val dburl ="jdbc:mysql://localhost:3306/kotlindb"
        val connection= DriverManager.getConnection(dburl,"root","Swarn@19")
        return connection
    }
}