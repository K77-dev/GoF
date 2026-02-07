package factorymethod.transport;

import factorymethod.database.IDatabase;
import factorymethod.database.Postgres;

public class PostgresTransport extends Transport {

    @Override
    protected IDatabase createDatabase() {
        return new Postgres();
    }
}
