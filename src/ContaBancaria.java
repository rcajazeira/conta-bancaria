
public class ContaBancaria {
	
	//criar atributos
	
	private String nomeTitular; // nome cliente
	private String numeroConta; // numero conta - sacanner -
	private String agenciaNome; //agencia 001-01
	private double clienteSaldo; // 0 - fixo 
	private String aberturaData;
	
	//criar construtores 
	
	public ContaBancaria() {}
	
	public ContaBancaria (String nome, String numeroConta) {
		this.nomeTitular = "Cliente";
		this.numeroConta = "001";
	}
	
	//criando os metodos e parametros
	
	public void sacar(double valor) {
		if (valor >= 0 && this.clienteSaldo >= valor) {
		this.clienteSaldo -= valor;
		
	} else {
		
	}
		
	}
	
	public void depositar(double valor) {
		if (valor >= 0) {
			this.clienteSaldo += valor;
		} else {
			System.out.println("não foi possível efetuar o deposito");
		}
	
		
	}
	
	public void calcularRendimento() {
		double renda;
		renda = this.clienteSaldo * 0.05;
		System.out.println("Seu rendimento foi de R$ " + renda);
		this.clienteSaldo += renda;
		System.out.println("Seu saldo atual é de R$ " + this.clienteSaldo);
		
	}
	
	//criar o get e set
	
	public String getNomeTitular() {
		return nomeTitular;
	}
	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}
	public String getNumeroConta() {
		return numeroConta;
	}
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	public String getAgenciaNome() {
		return agenciaNome;
	}
	public void setAgenciaNome(String agenciaNome) {
		this.agenciaNome = agenciaNome;
	}
	public double getClienteSaldo() {
		return clienteSaldo;
	}
	public void setClienteSaldo(double clienteSaldo) {
		this.clienteSaldo = clienteSaldo;
	}
	public String getAberturaData() {
		return aberturaData;
	}
	public void setAberturaData(String aberturaData) {
		this.aberturaData = aberturaData;
	}
	
	

}