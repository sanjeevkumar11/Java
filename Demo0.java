

public class Demo0 {
	static int fun (int i) {
		if((i%2)!=0) {
			return i;
		}
		else {
			return fun(fun(i=1));
		}
	}
	public static void main(String[] args) {
		int i=140;
		int c =fun(i);
		System.out.println(c);
	}
}
