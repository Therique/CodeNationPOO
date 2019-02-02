package br.com.codenation.aceleradev.rec.loja.domain;

public class Software extends Produto {
	private String versao;
	private String requisitosSistemas;
	
	public String getVersao() {
		return versao;
	}
	public void setVersao(String versao) {
		this.versao = versao;
	}
	public String getRequisitosSistemas() {
		return requisitosSistemas;
	}
	public void setRequisitosSistemas(String requisitosSistemas) {
		this.requisitosSistemas = requisitosSistemas;
	}
	
	
	
}
