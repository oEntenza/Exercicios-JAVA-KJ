package exkj;

public class Churrasco {
	public double qtCarne;
	
	public Churrasco(double qtCarne){
		this.qtCarne = qtCarne;
	}
	
	public void verificarConsumo (Pessoa pessoa) {
	 int idade = pessoa.idade;
	 boolean vegetariana = pessoa.vegetariana;
	if (pessoa.idade <= 3 || vegetariana==true) {
			System.out.println("Nao consome querne");
	}else if (idade >= 4 && idade <= 12 && !vegetariana) {
        qtCarne += 1;
        System.out.println("Consome 1 kg");
    } else if (idade >= 13 && !vegetariana) {
        qtCarne += 2;
        System.out.println("Consome 2 kg");
    }
	}
	
	public double getQtCarne() {
		return qtCarne;
	}
}