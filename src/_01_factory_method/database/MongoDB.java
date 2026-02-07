package _01_factory_method.database;

public class MongoDB implements IDatabase {
    @Override
    public void connect() {
        System.out.println("Connecting to MongoDB database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting from MongoDB database...");
    }

    @Override
    public void executeQuery(String query) {
        System.out.println("Executing query on MongoDB database: " + query);
    }
}
