package hotel;

public class Estadia {
	private Animal animal;
	private double valor;
	private int dias;
	
	public Estadia(String nome, int idade, String tipo, Animal animal, double valor, int dias) {
		this.animal = new Animal(nome, idade, tipo);
		this.valor = valor;
		this.dias = dias;
	}

	public Animal getAnimal() {
		return animal;
	}

	public double getValor() {
		return valor;
	}

	public int getDias() {
		return dias;
	}
	
	public String getNome() {
		return animal.getNome();
	}
	
	public String getTipo() {
		return animal.getTipo();
	}
	
	public int getIdade() {
		return animal.getIdade();
	}
	
	public String toString() {
		return getNome() + ", " + getTipo() + ", " + getDias() + " dias com o preço de R$ " + getValor();
	}
	
}
