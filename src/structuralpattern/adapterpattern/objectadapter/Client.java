package structuralpattern.adapterpattern.objectadapter;

public class Client {
    public static void main(String[] args) {
        Ps2 ps2 = new Adapter(new Usber());
        ps2.isPs2();
    }
}
