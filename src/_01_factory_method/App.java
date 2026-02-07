package _01_factory_method;

import _01_factory_method.transport.MongoDBTransport;
import _01_factory_method.transport.MysqlTransport;
import _01_factory_method.transport.PostgresTransport;
import _01_factory_method.transport.Transport;

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