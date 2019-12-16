package model.services;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import model.entities.Usuario;

public class UsuarioService {

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public List<Usuario> findAll() {
		List<Usuario> list = new ArrayList<>();
		list.add(new Usuario(1, "Everson", null, null));
		list.add(new Usuario(1, "Márcia", null, null));
		list.add(new Usuario(1, "Victória", null, null));
		list.add(new Usuario(1, "Júnior", null, null));

		return list;
	}

}
