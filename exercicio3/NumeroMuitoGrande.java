import java.util.Scanner;

public class NumeroMuitoGrande {

    public int[] soma = new int[30];
    //public int[] multiplicacao = new int[30];
    public int[] v1 = new int[30];
    public int[] v2 = new int[30];
    String num1, num2;

    public void inserir() {

        //insere valores como strings
        Scanner input = new Scanner(System.in);
        System.out.println("1º número: ");
        num1 = input.next();
        System.out.println("2º número: ");
        num2 = input.next();
        
        //converter os números de char para int
        int t1 = num1.length();
        for (int i=t1, j=0; i>0; i--, j++) {
            char caracter = num1.charAt(j);
            v1[30-i] = Character.getNumericValue(caracter);
        }
        int tamanho2 = num2.length();
        for (int i = tamanho2, j=0; i>0; i--, j++) {
            char caracter = num2.charAt(j);
            v2[30-i] = Character.getNumericValue(caracter);
        }
    }

    public void somaV() {

        int vai = 0, flag=0;
            //soma dos elementos dos vetores
           for (int i=29; i>=0 ;i--){
            soma[i]= ((v1[i]+v2[i]+vai)%10);
            vai=((v1[i]+v2[i]+vai)/10);
            }
        //impressão do resultado da soma
        System.out.print ("Resultado: ");
        for (int i = 0; i <= 29; i++) {
            if (soma[i]==0 && flag==0 ) {
                if (soma[i+1] != 0)
                    flag=1;
            }
            else 
                System.out.print(soma[i]);
        }
    }

    public static void main(String[] args) {

        NumeroMuitoGrande rs = new NumeroMuitoGrande();
        rs.inserir();
        rs.somaV();

    }

}
