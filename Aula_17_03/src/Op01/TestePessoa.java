package Op01;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa01 = new Pessoa();
		pessoa01.setNome("João");
		pessoa01.setIdade(24);
		pessoa01.setAltura(1.7);	
		pessoa01.setPeso(80);
		pessoa01.setSexo("M");
		System.out.println(pessoa01.toString());
		
		Pessoa pessoa02 = new Pessoa("João", 24, 1.7, 80, "M");
		System.out.println(pessoa02.toString());
		
		
	}
}
