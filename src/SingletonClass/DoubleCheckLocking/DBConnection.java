package SingletonClass.DoubleCheckLocking;

/*
    * Disadvantage of double locking is it has memory issues at core-cache level, when there is delay
    * in cache-syncing between the cores and also in the case of updating memory when object is
    * created
    *
    * Hence, we have to use volatile for DBConnection object, so that all the read or writes to that
    * object go through main memory and not the cache
 */
public class DBConnection {

    private static volatile DBConnection connectionInstance;

    private DBConnection() {}

    // When 2 threads come simultaneously to get the instance of this class, only one gets lock over
    // the class and creates the instance, while the other thread waits for the lock to be released
    // Once the lock is released, the other thread checks if the instance is already created or not
    public static DBConnection getInstance(){
        if(connectionInstance == null){  // first level check
            synchronized (DBConnection.class){    // synchronized block
                if(connectionInstance == null){   // second level check
                    connectionInstance = new DBConnection();
                }
            }
        }
        return connectionInstance;
    }
}
