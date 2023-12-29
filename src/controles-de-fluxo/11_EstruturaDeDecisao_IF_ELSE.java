public class EstruturaDeDecisao {
    void media(float nota){
        if(nota>=7){
            System.out.println("Aluno aprovado");
        }else if(nota>=4 && nota<=6.99){
            System.out.println("O aluno está de recuperação");
        }
        else{
            System.out.println("Aluno está reprovado");
        }
    }
    public static void main(String[] args) {
        float a= 9f,b=8f,c=6f,d=5f;
        float media = (a+b+c+d)/4;
        System.out.println("A média do aluno é: "+media);
        new EstruturaDeDecisao().media(media);
    }
}
