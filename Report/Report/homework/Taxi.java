package homework;

public class Taxi extends transportation {
//    String destination;            // 목적지
//    int distance;                // 목적지까지 거리
    int maxPass = 4;            // 최대 승객수
//    int defaultDistance = 1;    // 기본 거리
    int defaultCost = 3000;        // 기본 요금
    int perDistance = 1000;        // 거리당 요금
    int price;                    // 승객이 지불할 금액
    boolean status;



    public int setGasAmount(int gasAmount) {
        GasAmount = gasAmount;
        if (gasAmount < 10) {
            System.out.println("주유량 :" + gasAmount);
        } else if (gasAmount <= MaxGasAmount)
            System.out.println("주유량 :" + gasAmount);
        return GasAmount;

    }

    void board(int Passenger, String destination, int distance) {
        if (distance == 1)
            price = defaultCost + (perDistance * distance);
        else
            price = defaultCost + (perDistance * (distance - 1));

        System.out.println("탑승 승객 수 = " + Passenger); // + 탑승승객
        System.out.println("잔여 승객 수 = " + (maxPass - Passenger));//최대 승객수 - 탑승승객
        System.out.println("기본 요금 확인 = " + defaultCost); // 기본요금
        System.out.println("목적지 = " + destination); // 목적지
        System.out.println("목적지까지 거리 = " + distance + "km"); //목적지까지 거리
        System.out.println("지불할 요금 = " + price);
        totalprice += price;
    }


    public void power() {
        status = !status;
    }

    public void statusMode() {
        if (!status) {
            System.out.println("상태:" + "운행중");
        } else {
            System.out.println("상태:" + "일반");
        }
    }

    int pay() {
        System.out.println("누적 요금:" + totalprice);
        if (GasAmount == 0) {
            System.out.println("주유 필요");
            System.out.println("운행불가");
        }
        return totalprice;
    }
}






