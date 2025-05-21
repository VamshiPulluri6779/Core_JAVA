package HashMapImplementation;


import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashFunction {

    private static HashFunction hashFunction;

    private HashFunction(){}

    public <T> BigInteger getHashValue(T key) throws NoSuchAlgorithmException {
        // Get an instance of SHA-256
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        // Normalize the key and convert it to bytes using UTF-8 encoding
        byte[] hashBytes = digest.digest(key.toString().trim().getBytes(StandardCharsets.UTF_8));
        // Convert the byte array to a positive BigInteger
        BigInteger hashNumber = new BigInteger(1, hashBytes);
        // Return only the numeric part of the hash
        return new BigInteger(hashNumber.toString().replaceAll("\\D", ""));
    }

    public static HashFunction getInstance(){
        if(hashFunction == null)
            hashFunction = new HashFunction();
        return hashFunction;
    }
}
