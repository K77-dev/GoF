package factorymethod.transport;

import factorymethod.database.IDatabase;
import factorymethod.database.MongoDB;

public class MongoDBTransport extends Transport {

    @Override
    protected IDatabase createDatabase() {
        return new MongoDB();
    }
}
