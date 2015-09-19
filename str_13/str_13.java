import java.util.*;

class str_13{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		String str2 = input.nextLine();

		System.out.println("Str2 is a permutation of Str1: " + isPermutation(str, str2));
	}

	public static boolean isPermutation(String str, String str2){
		if(str.length()!=str2.length()){
			return false;
		}
		HashMap<Character, Integer> charMap = new HashMap<Character, Integer>();

		for(int i=0; i<str.length(); i++){
			if(charMap.get(str.charAt(i))==null){
				charMap.put(str.charAt(i), 1);
			}
			else{
				charMap.put(str.charAt(i), charMap.get(str.charAt(i)) + 1);
			}
		}

		for(int j=0; j<str2.length(); j++){
			if(charMap.get(str2.charAt(j)) == null){
				return false;
			}
			else{
				charMap.put(str2.charAt(j), charMap.get(str2.charAt(j)) - 1);
				if(charMap.get(str2.charAt(j)) < 0){
					return false;
				}
			}
		}

		return true;

	}
}