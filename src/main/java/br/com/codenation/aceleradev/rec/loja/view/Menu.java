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

			if (login(cpf) == true) {
				loginSucesso = true;
				System.out.println("Bem-vindo, usu�rio");
				home();
			} else {
				System.out.println("Desculpe, vamos tentar novamente....");
				//throw new UsuarioInvalidoException("Usu�rio informado � inv�lido.");
			}
		}

	}

	private boolean login(String cpf) {
		return controller.login();
	}
	
	private void home() {
		System.out.println("Escolha uma op��o: "
				+ "\n.1 - Visualizar categorias"
				+ "\n.2 - Visualizar produtos de uma categoria (informe o c�digo da categoria)"
				+ "\n.3 - Visualizar um produto (informe o c�digo do produto)"
				+ "\n.4 - Adicionar produto atual no carrinho de compras"
				+ "\n.5 - Finalizar compra"
				+ "\n.X - Adicionar produto atual no carrinho de compras"
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
			System.out.println("Obrigado e at� logo!");
			System.exit(0);
			break;
		default:
			System.out.println("Valor informado � inv�lido");
			break;
		}
		
	}
	
	
}
