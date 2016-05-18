class util {
	public static void main(String[] args){
		int a = 1;
		int b = 2;

		//Swap:
		a = a+b;
		b = a-b;
		a = a-b;
		System.out.println("a: " + a + "\nb: " + b);
		//OR

		int x = 1;
		int y = 2;

		//Swap:
		x ^= y;
		y ^= x;
		x ^= y;

		System.out.println("x: " + x + "\ny: " + y);
	}
}
