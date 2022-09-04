package Modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_Productos", catalog="proyecto", schema="")
public class Productos {

	@Id
	@Column
	private Integer Prod_id;
	
	@Column
	private String Prod_nombre;
	
	@Column
	private String Prod_precio;
	
	@Column
	private String Prod_stock;
	
	@Column
	private String Prod_img;
	
	@Column
	private Integer CatProd_id;

	public Integer getProd_id() {
		return Prod_id;
	}

	public void setProd_id(Integer prod_id) {
		Prod_id = prod_id;
	}

	public String getProd_nombre() {
		return Prod_nombre;
	}

	public void setProd_nombre(String prod_nombre) {
		Prod_nombre = prod_nombre;
	}

	public String getProd_precio() {
		return Prod_precio;
	}

	public void setProd_precio(String prod_precio) {
		Prod_precio = prod_precio;
	}

	public String getProd_stock() {
		return Prod_stock;
	}

	public void setProd_stock(String prod_stock) {
		Prod_stock = prod_stock;
	}

	public String getProd_img() {
		return Prod_img;
	}

	public void setProd_img(String prod_img) {
		Prod_img = prod_img;
	}

	public Integer getCatProd_id() {
		return CatProd_id;
	}

	public void setCatProd_id(Integer catProd_id) {
		CatProd_id = catProd_id;
	}
	
	
}
