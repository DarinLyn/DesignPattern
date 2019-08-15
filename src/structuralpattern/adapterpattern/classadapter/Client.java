package structuralpattern.adapterpattern.classadapter;

public class Client {
    public static void main(String[] args) {
        Ps2 p = new Adapter();
        p.isPs2();
    }
}
