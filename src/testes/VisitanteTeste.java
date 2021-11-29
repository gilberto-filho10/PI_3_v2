package testes;

import model.Visitante;
import model.VisitanteDAO;

public class VisitanteTeste {

	public static void main(String[] args) {

		//Visitante vi = new Visitante("Maria", "88388678911", "19345699940", "gracamaria1@hotmail.com", "Jose M.");
		//VisitanteDAO dao = new VisitanteDAO();
		//System.out.println(dao.salvar(vi));
		
		//exclusão
		//VisitanteDAO dao = new VisitanteDAO();
		//System.out.println(dao.excluir(2));
		
		
		//localizar
		VisitanteDAO dao = new VisitanteDAO();
		Visitante vi = dao.localizar(1);
		System.out.println(vi.toString());
		
	}

}
