package EnumExample;
enum Class{
FIRST,SECOND,THIRD,FIRTH;
}

public class EnumDemo2 {

	public static void main(String[] args) {
		Class[] b=Class.values();
		for(Class b1:b) {
			System.out.println(b1+"............."+b1.ordinal());
		}

	}

}
