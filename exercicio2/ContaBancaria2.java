public class ContaBancaria2 {
    int agencia, contaCorrente;
    double saldo, limiteExtra;
    String titularConta;
    
    public void imprimirSaldo(){
        System.out.println("Saldo: " + this.saldo);
        
        }
    
    public void imprimirSaldoTotal(){
        double soma = this.saldo + this.limiteExtra ;
        System.out.println("Saldo com limite extra: " + soma);
        
        }
    
    public void imprimirAgencia(){
        System.out.println("A agencia é: " + agencia);
        
    }
    
    public void imprimirContaCorrente(){
        System.out.println("A conta-corrente é: " + contaCorrente);
        
    }
    
    public void imprimirTitular(){
        System.out.println("O titular da conta: " + titularConta);
        
    }
    
    public static void main(String []args){
        
        ContaBancaria2 cb1 = new ContaBancaria2();
        ContaBancaria2 cb2 = new ContaBancaria2();
        
        cb1.agencia = 3610;
        cb1.contaCorrente = 15766;
        cb1.saldo = 35.54;
        cb1.limiteExtra = 50;
        cb1.titularConta = "Hebert";
        
        cb2.agencia = 5678;
        cb2.contaCorrente = 2604;
        cb2.saldo = 100.00;
        cb2.limiteExtra = 70;
        cb2.titularConta = "Lair";
        
        cb1.imprimirTitular();
        cb1.imprimirAgencia();
        cb1.imprimirContaCorrente();
        cb1.imprimirSaldo();
        cb1.imprimirSaldoTotal();
        
        cb2.imprimirTitular();
        cb2.imprimirAgencia();
        cb2.imprimirContaCorrente();
        cb2.imprimirSaldo();
        cb2.imprimirSaldoTotal();
    }
}
