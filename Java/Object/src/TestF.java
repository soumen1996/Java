
public class TestF {
	
	public static void main(String[] args) {
		
		Cow c1 = new Cow(1, "Ganga", 10000);
		Cow c2 = new Cow(2, "Gowri", 20000);
		Cow c3 = new Cow(1, "Ganga", 10000);
		Cow c4 = c3;
		
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
		System.out.println(c3.equals(c4));
	
		
	}

}
