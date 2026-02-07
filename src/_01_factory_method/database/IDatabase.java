package _01_factory_method.database;

public interface IDatabase {
    void connect();
    void disconnect();
    void executeQuery(String query);
}
