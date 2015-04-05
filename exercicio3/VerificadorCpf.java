import java.util.Scanner;

public class VerificadorCpf {
        
        String pconvert;
        int numero[] = new int[11];
        int resultado[] = new int[11];
        int peso[] = new int[11];
        int i, soma=0;
        int x = 2; 
        int verificador;
   
    public void AchaX(){
        
        
        //inserindo os valor na String
        Scanner valor = new Scanner(System.in);
        System.out.println("Digite os primeiros 9 digitos do seu cpf: ");
        pconvert = valor.next();

        //valor cpf
        //Converter o valor da String para um vetor
        for (i=8; i>=0; i--) {
            //Aqui você pega os valores da string, dividi ela em chars, e transforma cada "letra" em um valor numerico que será jogada no vetor v[] que é um inteiro
            numero[i] = Character.getNumericValue(pconvert.charAt(i));
            //System.out.println("Vetor: " + numero[i]);
        }
            
        
        //valor n de 2 a 10
            for (i=8; i>=0; i--){
                peso[i] = x;
                x++;
                //System.out.println("Vetor n: " + peso[i]); 
            }
        
        //multiplicação ente os vetores
            for (i=8; i>=0; i--){
                resultado[i] = numero[i] * peso[i];
                //System.out.println("Resultado da multiplicação " + resultado[i]); 
            }
       
        //soma do vetor resultado
            for (i=0 ; i<=8; i++){
                soma+=resultado[i];   
            }
        //System.out.println("Resultado da soma " + soma); 
        
        //verificando x
        verificador = soma%11;
    
        if(verificador<2){
            i=9;
            numero[i]=0;
            //System.out.println("1º verificador: " + numero[i]);
        }
        else{
            numero[i]= 11-verificador;
            //System.out.println("2º verificador: " + numero[i]);
        }
        //System.out.println("CPF: ");
        for(i=0;i<11;i++){
            //System.out.println("" + numero[i]);
        }
    }
    
    public void AcharY (){
        x=2;   
        for (i=9;i>=0;i--){
                peso[i] = x;
                x++;
            }
        //multiplicação ente os vetores
            for (i=9;i>=0;i--) {
                resultado[i]= numero[i] * peso[i];
            }
            soma=0;
        //somar os elementos de resultado[i]   
            for (i=0;i<10; i++) { 
                soma+=resultado[i];
            }   
        //verificando y
        verificador = soma%11;
        if(verificador<2){
            i=10;
            numero[i]=0;
            //System.out.println("2º verificador: " + numero[i]);
        }
        else{
            numero[i]= 11-verificador;
            //System.out.println("2º verificador: " + numero[i]);
        }
        System.out.println("CPF: ");
        for(i=0;i<11;i++){
            System.out.print("" + numero[i]);
        }

    }       

    public static void main(String[] args) {
        VerificadorCpf gera = new VerificadorCpf();
        
        gera.AchaX();
        gera.AcharY();
        
    }

}
