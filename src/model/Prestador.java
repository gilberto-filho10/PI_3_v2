package model;

/**
 * Tem por finalidade registrar todos os prestadores de serviços que desejam entrar no condomínio, dentro da classe será possível registrar, editar e excluir prestadores.
 * @author Grupo 3
 * @since 19/10/2021
 */
public class Prestador {

	private int idPrestador, cnpj, cpf, rg, cep, telefone;
	private String nome, endereco;
	
	/**
	 * Método contrutor default
	 */
	public Prestador() {
		
	}

	/**
	 * Método construtor da classe Prestadores, usado para criar um objeto já passando seus valores.
	 * @param idPrestador
	 * @param cnpj
	 * @param cpf
	 * @param rg
	 * @param cep
	 * @param telefone
	 * @param nome
	 * @param endereco
	 */
	public Prestador(int idPrestador, int cnpj, int cpf, int rg, int cep, int telefone, String nome, String endereco) {
		this.idPrestador = idPrestador;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.rg = rg;
		this.cep = cep;
		this.telefone = telefone;
		this.nome = nome;
		this.endereco = endereco;
	}

	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getRg() {
		return rg;
	}

	public void setRg(int rg) {
		this.rg = rg;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
}
