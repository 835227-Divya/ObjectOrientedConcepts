package Section3;

public class Product {

	private Long id;
	private String productName;
	private String supplierName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSuppliername() {
		return supplierName;
	}

	public void setSuppliername(String suppliername) {
		this.supplierName = suppliername;

	}

	public Product() {
		// TODO Auto-generated constructor stub
	}

	public Product(long id, String productName, String supplierName) {
		this.id = id;
		this.productName = productName;
		this.supplierName = supplierName;
	}

	@Override
	public String toString() {
		return +id + ":" + productName + ":" + supplierName;

	}

}
