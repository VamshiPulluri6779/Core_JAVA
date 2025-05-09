package SingletonClass.BillPugh;

public class DBConnection {

    private DBConnection(){}

    // This will get loaded only once when the class is called, hence it is memory saving
    private static class DBConnectionHelper {
        private static final DBConnection CONNECTION_INSTANCE = new DBConnection();
    }

    public static DBConnection getInstance() {
        return DBConnectionHelper.CONNECTION_INSTANCE;
    }
}
