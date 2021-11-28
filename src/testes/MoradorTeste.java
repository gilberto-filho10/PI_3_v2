package testes;

import model.Morador;
import model.MoradorDAO;

public class MoradorTeste {

	public static void main(String[] args) {
		
		Morador m = new Morador("Jose","jose@gmail.com","12345678911","12345678932");
		MoradorDAO dao = new MoradorDAO();
		System.out.println(dao.salvar(m));
	} 

}
