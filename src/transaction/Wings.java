package transaction;

public class Wings extends WGS {

	protected String sauce;
	
	public Wings(String id, String name, int price, String sauce) {
		super(id, name, price);
		// TODO Auto-generated constructor stub
		this.sauce = sauce;
	}

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return name + sauce;
	}

	public String getSauce() {
		return sauce;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

}
