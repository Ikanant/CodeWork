import java.util.*;

class str_11{

	//Determine if String has all unique characters
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		System.out.println("Is unique: " + isUnique(str));
	}

	public static boolean isUnique(String str){
		Map<Character, Boolean> characterMap = new HashMap<Character, Boolean>();

		for(int i=0; i<str.length(); i++){
			if(characterMap.get(str.charAt(i)) != null){
				return false;
			}
			else{
				characterMap.put(str.charAt(i), true);
			}
		}
		return true;
	}
}