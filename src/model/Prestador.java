package model;

/**
 * Tem por finalidade registrar todos os prestadores de serviços que desejam entrar no condomínio, dentro da classe será possível registrar, editar e excluir prestadores.
 * @author Grupo 3
 * @since 19/10/2021
 */
public class Prestador {

	private int idPrestador;
	private String nome, cnpj, cpf,rg, cep, endereco, telefone, nome_resp;

	/**
	 * Método contrutor default
	 */
	public Prestador() {

	}

	/**
	 * Método construtor da classe Prestadores, usado para criar um objeto já passando seus valores.
	 * @param nome
	 * @param cnpj
	 * @param cpf
	 * @param rg
	 * @param cep
	 * @param endereco
	 * @param telefone
	 * @param nome_resp - Para quem o prestador irá prestar o serviço.
	 */
	public Prestador(String nome, String cnpj, String cpf, String rg, String cep, String endereco,
			String telefone, String nome_resp) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.cpf = cpf;
		this.rg = rg;
		this.cep = cep;
		this.endereco = endereco;
		this.telefone = telefone;
		this.nome_resp = nome_resp;
	}
		
	@Override
	public String toString() {
		return "[idPrestador=" + idPrestador + ", nome=" + nome + ", cnpj=" + cnpj + ", cpf=" + cpf + ", rg="
				+ rg + ", cep=" + cep + ", endereco=" + endereco + ", telefone=" + telefone + ", nome_resp=" + nome_resp
				+ "]";
	}

	public int getIdPrestador() {
		return idPrestador;
	}

	public void setIdPrestador(int idPrestador) {
		this.idPrestador = idPrestador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getNome_resp() {
		return nome_resp;
	}

	public void setNome_resp(String nome_resp) {
		this.nome_resp = nome_resp;
	}


}
