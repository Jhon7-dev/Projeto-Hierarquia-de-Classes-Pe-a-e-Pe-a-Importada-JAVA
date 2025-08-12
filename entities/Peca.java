package entities;
public class Peca{
	protected String nome;
	protected double custo;
	protected double lucro;
	
	public Peca() {
		// TODO Auto-generated constructor stub
	}

	public Peca(String nome, double custo, double lucro) {
		super();
		this.nome = nome;
		this.custo = custo;
		this.lucro = lucro;
	}
	
	
	public double calcularPreco(double custo,double lucro) {
		return custo + lucro;
	}
	
	public void exibir () {
		System.out.println(" === Peça === ");
		System.out.println("Nome: " + getNome());
		System.out.println("Custo: " + getCusto());
		System.out.println("Lucro: " + getLucro());
		System.out.println("Preço da Peça: " + calcularPreco(custo, lucro));
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getLucro() {
		return lucro;
	}

	public void setLucro(double lucro) {
		this.lucro = lucro;
	}
	
	
}