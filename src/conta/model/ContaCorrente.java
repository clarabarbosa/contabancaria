package conta.model;

public class ContaCorrente extends Conta {// extends => herança/herda

	// Atributos

	private float limite;

	// Metodo Especial - Metodo Construtor
	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo, float limite) {
		super(numero, agencia, tipo, titular, saldo);// Invocando méto construtor Conta
		// this => Classe Conta
		// Conta.numero = atributo
		// Numero = 6
		// this.numero = 6
		this.limite = limite; // this = nome da classe
	}

	public ContaCorrente(int numero, int agencia, int tipo, String titular, float saldo) {
		super(numero, agencia, tipo, titular, saldo);
		this.limite = 5000.0f;
	}

	// Métodos de acesso
	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}

	@Override
	public boolean sacar(float valor) {
		if(this.getSaldo()+this.getLimite()<valor) {
			System.out.println("\n Saldo Insuficiente!");
			return false;
	}
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}

	// Polimorfismo de sobreescrita => add mais lógica a uma m´wtodo já existente
	public void visualizar(){
		super.visualizar();//Método da classe conta
		System.out.println("Limite de Crédito: " + this.limite);
}
}