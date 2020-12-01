package animal;

public class Main {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.setAge(15);
        a.setName("Vasily");
        a.setTail(true);

        Animal b = new Animal();
        b.setAge(15);
        b.setName("Vasily");
        b.setTail(true);

        System.out.println(a.toString());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
    }
}
