package gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

public class MainViewController implements Initializable {

	@FXML
	private MenuItem menuItemUsuario;

	@FXML
	private MenuItem menuItemProduto;

	@FXML
	private MenuItem menuItemCliente;

	@FXML
	private MenuItem menuItemFornecedor;

	@FXML
	public void onMenuItemUsuarioAction() {
		System.out.println("onMenuItemUsuarioAction");
	}

	@FXML
	public void onMenuItemProdutoAction() {
		System.out.println("onMenuItemProdutoAction");
	}

	@FXML
	public void onMenuItemClienteAction() {
		System.out.println("onMenuItemClienteAction");
	}

	@FXML
	public void onMenuItemFornecedorAction() {
		System.out.println("onMenuItemFornecedorAction");
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

}
