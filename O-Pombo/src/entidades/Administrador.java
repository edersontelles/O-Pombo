package entidades;

import java.util.ArrayList;

public class Administrador extends Usuario{

	public Administrador() {
		super();
	}
	
	public Administrador(String nome, String email, String cpf) {
		super.setNome(nome);
		super.setEmail(email);
		super.setCpf(cpf);
	}

	public void bloquearPruur(ArrayList<Usuario> usuarios, int id) {
		int likeId = id;
		for (int i = 0; i < usuarios.size(); i++) {
			int qntPruus = usuarios.get(i).getPruur().size();
			for (int j = 0; j < qntPruus; j++) {
				if(likeId == usuarios.get(i).getPruur().get(j).getId()) {
					usuarios.get(i).getPruur().get(j).setBloqueado(true);
					break;
				}
			}
		}
	}
}
