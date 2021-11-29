package model;

/**
 * Tem por finalidade registrar todos os visitantes (amigos, familiares ou colegas dos moradores) que desejam entrar no condomínio, dentro da classe será possível registrar, editar e excluir visitantes.
 * @author Grupo 3
 * @since 19/10/2021
 */
public class Visitante {

	private int idVisitante;
	private String nome, cpf, telefone, email, nome_resp;
	
	/**
	 * Método contrutor default
	 */
	public Visitante() {
		
	}
	
	@Override
	public String toString() {
		return "Visitante [idVisitante=" + idVisitante + ", nome=" + nome + ", cpf=" + cpf + ", telefone=" + telefone
				+ ", email=" + email + ", nome_resp=" + nome_resp + "]";
	}

	/**
	 * Método construtor da classe Visitantes, usado para criar um objeto já passando seus valores.
	 * @param nome
	 * @param cpf
	 * @param telefone
	 * @param email
	 * @param nome_resp - Para quem o prestador irá prestar o serviço.
	 */
	public Visitante(String nome, String cpf, String telefone, String email, String nome_resp) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.email = email;
		this.nome_resp = nome_resp;
	}

	public int getIdVisitante() {
		return idVisitante;
	}

	public void setIdVisitante(int idVisitante) {
		this.idVisitante = idVisitante;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNome_resp() {
		return nome_resp;
	}

	public void setNome_resp(String nome_resp) {
		this.nome_resp = nome_resp;
	}
		
	
}
