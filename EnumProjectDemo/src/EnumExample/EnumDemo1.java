package EnumExample;
enum Names{
	HARISH,KUMAR,KING,VISHAL;
}
public class EnumDemo1 {
	public static void main(String args[]) {
		    Names[] b1=Names.values();
		    for(Names b:b1) {
		    	System.out.println(b);
		    }
	}

}
