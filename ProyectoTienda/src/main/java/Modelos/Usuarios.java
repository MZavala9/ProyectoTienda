package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
//@Table(name="tbl_Usuarios", catalog="proyecto", schema="")
@Table(name="tbl_Usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long Usu_id;
	
	@Column(nullable=false, unique=true, length=45)
	private String Usu_email;
	
	@Column(nullable=false, length=45)
	private String Usu_nombre;
	
	@Column(nullable=false, length=64)
	private String Usu_pass;

	public Long getUsu_id() {
		return Usu_id;
	}

	public String getUsu_email() {
		return Usu_email;
	}

	public void setUsu_email(String usu_email) {
		Usu_email = usu_email;
	}

	public void setUsu_id(Long usu_id) {
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
