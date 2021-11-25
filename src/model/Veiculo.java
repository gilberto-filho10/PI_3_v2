package model;

/**
 * Classe designada para registrar e vincular os veículos de todos os moradores prestadores e visitantes que desejarem entrar no condomínio.
 * @author Grupo 3
 * @since 19/10/2021
 */
public class Veiculo {

	private int idVeiculo, placa, ano;
	private String modelo, cor;
	
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
	public Veiculo(int placa, int ano, String modelo, String cor) {
		this.placa = placa;
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
	}

	public int getIdVeiculo() {
		return idVeiculo;
	}

	public void setIdVeiculo(int idVeiculo) {
		this.idVeiculo = idVeiculo;
	}

	public int getPlaca() {
		return placa;
	}

	public void setPlaca(int placa) {
		this.placa = placa;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}	

}
