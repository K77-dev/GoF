package factorymethod.transport;

import factorymethod.database.IDatabase;
import factorymethod.database.Mysql;

public class MysqlTransport extends Transport{
    @Override
    protected IDatabase createDatabase() {
        return new Mysql();
    }
}
