public class OP_Ternario {
    // expressão ? true: false;
    String maiorDeIdade(int idade){
        // return (idade>=18) ? "Maior de idade.": "Menor de idade.";
        String str = (idade>=18) ? "Maior de idade.": "Menor de idade.";
        return str;
        /*
        if(idade>=18){
            return "Maior de idade.";
        }else{
            return "Menor de idade.";
        }

         */
    }
    public static void main(String[] args) {
        int x = 46;
        String z = new OP_Ternario().maiorDeIdade(x);
        System.out.println(z);
    }
}
