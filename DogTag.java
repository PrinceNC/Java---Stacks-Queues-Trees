
public class DogTag {
	private int id;
	private float price;
	private String maker;
	
	public DogTag() {
		this.id = 0;
		this.price = 0;
		this.maker = " ";
	}
	
	public DogTag(int id, String maker, float price) {
		this.id = id;
		this.price = price;
		this.maker = maker;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public String getMaker() {
		return maker;
	}
	
	public void setMaker(String maker) {
		this.maker = maker;
	}

	@Override
	public String toString() {
		return "DogTag [id=" + id + ", price=" + price + ", maker=" + maker + "]";
	}
	
	public void display() {
		System.out.println(toString());
	}
	
}
