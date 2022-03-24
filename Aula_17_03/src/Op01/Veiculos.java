package Op01;

public class Veiculos {

	private String nome_do_veiculo;
	
	private String marca;
	private int ano;
	private double motor;
	private String placa;
	
	
	public Veiculos(String nome_do_veiculo, String marca, int ano, double motor, String placa) {
		this.setNome_do_veiculo(nome_do_veiculo);
		this.setMarca(marca);
		this.setAno(ano);
		this.setMotor(motor);
		this.setPlaca(placa);
		
	}
	
	@Override
	public String toString() {
		return ( this.getNome_do_veiculo()   + ", "+
				 this.getMarca()  + ", "+
				 this.getAno() + ", "+
				 this.getMotor()   + ", "+
				 this.getPlaca()   
				);
	}
	
	
	
	public String getNome_do_veiculo() {
		return this.nome_do_veiculo;
	}

	public void setNome_do_veiculo(String nome_do_veiculo) {
		this.nome_do_veiculo = nome_do_veiculo;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return this.ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getMotor() {
		return this.motor;
	}

	public void setMotor(double motor) {
		this.motor = motor;
	}

	public String getPlaca() {
		return this.placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Veiculos() {
		
	}

}
