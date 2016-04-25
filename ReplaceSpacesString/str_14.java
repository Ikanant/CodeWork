import java.util.*;

/*Replace all the sapces in the stirng with a '%20'*/

class str_14{
	public static void main(String[] args){
		System.out.println("Enter String with enough spaces at the end");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		System.out.println(replaceSpaces(str));
	}

	public static String replaceSpaces(String str){
		char[] charStr = str.toCharArray();
		
		int j=charStr.length-1;

		for(int i=charStr.length-1; i>=0; i--){
			if(charStr[i]!=' ' || j!=charStr.length-1){
				if(charStr[i] != ' '){
					charStr[j] = charStr[i];
					j--;
				}
				else{
					charStr[j] = '0';
					j--;
					charStr[j] = '2';
					j--;
					charStr[j] = '%';
					j--;
				}
			}
		}
		return new String(charStr);
	}
}