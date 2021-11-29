package model;

/**
 * Classe designada para registrar e vincular os veículos de todos os moradores prestadores e visitantes que desejarem entrar no condomínio.
 * @author Grupo 3
 * @since 19/10/2021
 */
public class Veiculo {

	private int idVeiculo;
	private String modelo, placa, ano, cor;
	
	/**
	 * Método contrutor default
	 */
	public Veiculo() {
		
	}

	/**
	 * Método construtor da classe Veiculos, usado para criar um objeto já passando seus valores.
	 * @param placa
	 * @param ano
	 * @param modelo
	 * @param cor
	 */
	public Veiculo(int idVeiculo, String modelo, String placa, String ano, String cor) {
		this.idVeiculo = idVeiculo;
		this.modelo = modelo;
		this.placa = placa;
		this.ano = ano;
		this.cor = cor;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	@Override
	public String toString() {
		return "["+ idVeiculo +", modelo=" + modelo + ", placa=" + placa + ", ano=" + ano + ", cor="
				+ cor + "]";
	}

	
	
	

}
