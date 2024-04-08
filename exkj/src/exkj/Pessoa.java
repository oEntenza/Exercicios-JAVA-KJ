package exkj;

public class Pessoa {
	public String nome;
	public String sexo;
	public boolean vegetariana;
	public int idade;
	
	public Pessoa(String nome, String sexo, int idade, boolean vegetariana) {
		this.nome = nome;
		this.sexo = sexo;
		this.vegetariana = vegetariana;
		this.idade = idade;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public boolean ehVegetariana() {
		return vegetariana;
	}
}
