package transaction;

public class Transaction extends WGS {

	protected String custid, email;
	
	public Transaction(String custid, String id, String name, String email, int price) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		this.custid = custid;
		this.email = email;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name + custid + email;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}
