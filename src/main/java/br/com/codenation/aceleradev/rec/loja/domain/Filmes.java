package br.com.codenation.aceleradev.rec.loja.domain;

import java.time.LocalDate;

public class Filmes extends Produto{
	
	private String diretor;
	private LocalDate anoLancamento;
	
		public String getDiretor() {
		return diretor;
	}
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	public LocalDate getAnoLancamento() {
		return anoLancamento;
	}
	public void setAnoLancamento(LocalDate anoLancamento) {
		this.anoLancamento = anoLancamento;
	}
		
}
