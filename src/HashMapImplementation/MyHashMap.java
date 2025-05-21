package HashMapImplementation;


import java.math.BigInteger;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class MyHashMap<K,V> {

    int size = BigInteger.valueOf(16).intValue();
    private float loadFactor = 0.75f;
    private static int counter = 0;
    private Node<K,V>[] nodes = new Node[size];
    private List<Pair<K,V>> entrySet = new ArrayList<>();

    public MyHashMap() {
        System.out.println("Created MyHashMap with size : " + size + " and load factor : "+ loadFactor);
    }

    public MyHashMap(int size, float loadFactor){
        this.size = size;
        this.loadFactor = loadFactor;
    }

    public V get(K key) throws NoSuchAlgorithmException{
        BigInteger hashValue = getHashCode(key);
        int bucket = hashValue.mod(BigInteger.valueOf(size)).intValue();
        Node<K,V> node = nodes[bucket];
        if(node.getHash().equals(hashValue) && node.getKey() == key) return node.getValue();
        while(node.next != null){
            if(node.getKey() == key) return node.getValue();
            node = node.next;
        }
        return null;
    }

    public void put(K key, V value) throws NoSuchAlgorithmException{
        BigInteger hashValue = getHashCode(key);
        int bucket = hashValue.mod(BigInteger.valueOf(size)).intValue();
        Node<K,V> node = nodes[bucket];

        if(node == null){
            this.nodes[bucket] = new Node<>(hashValue, key, value, null);
            counter++;
        } else{
            while(node.next != null){
                if(node.getKey() == key) {
                    node.setValue(value);
                    break;
                }
                node = node.next;
            }
            node.next = new Node<>(hashValue, key, value, null);
            counter++;
        }
        entrySet.add(new Pair<>(key, value));

        if(counter == size * loadFactor){
            counter = 0;
            reHashTheMap();
        }
    }

    public void reHashTheMap() throws NoSuchAlgorithmException {
        System.out.println("Rehashed the whole map");
        size = size * 2;
        nodes = new Node[size];
        List<Pair<K,V>> newEntrySet = entrySet;
        entrySet = new ArrayList<>();
        for(Pair<K,V> pair : newEntrySet){
            put(pair.getKey(), pair.getValue());
        }
    }

    public BigInteger getHashCode(K key) throws NoSuchAlgorithmException {
        HashFunction hashFunction = HashFunction.getInstance();
        return hashFunction.getHashValue(key);
    }

    public int size(){
        return this.nodes.length;
    }

    public Node<K,V> getNode(int index){
        return this.nodes[index];
    }
}
