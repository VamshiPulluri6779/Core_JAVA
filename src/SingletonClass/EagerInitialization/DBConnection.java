package SingletonClass.EagerInitialization;

/*
    * This is eager because, as soon as application starts all the static things are loaded into memory.
    *
    * Disadvantage: Even If the object is not used, it will still be created and memory will be wasted, hence we go for lazy initialization.
 */
public class DBConnection {

    // Any outside class can't access this as it is private
    private static DBConnection dbConnectionObj = new DBConnection();

    // This constructor is private so that no other class can create an object of this class
    private DBConnection() {
    }

    // Every time this method is called, it will return the same object
    public static DBConnection getInstance() {
        return dbConnectionObj;
    }
}
