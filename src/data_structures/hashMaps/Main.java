package data_structures.hashMaps;

public class Main {
    public static void main(String[] args) {
        MyHashMap obj = new MyHashMap();
        obj.put(2,2);
        obj.put(1,1);
        System.out.println(obj.get(1));
        System.out.println(obj.get(3));
        obj.remove(1);
        System.out.println(obj.get(1));
    }
}
