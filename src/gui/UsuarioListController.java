package gui;

import java.net.URL;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Usuario;
import model.services.UsuarioService;

public class UsuarioListController implements Initializable {

	private UsuarioService service;

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

	private ObservableList<Usuario> obsList;

	@FXML
	public void onBtnNovoAction() {
		System.out.println("onBtnNovoAction");
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		initializeNodes();
	}

	public void setUsuarioService(UsuarioService service) {
		this.service = service;
	}

	private void initializeNodes() {
		tableColumnUsuarioId.setCellValueFactory(new PropertyValueFactory<>("usuarioId"));
		tableColumnUsuarioNome.setCellValueFactory(new PropertyValueFactory<>("usuarioNome"));
		tableColumnUsuarioDataNascimento.setCellValueFactory(new PropertyValueFactory<>("usuarioDataNascimento"));
		tableColumnUsuarioDataCadastro.setCellValueFactory(new PropertyValueFactory<>("usuarioDataCadastro"));

		Stage stage = (Stage) Main.getMainScene().getWindow();
		tableViewUsuario.prefHeightProperty().bind(stage.heightProperty());
	}

	public void updateUsuarioTableView() {
		if (service == null) {
			throw new IllegalStateException("O Serviço está nullo");
		}
		List<Usuario> list = service.findAll();
		obsList = FXCollections.observableArrayList(list);
		tableViewUsuario.setItems(obsList);
	}

}
