class util {
	public static void main(String[] args){
		int a = 1;
		int b = 2;

		//Swap:
		a = a+b;
		b = a-b;
		a = a-b;

		System.out.println("a: " + a + "\nb: " + b);
	}
}
