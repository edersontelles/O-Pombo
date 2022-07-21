package principal;

import java.util.ArrayList;
import entidades.Usuario;
import entidades.Administrador;
import entidades.Pruur;

/**
 * @author Ederson
 *
 */
public class PrincipalPombo {

	static int  ids = 0;

	public static void main(String[] args) {

		String texto1 = "Lorem ipsum dolor sit amet, consectetur. ";
		String texto2 = "Maecenas in volutpat arcu, eget ultrices.";

		String texto3 = "hahaha";
		String texto4 = "kkkkkk";

		String texto5 = "WIWIWI";
		String texto6 = "OIOIOI";

		// Listas de Pruurs
		ArrayList<Pruur> pruursFulano = new ArrayList<Pruur>();
		if(validarTexto(texto1))
			pruursFulano.add(new Pruur(ids += 1, texto1));
		if(validarTexto(texto2))
			pruursFulano.add(new Pruur(ids += 1, texto2));

		ArrayList<Pruur> pruursBeutrano = new ArrayList<Pruur>();
		if(validarTexto(texto3))
			pruursBeutrano.add(new Pruur(ids += 1, texto3));
		if(validarTexto(texto4))
			pruursBeutrano.add(new Pruur(ids += 1, texto4));

		ArrayList<Pruur> pruursAdministrador = new ArrayList<Pruur>();
		if(validarTexto(texto5))
			pruursAdministrador.add(new Pruur(ids += 1, texto5));
		if(validarTexto(texto6))
			pruursAdministrador.add(new Pruur(ids += 1, texto6));

		// Usuarios
		Usuario user1 = new Usuario("Fulano", "fff@fff.com", "000000-00");
		user1.setPruur(pruursFulano);

		Usuario user2 = new Usuario("Beutrano", "bbb@bbb.com", "111111-11");
		user2.setPruur(pruursBeutrano);

		Administrador admin = new Administrador("Ederson", "eee@eee.com", "222222-22");
		admin.setPruur(pruursAdministrador);

		// Listas de Usuarios
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(user1);
		usuarios.add(user2);
		usuarios.add(admin);

		// Mostrar
		System.out.println("LISTAR PRUURS DE UM USUARIO\n");
		listarUsuarioPruur(user1);

		System.out.println("LISTAR TODOS USUARIOS E SEUS PRUURS\n");
		listarTodosUsuariosPruurs(usuarios);

		// Dar like
		darLike(usuarios, 4);
		darLike(usuarios, 4);

		System.out.println("\nLISTAR TODOS USUARIOS E SEUS PRUURS COM LIKES\n");
		listarTodosUsuariosPruurs(usuarios);

		// Bloquear usuário
		System.out.println("\nBLOQUEAR UM DETERMINADO PRUU\n");
		admin.bloquearPruur(usuarios, 1);
		listarUsuarioPruur(user1);
	}

	public static void listarUsuarioPruur(Usuario usuario) {
		System.out.println(usuario.getNome() + usuario.getPruur() + "\n");
	}

	public static void listarTodosUsuariosPruurs(ArrayList<Usuario> usuarios) {
		for (int i = 0; i < usuarios.size(); i++) {
			System.out.println(usuarios.get(i));
			int qntPruus = usuarios.get(i).getPruur().size();
			for (int j = 0; j < qntPruus; j++) {
				System.out.println(
						"| PRURR: " + usuarios.get(i).getPruur().get(j).getTexto() + "\n" +
						"| LIKE: " + usuarios.get(i).getPruur().get(j).getLike() +
						" | ID: " + usuarios.get(i).getPruur().get(j).getId() +
						" | " + usuarios.get(i).getPruur().get(j).getData() +
						" | \n ------------------------------------------------"
						);
			}
		}
	}

	public static void darLike(ArrayList<Usuario> usuarios, int id) {
		int likeId = id;
		for (int i = 0; i < usuarios.size(); i++) {
			int qntPruus = usuarios.get(i).getPruur().size();
			for (int j = 0; j < qntPruus; j++) {
				if(likeId == usuarios.get(i).getPruur().get(j).getId()) {
					usuarios.get(i).getPruur().get(j).setLike();
					break;
				}
			}
		}
	}

	public static boolean validarTexto(String texto){
		boolean txtValido = false;
		if(texto.length() > 0 && texto.length() <= 300) {
			txtValido = true;
		}
		return txtValido;
	}
}
