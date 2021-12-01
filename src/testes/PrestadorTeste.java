package testes;

import model.Prestador;
import model.PrestadorDAO;

public class PrestadorTeste {

	public static void main(String[] args) {
		
		//Prestador p = new Prestador("Rodrigo", "12345678910123", "33388678911", "3334599891", "13340477", "Av. Benjamin Constant", "19345678940", "Everaldo Timão");
		//PrestadorDAO dao = new PrestadorDAO();
		//System.out.println(dao.salvar(p));
		
		//exclusão
		//PrestadorDAO dao = new PrestadorDAO();
		//System.out.println(dao.excluir(2));
		
		//localizar
		PrestadorDAO dao = new PrestadorDAO();
		Prestador p = dao.localizar(1);
		System.out.println(p.toString());

	}

}
