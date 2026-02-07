package _01_factory_method.database;

public class Postgres implements IDatabase {
    @Override
    public void connect() {
        System.out.println("Connecting to PostgreSQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from PostgreSQL database...");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query on PostgreSQL database: " + query);
    }
}
