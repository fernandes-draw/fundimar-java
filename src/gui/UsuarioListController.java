package gui;

import java.net.URL;
import java.util.Date;
import java.util.ResourceBundle;

import application.Main;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Usuario;

public class UsuarioListController implements Initializable {

	@FXML
	private TableView<Usuario> tableViewUsuario;

	@FXML
	private TableColumn<Usuario, Integer> tableColumnUsuarioId;

	@FXML
	private TableColumn<Usuario, String> tableColumnUsuarioNome;

	@FXML
	private TableColumn<Usuario, Date> tableColumnUsuarioDataNascimento;

	@FXML
	private TableColumn<Usuario, Date> tableColumnUsuarioDataCadastro;

	@FXML
	private Button btnNovo;

	@FXML
	public void onBtnNovoAction() {
		System.out.println("onBtnNovoAction");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initializeNodes();
	}

	private void initializeNodes() {
		tableColumnUsuarioId.setCellValueFactory(new PropertyValueFactory<>("usuarioId"));
		tableColumnUsuarioNome.setCellValueFactory(new PropertyValueFactory<>("usuarioNome"));
		tableColumnUsuarioDataNascimento.setCellValueFactory(new PropertyValueFactory<>("usuarioDataNascimento"));
		tableColumnUsuarioDataCadastro.setCellValueFactory(new PropertyValueFactory<>("usuarioDataCadastro"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewUsuario.prefHeightProperty().bind(stage.heightProperty());
	}

}
