package SingletonClass.LazyInitialization;

public class DBConnection {

    private static DBConnection dbConnectionObj;

    private DBConnection() {
        // private constructor
    }

    /*
        * This is lazy as we create the object only if this method is called and there is no object
        * created before
     */
    public static DBConnection getInstance() {
        if (dbConnectionObj == null) {  // If 2 threads come at some time, they will end up creating 2 objects
            dbConnectionObj = new DBConnection();
        }
        return dbConnectionObj;
    }
}
