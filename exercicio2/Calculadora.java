public class Calculadora{

	int var1, var2, soma, subtracao, multiplicacao;
        float divisao;
        
	
	public void soma(){
	soma = (var1 + var2);
	System.out.println("A soma é: " + this.soma);
	
	}
	
	public void subtracao(){
	subtracao = (var1 - var2);
	System.out.println("A subtração é: " + this.subtracao);
	
	}
	
	public void multiplicacao(){
	multiplicacao = (var1 * var2);	
	System.out.println("A multiplicação é: " + this.multiplicacao);
	
	}
	
	public void divisao(){
	divisao = (var1 / var2);	
	System.out.println("A divisão é: " + this.divisao);
	
	}
	
	public static void main (String [] args){
	
	Calculadora ct1 = new Calculadora();
	Calculadora ct2 = new Calculadora();
	Calculadora ct3 = new Calculadora();


	ct1.var1 = 6;
	ct1.var2 = 45;
	
        ct1.soma();
	ct1.subtracao();
	ct1.multiplicacao();
	ct1.divisao();

	ct2.var1 = 33;
	ct2.var2 = 76;
	
        ct2.soma();
	ct2.subtracao();
	ct2.multiplicacao();
	ct2.divisao();

	ct3.var1 = 12;
	ct3.var2 = 21;
	
        ct3.soma();
	ct3.subtracao();
	ct3.multiplicacao();
	ct3.divisao();


	}

}
