package br.com.codenation.aceleradev.rec.loja.view;

import java.util.Scanner;

import br.com.codenation.aceleradev.rec.loja.controller.Controller;
import br.com.codenation.aceleradev.rec.loja.exception.UsuarioInvalidoException;

public class Menu {

	private Scanner sc = new Scanner(System.in);
	private Controller controller = new Controller();
	
	public void manager() throws UsuarioInvalidoException {

		boolean loginSucesso = false;

		while (loginSucesso == false) {
			System.out.println("Informe o seu CPF: ");
			String cpf = sc.nextLine();
			
			String nomeUsuario = login(cpf);
			
			if (nomeUsuario != null) {
				loginSucesso = true;
				System.out.println("Bem-vindo, " + nomeUsuario);
				home();
			} else {
				System.out.println("Desculpe, vamos tentar novamente....");
			}
		}

	}

	private String login(String cpf) {
		return controller.login(cpf);
	}
	
	private void home() {
		System.out.println("Escolha uma opção: "
				+ "\n1 - Visualizar categorias"
				+ "\n2 - Visualizar produtos de uma categoria (informe o código da categoria)"
				+ "\n3 - Visualizar um produto (informe o código do produto)"
				+ "\n4 - Adicionar produto atual no carrinho de compras"
				+ "\n5 - Finalizar compra"
				+ "\nX - Adicionar produto atual no carrinho de compras"
				+ "");
		
		String opcao = sc.nextLine();
		
		switch (opcao) {
		case "1":
			controller.visualizarCategorias();
			break;
		case "2":
			controller.visualizarProdutosDeCategoria();
			break;
		case "3":
			controller.visualizarProduto();
			break;
		case "4":
			controller.adicionarProdutoNoCarrinho();
			break;
		case "5":
			controller.finalizarCompra();
			break;
		case "X":
			System.out.println("Obrigado e até logo!");
			System.exit(0);
			break;
		default:
			System.out.println("Valor informado é inválido");
			break;
		}
		
	}
	
	
}
