package homework;

public class BusTest {
    public static void main(String[] args) {
        Bus bus1 = new Bus();
        System.out.println("bus1 주유량=" + bus1.MaxGasAmount );
        Bus bus2 = new Bus();
        System.out.println("bus2 주유량=" + bus2.MaxGasAmount );

        bus1.setBusNum(1);
        bus1.setPassenger(2);
        bus1.setGasAmount(50);

        bus1.power();
        bus1.statusMode();

        bus1.setGasAmount(60);
        bus1.power();
        bus1.statusMode();
        bus1.setPassenger(45);

        bus1.setPassenger(5);
        bus1.setGasAmount(5);


    }
}
