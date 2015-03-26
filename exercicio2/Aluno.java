public class Aluno {
   String nome, numeroMatricula;
   int idade;
   
   public void imprimirDadosCadastrais(){
       System.out.println("Nome: " + this.nome + " - Idade: " + this.idade + " - Número Matricula: " + this.numeroMatricula);
   }
    
    
    
    public static void main(String[] args) {
       
        Aluno cb1 = new Aluno();
        Aluno cb2 = new Aluno();
        Aluno cb3 = new Aluno();
        Aluno cb4 = new Aluno() ; 
        
        cb1.nome = "Sara";
        cb1.numeroMatricula = "01";
        cb1.idade = 17;
        
        cb1.imprimirDadosCadastrais();
        
        cb2.nome = "Pedro";
        cb2.numeroMatricula = "02";
        cb2.idade = 17;
        
        cb2.imprimirDadosCadastrais();
        
        cb3.nome = "Cintia";
        cb3.numeroMatricula = "03";
        cb3.idade = 17;
        
        cb3.imprimirDadosCadastrais();
        
        cb4.nome = "Julia";
        cb4.numeroMatricula = "04";
        cb4.idade = 17;
       
        cb4.imprimirDadosCadastrais();
        
    }
}
