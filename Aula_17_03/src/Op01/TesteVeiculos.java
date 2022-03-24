package Op01;

public class TesteVeiculos {

	public static void main(String[] args) {
		Veiculos veiculo01 = new Veiculos();
		veiculo01.setNome_do_veiculo("Celta");
		veiculo01.setMarca("Chevrolet");
		veiculo01.setAno(2010);
		veiculo01.setMotor(1.0);
		veiculo01.setPlaca("NRC2416");
		System.out.println(veiculo01.toString());
		
		Veiculos veiculo02 = new Veiculos("Uno", "Fiat", 2004, 1.0, "CFR2716");
		System.out.println(veiculo02.toString());

	}

}
