package factorymethod.database;

public class Mysql implements IDatabase {

    @Override
    public void connect() {
        System.out.println("Connecting to MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MySQL database...");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query on Mysql database: " + query);
    }
}
