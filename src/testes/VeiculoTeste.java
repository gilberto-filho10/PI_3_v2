package testes;

import model.Veiculo;
import model.VeiculoDAO;

public class VeiculoTeste {

	public static void main(String[] args) {

		//inclus�o
		/*Veiculo v = new Veiculo(2,"Brasilia","DER4468","2019","Azul");
		VeiculoDAO dao = new VeiculoDAO();
		System.out.println(dao.salvar(v));*/
		
		//exclus�o
		/*VeiculoDAO dao = new VeiculoDAO();
		System.out.println(dao.excluir(2));*/
		
		//localizar
		VeiculoDAO dao = new VeiculoDAO();
		Veiculo v = dao.localizar(1);
		System.out.println(v.toString());
	}

}
