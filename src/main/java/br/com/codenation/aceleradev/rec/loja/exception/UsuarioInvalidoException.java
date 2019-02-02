package br.com.codenation.aceleradev.rec.loja.exception;

public class UsuarioInvalidoException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String msg;

	public UsuarioInvalidoException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}
