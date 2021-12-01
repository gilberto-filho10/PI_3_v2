package model;

import java.sql.SQLException;

import services.BD;

public class PrestadorDAO {

	private String sql, men;
	private BD bd;

	public PrestadorDAO() {
		bd = new BD();
	}

	/**
	 * Realiza a gravação do Prestador no banco de dados
	 * @param p - Prestador a ser salvo
	 * @return - mensagem informando o ocorrido
	 */
	public String salvar(Prestador p) {
		sql = "insert into TERCEIRO values(?,?,?,?,?,?,?,?)";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, p.getNome());
			bd.st.setString(2, p.getCnpj());
			bd.st.setString(3, p.getCpf());
			bd.st.setString(4, p.getRg());
			bd.st.setString(5, p.getCep());
			bd.st.setString(6, p.getEndereco());
			bd.st.setString(7, p.getTelefone());
			bd.st.setString(8, p.getNome_resp());
			bd.st.executeUpdate();
			men = "Prestador "+p.getNome() + " inserido com sucesso!";  
		}
		catch(SQLException erro) {
			sql = "update TERCEIRO set Nome=?,Cnpj=?,Rg=?,Cep=?,Endereco=?,Telefone=?,Nome_resp=? where CPF_TERCEIRO=?";
			try {
				bd.st = bd.con.prepareStatement(sql);
				bd.st.setString(1, p.getNome());
				bd.st.setString(2, p.getCnpj());
				bd.st.setString(8, p.getCpf());
				bd.st.setString(3, p.getRg());
				bd.st.setString(4, p.getCep());
				bd.st.setString(5, p.getEndereco());
				bd.st.setString(6, p.getTelefone());
				bd.st.setString(7, p.getNome_resp());
				bd.st.executeUpdate();
				men = "Morador "+p.getNome() + " alterado com sucesso"; 
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
	 * Realiza a exclusão do Prestador no banco de dados
	 * @param IdMorador é o codigo do Prestador a ser excluido
	 * @return mensagem informando o ocorrido
	 */
	public String excluir(int idPrestador) {
		sql = "delete from TERCEIRO where ID_TERCEIRO=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,idPrestador);
			if(bd.st.executeUpdate()==1){
				men = "Prestador excluido com sucesso!";
			}
			else {
				men = "Prestador não encontrado...";
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
	 * Localiza um Prestador a partir de seu codigo
	 * @param Prestador é o codigo do Morador a ser excluido
	 * @return - o prestador na forma de um objeto ou null caso não localizado
	 */
	public Prestador localizar (int idPrestador) {
		Prestador p = new Prestador(); 
		sql = "select * from TERCEIRO where ID_TERCEIRO=?";
		try {
			bd.getConnection();
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,idPrestador);
			bd.rs = bd.st.executeQuery();
			if(bd.rs.next()){
				p.setIdPrestador(bd.rs.getInt(1));
				p.setNome(bd.rs.getString(2));
				p.setCnpj(bd.rs.getString(3));
				p.setCpf(bd.rs.getString(4));
				p.setRg(bd.rs.getString(5));
				p.setCep(bd.rs.getString(6));
				p.setEndereco(bd.rs.getString(7));
				p.setTelefone(bd.rs.getString(8));
				p.setNome_resp(bd.rs.getString(9));
			}
			else {
				p = null;
			}
		}
		catch(SQLException erro) {
			p = null;;
		}
		finally {
			bd.close();
		}
		return p;
	}
	
}
