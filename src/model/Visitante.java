package model;

/**
 * Tem por finalidade registrar todos os visitantes (amigos, familiares ou colegas dos moradores) que desejam entrar no condomínio, dentro da classe será possível registrar, editar e excluir visitantes.
 * @author Grupo 3
 * @since 19/10/2021
 */
public class Visitante {

	private int idVisitantes, cpf, telefone;
	private String nome, email;
	
	/**
	 * Método contrutor default
	 */
	public Visitante() {
		
	}

	/**
	 * Método construtor da classe Visitantes, usado para criar um objeto já passando seus valores.
	 * @param idVisitantes
	 * @param cpf
	 * @param telefone
	 * @param nome
	 * @param email
	 */
	public Visitante(int idVisitantes, int cpf, int telefone, String nome, String email) {
		this.idVisitantes = idVisitantes;
		this.cpf = cpf;
		this.telefone = telefone;
		this.nome = nome;
		this.email = email;
	}

	public int getIdVisitantes() {
		return idVisitantes;
	}

	public void setIdVisitantes(int idVisitantes) {
		this.idVisitantes = idVisitantes;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
