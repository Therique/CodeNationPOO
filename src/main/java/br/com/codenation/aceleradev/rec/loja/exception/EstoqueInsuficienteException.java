package br.com.codenation.aceleradev.rec.loja.exception;

public class EstoqueInsuficienteException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String msg;

	public EstoqueInsuficienteException(String msg) {
		super(msg);
		this.msg = msg;
	}

	public String getMessage() {
		return msg;
	}

}
