package homework;

public class TaxiTest {

    public static void main(String[] args) {

        Taxi taxi1 = new Taxi();
        System.out.println("taxi1 주유량=" + taxi1.MaxGasAmount);
        Taxi taxi2 = new Taxi();
        System.out.println("taxi2 주유량=" + taxi2.MaxGasAmount);

        taxi2.setGasAmount(100);

        taxi2.power();
        taxi2.statusMode();
        taxi2.board(2,"서울역",2);

        taxi2.power();
        taxi2.statusMode();
        taxi2.setGasAmount(20);
        taxi2.pay();

        taxi2.board(5,"구로디지털단지역",12);
        taxi2.setGasAmount(0);
        taxi2.power();
        taxi2.statusMode();
        taxi2.pay();


    }
}