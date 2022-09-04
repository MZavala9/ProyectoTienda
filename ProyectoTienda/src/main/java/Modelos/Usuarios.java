package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Usuarios", catalog="proyecto", schema="")
public class Usuarios {

	@Id
	@Column
	private Integer Usu_id;
	
	@Column
	private String Usu_nombre;
	
	@Column
	private String Usu_pass;

	public Integer getUsu_id() {
		return Usu_id;
	}

	public void setUsu_id(Integer usu_id) {
		Usu_id = usu_id;
	}

	public String getUsu_nombre() {
		return Usu_nombre;
	}

	public void setUsu_nombre(String usu_nombre) {
		Usu_nombre = usu_nombre;
	}

	public String getUsu_pass() {
		return Usu_pass;
	}

	public void setUsu_pass(String usu_pass) {
		Usu_pass = usu_pass;
	}
	
	
	
	
}
