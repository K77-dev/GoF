package _01_factory_method.transport;

import _01_factory_method.database.IDatabase;
import _01_factory_method.database.MongoDB;

public class MongoDBTransport extends Transport {

    @Override
    protected IDatabase createDatabase() {
        return new MongoDB();
    }
}
