/*
Problem:
Implement a method to perform basic string compresion using the counts of repeated characters. 
If the "Compressed string would not become smaller than the original string your method should return the original string.*/
import java.util.*;

class str_15{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();

		System.out.println(compress(str));
	}

	public static String compress(String str){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i=0; i<str.length(); i++){
			if(map.get(str.charAt(i))==null){
				map.put(str.charAt(i), 1);
			}
			else{
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}
		}

		String newStr = "";
		for(int j=0; j<str.length(); j++){
			if(map.get(str.charAt(j)) != 0){
				newStr += str.charAt(j);
				newStr += map.get(str.charAt(j));
				map.put(str.charAt(j), 0);
			}
		}

		if(newStr.length() >= str.length()){
			return str;
		}
		else{
			return newStr;	
		}
	}
}