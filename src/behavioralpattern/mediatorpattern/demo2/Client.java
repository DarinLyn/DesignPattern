package behavioralpattern.mediatorpattern.demo2;

public class Client {
    public static void main(String[] args) {
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("Darin", mediator);
        Tenant tenant = new Tenant("Daisy", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);

        tenant.contact("you get house to rent?");
        houseOwner.contact("you wanna rent?");
    }
}
