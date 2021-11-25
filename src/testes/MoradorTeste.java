package testes;

import model.Morador;
import model.MoradorDAO;

public class MoradorTeste {

	public static void main(String[] args) {
		
		Morador m = new Morador(5, "Joaquim Santos", "joasantu@gmail.com", "12345678900", "19123456789");
		MoradorDAO dao = new MoradorDAO();
		System.out.println(dao.salvar(m));
	}

}
