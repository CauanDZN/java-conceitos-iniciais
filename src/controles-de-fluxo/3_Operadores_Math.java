public class Operadores_Math {
    public static void main(String[] args) {
        System.out.println("5 + 2 = " +(5+2));
        System.out.println("5 - 2 = " +(5-2));
        System.out.println("5 * 2 = " +(5*2));
        System.out.println("5 / 2 = " +(5/2));
        System.out.println("5 % 2 = " +(5%2));
        float a = 5.0f;
        float b = 2.0f;
        System.out.println("A / B = "+(a/b));

        int x= 10;
        int y = 20;
        //x = x + y;
        x+=y;
        x+=100;
        System.out.println(x);
        y++;
        y = y + 1;
        y+=1;
        System.out.println(y); // 23
    }
}
