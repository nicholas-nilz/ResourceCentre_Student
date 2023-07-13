
public class Chromebook extends Item{
	private String os;

	public Chromebook(String assetTag, String description, String string) {
		super(assetTag, description);
		this.os = string;
	}

	public String getOs() {
		return os;
	}
	
	public String toString(){
		String output = "";
		// Write your codes here
		return output;
	}

	public static void add(Chromebook cb) {
		// TODO Auto-generated method stub
		
	}
}


