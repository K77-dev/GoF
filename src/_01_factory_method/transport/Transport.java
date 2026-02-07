package _01_factory_method.transport;

import _01_factory_method.database.IDatabase;

public abstract class Transport {

    protected abstract IDatabase createDatabase();

    public void execute(String query) {
        IDatabase db = createDatabase();
        db.connect();
        db.executeQuery(query);
        db.disconnect();
    }
}
