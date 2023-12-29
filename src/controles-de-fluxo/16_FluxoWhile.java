public class FluxoWhile {
    public static void main(String[] args) {
        int i=0;
            while(i<10){ // Conta de 1 em 1 de forma crescente.
                System.out.print(i+" ");
                i++;
            }
        System.out.println();
            i=0;
        while(i<10){ // Conta de 2 em 2 de forma crescente.
            System.out.print(i+" ");
            i+=2;
        }
        System.out.println();
        i--; // i = i-1
        while(i>=0){ // Conta de 1 em 1 de forma decrescente.
            System.out.print(i+" ");
            i--;
        }
        System.out.println();
        i=9;
        while(i>=0){ // Conta de 2 em 2 de forma decrescente.
            System.out.print(i+" ");
            i-=2; // i = i -2
        }

    }
}
