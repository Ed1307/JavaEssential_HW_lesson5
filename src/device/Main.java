package device;

public class Main {
    public static void main(String[] args) {
        Device d = new Device("manufacturer1", 15.5F, 123);
        Monitor m = new Monitor("Japan", 16.5F, 1234, 1270, 550);
        EthernetAdapter e = new EthernetAdapter("China", 550.5F, 1234, 2000, "mac");

        Device d2 = new Device("manufacturer1", 15.5F, 123);
        Monitor m2 = new Monitor("Japan", 16.5F, 1234, 1270, 550);
        EthernetAdapter e2 = new EthernetAdapter("China", 550.5F, 1234, 2000, "mac");

        System.out.println(d.hashCode());
        System.out.println(d.toString());
        System.out.println(d.equals(d2));

        System.out.println(m.hashCode());
        System.out.println(m.toString());
        System.out.println(m.equals(m2));

        System.out.println(e.hashCode());
        System.out.println(e.toString());
        System.out.println(e.equals(e2));
    }
}
