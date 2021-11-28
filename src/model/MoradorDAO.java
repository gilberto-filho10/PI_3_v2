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
		sql = "insert into MORADOR values(?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			//bd.st.setInt(1, m.getIdMorador());
			bd.st.setString(1, m.getNome());
			bd.st.setString(2, m.getCpf());
			bd.st.setString(3, m.getTelefone());
			bd.st.setString(4, m.getEmail());
			bd.st.executeUpdate();
			men = "Morador "+m.getNome() + " inserido com sucesso!";  
		}
		catch(SQLException erro) {
			sql = "update MORADOR set Nome=?,Cpf=?,Telefone=?,Email=? where codigo=?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(5, m.getIdMorador());
				bd.st.setString(1, m.getNome());
				bd.st.setString(2, m.getCpf());
				bd.st.setString(3, m.getTelefone());
				bd.st.setString(4, m.getEmail());
				bd.st.executeUpdate();
				men = "Morador "+m.getNome() + " alterado com sucesso"; 
			}
			catch(SQLException erro2) {
				men = "Erro: "+ erro.toString();
			}
			finally {
				bd.close();
			}
		}
		return men;
	}

	/**
	 * Realiza a exclusão do Morador no banco de dados
	 * @param IdMorador é o codigo do Morador a ser excluido
	 * @return mensagem informando o ocorrido
	 */
	public String excluir(int IdMorador) {
		sql = "delete from MORADOR where codigo=?";
		try {
			bd.getConnection();
			bd.st.setInt(1,IdMorador);
			if(bd.st.executeUpdate()==1){
				men = "Produto excluido com sucesso!";
			}
			else {
				men = "Produto não encontrado...";
			}
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
	 * Localiza um Morador a partir de seu codigo
	 * @param IdMorador é o codigo do Morador a ser excluido
	 * @return - o produto na forma de um objeto ou null caso não localizado
	 */
	public Morador localizar (int IdMorador) {
		Morador m = new Morador(); 
		sql = "select * from MORADOR where codigo=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,IdMorador);
			bd.rs = bd.st.executeQuery();
			if(bd.rs.next()){
				m.setIdMorador(bd.rs.getInt(1));
				m.setNome(bd.rs.getString(2));
				m.setCpf(bd.rs.getString(3));
				m.setTelefone(bd.rs.getString(4));
				m.setEmail(bd.rs.getString(5));
			}
			else {
				m = null;
			}
		}
		catch(SQLException erro) {
			m = null;;
		}
		finally {
			bd.close();
		}
		return m;
	}


}
