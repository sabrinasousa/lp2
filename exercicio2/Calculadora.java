package cpf;

import java.util.Scanner;

public class Cpf {
    int n = 11;
        String pconvert;
        int numero[] = new int[n];
        int resultado[] = new int[n];
        int peso[] = new int[n];
        int i, soma=0;
        int j = 2; 
        int x;
        int verificador ; 
        int y; 
       
        
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
            System.out.println("Vetor: " + numero[i]);
        }
            
        
        //valor n de 2 a 10
            for (i=8; i>=0; i--){
                peso[i] = j;
                j++;
                System.out.println("Vetor n: " + peso[i]); 
            }
        
        //multiplicação ente os vetores
            for (i=8; i>=0; i--){
                resultado[i] = numero[i] * peso[i];
                System.out.println("Resultado da multiplicação " + resultado[i]); 
            }
       
        //soma do vetor resultado
            for (i=0 ; i<=8; i++){
                soma+=resultado[i];   
            }
        System.out.println("Resultado da soma " + soma); 
        
        //verificando x
        verificador = soma%11;
        System.out.println("verificador = " + verificador);
        
        if (verificador<2){
            x=0;
            System.out.println("x = " + x);
            numero[9]= x; 
            
            for (i=9; i>=0; i--) {
            System.out.println("Vetor: " + numero[i]);
        }
            
             
        
        }
        else {
            x= 11-10;
            System.out.println("x = " + x);
            numero[9]= x;  
            
             for (i=9; i>=0; i--) {
            System.out.println("Vetor: " + numero[i]);
        }
                   
        }
     
    }    
    
    /*public void AchaY( ){
        
         
        
        //valor n de 2 a 11
            for (i=9; i>=0; i--){
                peso[i] = j;
                j++;
                System.out.println("Vetor n: " + peso[i]); 
            }
        
        //multiplicação ente os vetores
            for (i=9; i>=0; i--){
                resultado[i] = numero[i] * peso[i];
                System.out.println("Resultado da multiplicação " + resultado[i]); 
            }
       
        //soma do vetor resultado
            for (i=0 ; i<=9; i++){
                soma+=resultado[i];   
            }
        System.out.println("Resultado da soma " + soma); 
        
        //verificando x
        verificador = soma%11;
        System.out.println("verificador = " + verificador);
        
        if (verificador<2){
            y=0;
            System.out.println("y = " + y);
        }
        else {
            y= 11-10;
            System.out.println("y = " + y);
        }
        
        
        
    }
  
    */
    
    public static void main(String[] args) {
        
        Cpf dex = new Cpf();
        dex.AchaX();
        
        //Cpf dey = new Cpf();
        //dey.AchaY();
        
    }

}
