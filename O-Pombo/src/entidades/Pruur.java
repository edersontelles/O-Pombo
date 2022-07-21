package entidades;

import java.util.Date;

public class Pruur {

	private int id;
	private String texto;
	private Date data;
	private int like;
	private boolean bloqueado;
	
	public Pruur(int id, String texto) {
		super();
		this.id = id;
		this.texto = texto;
		this.data = new Date();
		this.like = 0;
		this.bloqueado = false;
	}
	
	public String getTexto() {
		String txt = texto;
		if(bloqueado == true) {
			txt = "BLOQUEADO";
		}
		return txt;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	public Date getData() {
		return data;
	}
	public int getLike() {
		return like;
	}
	public void setLike() {
		this.like += 1;
	}
	public boolean isBloqueado() {
		return bloqueado;
	}
	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}
	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "\n| Pruur: " + getTexto() + " \n| Id: " + id + " | Like: " + like + " | " + data + "\n - - - - - - - - - - - - - - - - - - - - - - - -";
	}

}
