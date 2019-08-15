package structuralpattern.adapterpattern.classadapter;

public class Usber implements Usb {
    @Override
    public void isUsb() {
        System.out.println("this is a USB");
    }
}
