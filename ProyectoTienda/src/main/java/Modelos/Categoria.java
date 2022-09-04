package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_CategoriaProductos", catalog="proyecto", schema="")
public class Categoria {

	@Id
	@Column
	private Integer catProd_id;
	
	@Column
	private String catProd_nombre;
	
	@Column
	private String catProd_descripcion;

	public Integer getCatProd_id() {
		return catProd_id;
	}

	public void setCatProd_id(Integer catProd_id) {
		this.catProd_id = catProd_id;
	}

	public String getCatProd_nombre() {
		return catProd_nombre;
	}

	public void setCatProd_nombre(String catProd_nombre) {
		this.catProd_nombre = catProd_nombre;
	}

	public String getCatProd_descripcion() {
		return catProd_descripcion;
	}

	public void setCatProd_descripcion(String catProd_descripcion) {
		this.catProd_descripcion = catProd_descripcion;
	}
	
	
}
