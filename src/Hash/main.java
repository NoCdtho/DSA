package Hash;

public class main {
    public static void main(String[] args) {
//        mapUsingHash map = new mapUsingHash();
//
//        map.put("Mango", "King of fruits");
//        map.put("Apple", "A sweet red fruits");
//        map.put("Litchi", "Kunal's fav fruit");
//
//        System.out.println(map.get("Apple"));
//        System.out.println(map.get("Mango"));

        hashMapChaining<String, String> map = new hashMapChaining<>();
        map.put("Mango", "King of fruits");
        map.put("Apple", "A sweet red fruits");
        map.put("Litchi", "Kunal's fav fruit");

        System.out.println(map.get("Apple"));
    }
}
