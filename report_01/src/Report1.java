public class Report1 {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static class Report1 {

        //2-4. 다음 중 변수를 잘못 초기화 한 것은?
        byte b = 56; //byte 값을 넘어가서
        char c = 'b'; // 빈문자열이 안되서
        char answer = 'n'; // 문자안에 두개가 있어서
        float f = 3.14f; // float는 접미사가 필요해서
        double d = 1.4e3; // 접미사가 잘못 표시되서 삭제하면 double

    }
}