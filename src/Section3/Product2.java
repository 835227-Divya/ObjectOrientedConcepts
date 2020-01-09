package Section3;

public class Product2 {

	private long id;
	private String productName;
	private String supplierName;
	public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id=id;
		}public void setSupplierName(String supplierName) {
			this.supplierName = supplierName;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName=productName;
		}
		public String getSuppliername() {
			return supplierName;
		}
		public void setSuppliername(String suppliername) {
			this.supplierName=suppliername;
			
		}
		public Product2() {
		}
		public Product2(long id,String productName,String supplierName) {
			this.id=id;
			this.productName=productName;
			this.supplierName=supplierName;
		}

		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (id ^ (id >>> 32));
			result = prime * result + ((productName == null) ? 0 : productName.hashCode());
			result = prime * result + ((supplierName == null) ? 0 : supplierName.hashCode());
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
			Product2 other = (Product2) obj;
			if (id != other.id)
				return false;
			if (productName == null) {
				if (other.productName != null)
					return false;
			} else if (!productName.equals(other.productName))
				return false;
			if (supplierName == null) {
				if (other.supplierName != null)
					return false;
			} else if (!supplierName.equals(other.supplierName))
				return false;
			return true;
		}
		public void display() {
			System.out.println("Product id is"+id);
			System.out.println("Product Name is"+productName);
			System.out.println("Supplier Name is"+supplierName);
			}
}


