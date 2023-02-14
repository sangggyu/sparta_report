public class Report4 {
    public static void main(String[] args) {

    byte b = 10;
    char ch = 'A';
    int i = 100;
    long l = 1000L;
//3-1. 다음 중 형변환을 생략할 수 있는 것은? (모두 고르시오)
        b = (byte)i;
        // Byte는 1byte 인트는 4byte라 불가능
        ch = (char)b;
        // 바이트가 더 낮지만 음수가 없어서 생략 불가능
        short s = (short)ch;
        // 바이트는 똑같지만 음수가 없어서 생략불가능
        float f = (float)l;
        //생략가능
        i = (int)ch;
        // 생략가능

    }
}