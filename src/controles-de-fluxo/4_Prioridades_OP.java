public class Prioridades_OP {
    public static void main(String[] args) {
        // Precedências de sinais
        // divisão /
        // multiplicação *
        // resto da divisão %
        // adição e subtração + -
        int x = 10/2*((3+4)*3); // 10/2*7*3 // 5*7*3 = 35*3 = 105
        System.out.println(x);

        int a = 6*(3+2); // 30
        System.out.println(a);

        int b =20, c= 30, d= 40;
        System.out.println(d/(b+c)); // 40/ 50
    }
}
