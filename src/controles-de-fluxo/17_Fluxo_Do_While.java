public class Fluxo_Do_While {
    public static void main(String[] args) {
        int a=0;
        do{
            System.out.print(a+" "); // Contagem de 1 em 1 de forma crescente.
            a++;
        }while(a<10);
        System.out.println();
        int b=0;
        do{
            System.out.print(b+" "); // Contagem de 2 em 2 de forma crescente.
            b+=2;
        }while(b!=10);
        System.out.println();
        int c=9;
        do{
            System.out.print(c+" "); // Contagem de 1 em 1 de forma decrescente.
            c--;
        }while(c>=0);
        System.out.println();
        int d=9;
        do{
            System.out.print(d+" "); // Contagem de 2 em 2 de forma decrescente.
            d-=2;
        }while(d>=0);


        for(int k=0;k==8;k++){
            System.out.println("Imprimindo FOR");
        }
        int e=0;
        while (e ==8){
            System.out.println("Imprimindo WHILE");
        }
        System.out.println();
        int f=0;
        do{
            System.out.println("Imprimindo DO...WHILE");
        }while(f==8);
    }
}
