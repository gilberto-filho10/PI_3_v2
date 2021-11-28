package model;

/**
 * Essa classe tem por finalidade registrar todos os moradores dentro do condomínio, nela será possível incluir novos moradores, editar seus registros e desativar os mesmos.
 * @author Grupo 3
 * @since 22/11/2021
 */
public class Morador {

	private int idMorador;
	private String nome, cpf, telefone, email;
	
	
	public String toString(){
		return "["+idMorador+","+cpf+","+telefone+","+nome+","+email+"]";
	}
	
	/**
	 * Método contrutor default
	 */
	public Morador() {
		
	}	

	/**
	 * Método construtor da classe Moradores, usado para criar um objeto já passando seus valores.
	 * @param cpf
	 * @param telefone
	 * @param nome
	 * @param email
	 */
	public Morador(String nome, String email, String cpf, String telefone) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;		
	}

	public int getIdMorador() {
		return idMorador;
	}

	public void setIdMorador(int idMorador) {
		this.idMorador = idMorador;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	
}
