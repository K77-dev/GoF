package factorymethod.database;

public interface IDatabase {
    void connect();
    void disconnect();
    void executeQuery(String query);
}
