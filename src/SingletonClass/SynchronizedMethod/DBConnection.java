package SingletonClass.SynchronizedMethod;

public class DBConnection {
    private static DBConnection dbConnectionObj;

    private DBConnection() {
        // private constructor
    }

    synchronized public static DBConnection getInstance() {
        if (dbConnectionObj == null) {
            dbConnectionObj = new DBConnection();
        }
        return dbConnectionObj;
    }
}
