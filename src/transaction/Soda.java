package transaction;

public class Soda extends WGS {

	protected int ice;
	
	public Soda(String id, String name, int price, int ice) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		this.ice = ice;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name + ice;
	}

	public int getIce() {
		return ice;
	}

	public void setIce(int ice) {
		this.ice = ice;
	}

}
