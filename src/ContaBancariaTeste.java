import java.util.Scanner;
 
public class ContaBancariaTeste {
 
    public static void main(String[] args) {
        
        ContaBancaria bancoDobrasil = new ContaBancaria();
        Scanner ler = new Scanner(System.in);
        System.out.println("Número da conta: " + bancoDobrasil.getNumeroConta());
        String nome, numeroConta;
        
        System.out.println("Digite o nome: ");
        nome = ler.next();
        
        System.out.println("Digite o número da conta: ");
        
        numeroConta = ler.next();
        
        ContaBancaria corrente = new ContaBancaria(nome, numeroConta);
        
        System.out.println("Seu número da conta é: " + corrente.getNumeroConta());
        //olhar a referencia da foto
        bancoDobrasil.setAberturaData("18/02/2024");
        bancoDobrasil.setNomeTitular(nome);
        bancoDobrasil.setAgenciaNome(nome);
        bancoDobrasil.setClienteSaldo(0);
        
        System.out.println(bancoDobrasil.getNumeroConta());
        System.out.println(bancoDobrasil.getNomeTitular());
        System.out.println(bancoDobrasil.getAgenciaNome());
        System.out.println(bancoDobrasil.getClienteSaldo());
        
        
//      bancoDobrasil.calcularRendimento();
//      bancoDobrasil.depositar(0);
//      bancoDobrasil.sacar(0);
}}