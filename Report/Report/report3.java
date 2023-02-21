//class Exercise6_17 {
//
//    static int [] shuffle(int[]arr){
//        int j = (int)(Math.random()*9)+1;
//        for (int i=0; i < arr.length; i++){
//            arr[i] = arr[j];
//        }
//        return arr;
//    }
//
//    public static void main(String[] args) {
//        int[] original = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
//        System.out.println(java.util.Arrays.toString(original));
//
//        int[] result = shuffle(original);
//        System.out.println(java.util.Arrays.toString(result));
//    }
//}

//class Exercise6_18 {
//
//    static boolean isNumber (String str){
//        boolean isNumber = true;
//        for(int i=0; i<str.length(); i++){
//            if (!(str.charAt(i) >='0'&& str.charAt(i) <= '9')){
//                isNumber =false;
//            }
//        } return isNumber;
//    }
//
//    public static void main(String[] args) {
//        String str = "123";
//        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
//        str = "1234o";
//        System.out.println(str + " 는 숫자입니까? " + isNumber(str));
//    }
//}
////예상 결과 : 123는 숫자입니까? true, 1234o는 숫자입니까? false

//class MyTv {
//    boolean isPowerOn;
//    int channel;
//    int volume;
//    final int MAX_VOLUME = 100;
//    final int MIN_VOLUME = 0;
//    final int MAX_CHANNEL = 100;
//    final int MIN_CHANNEL = 1;
//    void turnOnOff() {
//        isPowerOn = !isPowerOn;
//    }
//    void volumeUp() {
//        if (volume < MAX_VOLUME)
//        volume++;
//        // (2) volume의 값이 MAX_VOLUME보다 작을 때만 값을 1 증가시킨다.
//    }
//    void volumeDown() {
//        if (volume > MIN_VOLUME)
//        volume--;
//        // (3) volume의 값이 MIN_VOLUME보다 클 때만 값을 1 감소시킨다.
//    }
//    void channelUp() {
//        if (channel > MAX_CHANNEL){
//            channel = MAX_CHANNEL;
//        }else {
//            channel++;
//        }
//
//        // (4) channel의 값을 1 증가시킨다.
//        // 만일 channel이 MAX_CHANNEL이면 , channel의 값을 MIN_CHANNEL로 바꾼다.
//    }
//    void channelDown() {
//        if (channel < MIN_CHANNEL){
//            channel = MAX_CHANNEL;
//        }else {
//            channel--;
//        }
//        // (5) channel의 값을 1 감소시킨다 .
//        // 만일 channel이 MIN_CHANNEL이면, channel의 값을 MAX_CHANNEL로 바꾼다.
//    }
//}
//
//class Exercise6_19 {
//    public static void main(String args[]) {
//        MyTv t = new MyTv();
//        t.channel = 100;
//        t.volume = 0;
//        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//        t.channelDown();
//        t.volumeDown();
//        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//        t.volume = 100;
//        t.channelUp();
//        t.volumeUp();
//        System.out.println("CH:" + t.channel + ", VOL:" + t.volume);
//    }
//}
//
////예상 결과 : CH: 100, VOL: 0 / CH: 99, VOL: 0 / CH: 100, VOL: 100

//class Exercise6_20 {
//
//    static int max (int[] arr) {
//            if (arr.length == 0 || arr == null)
//                return -999999;
//                int max = arr[0];
//                for (int i = 1; i < arr.length; i++) {
//                    if (max > arr[i])
//                        max = arr[i];
//                    }
//        return max;
//    }
//    /* (1) max 메서드를 작성하시오 . */
//    public static void main(String[] args) {
//        int[] data = {3,2,9,4,7};
//        System.out.println(java.util.Arrays.toString(data));
//        System.out.println("최대값 :"+max(data));
//        System.out.println("최대값 :"+max(null));
//        System.out.println("최대값  :"+max(new int[]{})); // 크기가 0인 배열  }
//    }
//}

//예상 결과 : 최대값: 9 / 최대값: -99999 최대값: -999999

//class Exercise6_21 {
//    static int abs (int value) {
//        if (value < 0) {
//            value = -value;
//        }
//        return value;
//    }
//
//    /* (1) abs 메서드를 작성하시오. */
//    public static void main(String[] args) {
//        int value = 5;
//        System.out.println(value + "의 절대값 :" + abs(value));
//        value = -10;
//        System.out.println(value + "의 절대값 :" + abs(value));
//    }
//}
////예상 결과 : 5의 절대값 : 5 / -10의 절대값 : 10
