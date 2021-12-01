package model;

import java.sql.SQLException;

import services.BD;

public class VeiculoDAO {

	private String sql, men;
	private BD bd;

	public VeiculoDAO() {
		bd = new BD();
	}

	/**
	 * Realiza a gravação do Morador no banco de dados
	 * @param m - Morador a ser salvo
	 * @return - mensagem informando o ocorrido
	 */
	public String salvar(Veiculo v) {
		sql = "insert into VEICULO values(?,?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1, v.getIdVeiculo());
			bd.st.setString(2, v.getModelo());
			bd.st.setString(3, v.getPlaca());
			bd.st.setString(4, v.getAno());
			bd.st.setString(5, v.getCor());
			bd.st.executeUpdate();
			men = "Veiculo "+v.getModelo() + " inserido com sucesso!";  
		}
		catch(SQLException erro) {
			sql = "update VEICULO set modelo=?,placa=?,ano=?,cor=? where idVeiculo=?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setInt(5, v.getIdVeiculo());
				bd.st.setString(1, v.getModelo());
				bd.st.setString(2, v.getPlaca());
				bd.st.setString(3, v.getAno());
				bd.st.setString(4, v.getCor());
				bd.st.executeUpdate();
				men = "Veiculo "+v.getModelo() + " alterado com sucesso"; 
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
	 * Realiza a exclusão do Veiculo no banco de dados
	 * @param IdVeiculo é o codigo do Morador a ser excluido
	 * @return mensagem informando o ocorrido
	 */
	public String excluir(int IdVeiculo) {
		sql = "delete from VEICULO where ID_VEICULO=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,IdVeiculo);
			if(bd.st.executeUpdate()==1){
				men = "Veiculo excluido com sucesso!";
			}
			else {
				men = "Veiculo não encontrado...";
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
	 * Localiza um Veiculo a partir de seu codigo
	 * @param IdVeiculo é o codigo do Morador a ser excluido
	 * @return - o Veiculo na forma de um objeto ou null caso não localizado
	 */
	public Veiculo localizar (int IdVeiculo) {
		Veiculo v = new Veiculo(); 
		sql = "select * from VEICULO where ID_VEICULO=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,IdVeiculo);
			bd.rs = bd.st.executeQuery();
			if(bd.rs.next()){
				v.setIdVeiculo(bd.rs.getInt(1));
				v.setModelo(bd.rs.getString(2));
				v.setPlaca(bd.rs.getString(3));
				v.setAno(bd.rs.getString(4));
				v.setCor(bd.rs.getString(5));
			}
			else {
				v = null;
			}
		}
		catch(SQLException erro) {
			v = null;;
		}
		finally {
			bd.close();
		}
		return v;
	}
	
}
