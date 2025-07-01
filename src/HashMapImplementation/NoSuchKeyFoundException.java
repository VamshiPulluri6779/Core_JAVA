package HashMapImplementation;

public class NoSuchKeyFoundException extends RuntimeException {

    public NoSuchKeyFoundException(String key) {
        System.out.println("No such key found: " + key);
    }
}
