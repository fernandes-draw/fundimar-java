package model.entities;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer usuarioId;
	private String usuarioNome;
	private Date usuarioDataNascimento;
	private Date usuarioDataCadastro;

	public Usuario() {
	}

	public Usuario(Integer usuarioId, String usuarioNome, Date usuarioDataNascimento, Date usuarioDataCadastro) {
		this.usuarioId = usuarioId;
		this.usuarioNome = usuarioNome;
		this.usuarioDataNascimento = usuarioDataNascimento;
		this.usuarioDataCadastro = usuarioDataCadastro;
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getUsuarioNome() {
		return usuarioNome;
	}

	public void setUsuarioNome(String usuarioNome) {
		this.usuarioNome = usuarioNome;
	}

	public Date getUsuarioDataNascimento() {
		return usuarioDataNascimento;
	}

	public void setUsuarioDataNascimento(Date usuarioDataNascimento) {
		this.usuarioDataNascimento = usuarioDataNascimento;
	}

	public Date getUsuarioDataCadastro() {
		return usuarioDataCadastro;
	}

	public void setUsuarioDataCadastro(Date usuarioDataCadastro) {
		this.usuarioDataCadastro = usuarioDataCadastro;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuarioId == null) ? 0 : usuarioId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (usuarioId == null) {
			if (other.usuarioId != null)
				return false;
		} else if (!usuarioId.equals(other.usuarioId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Usuario [usuarioId=" + usuarioId + ", usuarioNome=" + usuarioNome + ", usuarioDataNascimento="
				+ usuarioDataNascimento + ", usuarioDataCadastro=" + usuarioDataCadastro + "]";
	}

}
