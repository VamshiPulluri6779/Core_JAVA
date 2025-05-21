package HashMapImplementation;

import java.math.BigInteger;

public class Node <K,V>{

    public BigInteger getHash() {
        return hash;
    }

    public void setHash(BigInteger hash) {
        this.hash = hash;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    public Node<K, V> getNext() {
        return next;
    }

    public void setNext(Node<K, V> next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node {" +
                " hash=" + hash +
                ", key=" + key +
                ", value=" + value +
                ", next=" + next +
                " }";
    }

    public Node(BigInteger hash, K key, V value, Node<K, V> next) {
        this.hash = hash;
        this.key = key;
        this.value = value;
        this.next = next;
    }

    BigInteger hash;
    K key;
    V value;
    Node<K,V> next;
}
