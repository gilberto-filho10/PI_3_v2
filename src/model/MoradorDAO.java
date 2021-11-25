package model;

import java.sql.SQLException;

import services.BD;

public class MoradorDAO {

	private String sql, men;
	private BD bd;
	
	public MoradorDAO() {
		bd = new BD();
	}
	
	/**
	 * Realiza a gravação do Morador no banco de dados
	 * @param m - Morador a ser salvo
	 * @return - mensagem informando o ocorrido
	 */
	public String salvar(Morador m) {
		sql = "insert into MORADOR values(?,?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, m.getIdMorador());
			bd.st.setString(2, m.getNome());
			bd.st.setString(3, m.getCpf());
			bd.st.setString(4, m.getTelefone());
			bd.st.setString(5, m.getEmail());
			bd.st.executeUpdate();
			men = "Morador "+m.getNome() + " inserido com sucesso!";  
		}
		catch(SQLException erro) {
			men = "Erro: "+ erro.toString();
		}
		finally {
			bd.close();
		}
		return men;
	}
	
	/**
	 * Realiza a exclusão do Morador no banco de dados
	 * @param codigo do Morador a ser excluido
	 * @return mensagem informando o ocorrido
	 */
	public String excluir(int IdMorador) {
		return null;
	}
	
	/**
	 * Localiza um Morador a partir de seu codigo
	 * @param codigo - o codigo do Morador a ser localizado
	 * @return - o produto na forma de um objeto ou null caso não localizado
	 */
	public Morador localizar (int IdMorador) {
		return null;
	}
	
	
}
