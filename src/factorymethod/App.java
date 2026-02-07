package factorymethod;

import factorymethod.transport.MongoDBTransport;
import factorymethod.transport.MysqlTransport;
import factorymethod.transport.PostgresTransport;
import factorymethod.transport.Transport;

public class App {

    public static void main(String[] args) {
        Transport mongoTransport = new MongoDBTransport();
        mongoTransport.execute("db.users.find()");

        System.out.println("---");

        Transport postgresTransport = new PostgresTransport();
        postgresTransport.execute("SELECT * FROM users");

        System.out.println("---");

        Transport mysqlTransport = new MysqlTransport();
        mysqlTransport.execute("SELECT * FROM users");
    }
}