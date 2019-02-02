package br.com.codenation.aceleradev.rec.loja;

import br.com.codenation.aceleradev.rec.loja.exception.UsuarioInvalidoException;
import br.com.codenation.aceleradev.rec.loja.view.Menu;

public class Main {

	public static void main(String[] args) throws UsuarioInvalidoException {

		Menu menu = new Menu();
		menu.manager();

	}
}
