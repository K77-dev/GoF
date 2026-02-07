package _01_factory_method.transport;

import _01_factory_method.database.IDatabase;
import _01_factory_method.database.Postgres;

public class PostgresTransport extends Transport {

    @Override
    protected IDatabase createDatabase() {
        return new Postgres();
    }
}
