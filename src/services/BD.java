package services;

import java.sql.*;

public class BD {

	//realiza a conex�o com o Bacno usando o Driver.
	public Connection con = null;

	//realiza a execu��o de instru��es SQL
	public PreparedStatement st = null;


	//manipula uma tabela em mem�ria
	public ResultSet rs = null;

	//caminho do DRIVER do banco
	private final String DRIVER = "com.microsoft.sqlserver.jdbc.SQLServerDriver"; 
	private final String DATABASENAME = "quickvisionBD";
	private final String URL = "jdbc:sqlserver://localhost:1433;databasename="+DATABASENAME;
	private final String LOGIN = "sa";
	private final String PASSWORD = "12345";

	/**
	 * Realiza a conex�o ao banco de dados
	 * @return - true em caso de sucesso ou false caso contr�rio
	 */
	public boolean getConnection() {
		try {
			Class.forName(DRIVER); //carregando o DRIVER
			//System.out.println("Driver carregado com sucesso!");
			con = DriverManager.getConnection(URL, LOGIN, PASSWORD); //objeto de conex�o, excuta para consultar
			System.out.println("Conectado com sucesso!");
			return true;

		}
		catch(ClassNotFoundException erro) {
			System.out.println("Driver n�o encontrado!!");
			return false;
		}

		catch(SQLException erro) {
			System.out.println("Falha na conex�o "+ erro);
			return false;
		}

	}
	/**
	 * Encerra a conex�o com o banco de dados, fechando todos os objetos utilizados
	 */
	public void close() {
		try {
			if (rs!=null) rs.close();
			if (st!=null) st.close();
			if (con!=null) {
				con.close();
				System.out.println("Desconectou...");
			}
		}
		catch(SQLException erro) {
			
		}
	}

	public static void main(String[] args) {
		BD bd = new BD();
		bd.getConnection();
		//executar uma instru��o
		bd.close();
	}


}
