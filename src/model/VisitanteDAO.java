package model;

import java.sql.SQLException;

import services.BD;

public class VisitanteDAO {

	private String sql, men;
	private BD bd;

	public VisitanteDAO() {
		bd = new BD();
	}

	/**
	 * Realiza a gravação do Visitante no banco de dados
	 * @param m - Visitante a ser salvo
	 * @return - mensagem informando o ocorrido
	 */
	public String salvar(Visitante vi) {
		sql = "insert into VISITANTE values(?,?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, vi.getNome());
			bd.st.setString(2, vi.getCpf());
			bd.st.setString(3, vi.getTelefone());
			bd.st.setString(4, vi.getEmail());
			bd.st.setString(5, vi.getNome_resp());
			bd.st.executeUpdate();
			men = "Visitante "+vi.getNome() + " inserido com sucesso!";  
		}
		catch(SQLException erro) {
			sql = "update VISITANTE set Nome=?,Telefone=?,Email=?,Nome_resp=? where CPF_MORADOR=?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, vi.getNome());
				bd.st.setString(5, vi.getCpf());
				bd.st.setString(2, vi.getTelefone());
				bd.st.setString(3, vi.getEmail());
				bd.st.setString(4, vi.getNome_resp());
				bd.st.executeUpdate();
				men = "Visitante "+vi.getNome() + " alterado com sucesso"; 
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
	public String excluir(int IdVisitante) {
		sql = "delete from VISITANTE where ID_VISITANTE=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,IdVisitante);
			if(bd.st.executeUpdate()==1){
				men = "Visitante excluido com sucesso!";
			}
			else {
				men = "Visitante não encontrado...";
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
	 * Localiza um Visitante a partir de seu codigo
	 * @param IdVisitante é o codigo do Visitante a ser excluido
	 * @return - o visitante na forma de um objeto ou null caso não localizado
	 */
	public Visitante localizar (int IdVisitante) {
		Visitante vi = new Visitante(); 
		sql = "select * from VISITANTE where ID_VISITANTE=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,IdVisitante);
			bd.rs = bd.st.executeQuery();
			if(bd.rs.next()){
				vi.setIdVisitante(bd.rs.getInt(1));
				vi.setNome(bd.rs.getString(2));
				vi.setCpf(bd.rs.getString(3));
				vi.setTelefone(bd.rs.getString(4));
				vi.setEmail(bd.rs.getString(5));
				vi.setNome_resp(bd.rs.getString(6));
			}
			else {
				vi = null;
			}
		}
		catch(SQLException erro) {
			vi = null;;
		}
		finally {
			bd.close();
		}
		return vi;
	}
	
}
