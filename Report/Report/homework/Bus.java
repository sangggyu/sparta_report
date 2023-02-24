package homework;


public class Bus extends transportation{
    boolean status;
    int MaxPassenger = 30; //최대탑승인원
    int price = 1000; //버스비

//    public int getBusNum() {
//        return Num;
//    }

    public void setBusNum(int busNum) {
        this.Num = busNum;
    }

//    public int getGasAmount() {
//        return GasAmount;
//    }

    public int setGasAmount(int gasAmount) {
        GasAmount = gasAmount;
        if (gasAmount < 10) {
            System.out.println("주유가 필요합니다.");
            System.out.println("주유량 :" + gasAmount);
        } else if (gasAmount < MaxGasAmount)
            System.out.println("주유량 :" + gasAmount);
        return GasAmount;

    }

//    public int getSpeed() {
//        return speed;
//    }

//    public void setSpeed(int speed) {
//        this.speed = speed;
//        if (speed > 10) {
//            System.out.println("다음 정류장 이동중 입니다.");
//        } else if (speed == 0) {
//            System.out.println("정차중 입니다.");
//        }
//    }


    public void setPassenger(int passenger) { //탑승 승객수
        this.Passenger = passenger;
        if (passenger < MaxPassenger) {
            nowPassenger = passenger;
            MaxPassenger -= passenger;
            totalprice = price * passenger;
            System.out.println(Passenger + "명 탑승합니다.");
            System.out.println("요금은" + totalprice + "원 입니다.");
            System.out.println("현재 승객 수는 " + nowPassenger + "명 입니다.");
            System.out.println("잔여 좌석 수는 " + MaxPassenger + "석 입니다.");
            super.nowPassenger = 0;
            this.MaxPassenger = 30;
        } else if (passenger > MaxPassenger) {
            System.out.println("만석 입니다.");
            return;
        } else {
            System.out.println("운행중이 아닙니다.");
        }

    }
    public void power() {
        status = !status;
    }
    public void statusMode() {
        if(!status){
            System.out.println("운행");
        } else {
            System.out.println("차고지행");

        }
    }



}













