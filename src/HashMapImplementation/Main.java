package HashMapImplementation;

import java.security.NoSuchAlgorithmException;

public class Main {
    public static void main(String[] args) throws NoSuchAlgorithmException {

        MyHashMap<Integer, String> hashMap = new MyHashMap();
        hashMap.put(1, "hello");
        hashMap.put(2, "world");
        hashMap.put(3, "java");
        hashMap.put(4, "code");
        hashMap.put(5, "example");
        hashMap.put(6, "test");
        hashMap.put(7, "random");
        hashMap.put(8, "string");
        hashMap.put(9, "value");
        hashMap.put(10, "hashmap");
        hashMap.put(11, "key");
        hashMap.put(12, "valuepair");
        hashMap.put(13, "data");
        hashMap.put(14, "structure");
        hashMap.put(15, "collection");
        hashMap.put(16, "map");

        for(Pair<Integer, String> item : hashMap.entrySet()) {
            System.out.println("Key: " + item.getKey() + ", Value: " + item.getValue());
        }

        System.out.println(hashMap.get(9));
        System.out.println(hashMap.size);
    }
}
