class Report5{
    public static void main(String[] args){
        int x = 2;
        int y = 5;
        char c = 'A'; // 'A'의 문자코드는 65

        System.out.println(y >= 5 || x < 0 && x > 2);//true 연산자 순서대로 계산
        System.out.println(y += 10 - x++);  //13 x 후위형이라 아래로 내려감
        System.out.println(x += 2); //1+2 =5
        System.out.println(!('A' <= c && c <= 'Z'));  //false (원래 값은 true인데 !로 바뀌어서)
        System.out.println('C' - c); // 아스키 코드 67 - 65 = 2
        System.out.println('5' - '0'); // 아스키 코드 53- 48 = 5
        System.out.println(c + 1); //66
        System.out.println(++c); //B 1+65
        System.out.println(c++); //B C= 66
        System.out.println(c); //C c + 1
    }
}