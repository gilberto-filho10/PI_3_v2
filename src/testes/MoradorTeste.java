package testes;

import model.Morador;
import model.MoradorDAO;
import model.Veiculo;
import model.VeiculoDAO;

public class MoradorTeste {

	public static void main(String[] args) {
		
		/*Morador m = new Morador("Jilvaldo M.","jicavde@gmail.com","33345678911","44345678932");
		MoradorDAO dao = new MoradorDAO();
		System.out.println(dao.salvar(m));*/
		
		//exclusão
		//MoradorDAO dao = new MoradorDAO();
		//System.out.println(dao.excluir(4));
		
		
		//localizar
		MoradorDAO dao = new MoradorDAO();
		Morador m = dao.localizar(1);
		System.out.println(m.toString());
	} 

}
