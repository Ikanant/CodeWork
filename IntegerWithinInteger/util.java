import java.util.ArrayList;
import java.util.List;

public class util {
	public static void main(String[] args){

		printSomething(35,33537876);
	}

	public static void printSomething(int A, int B){
		List<Integer> AList = intToList(A);
		List<Integer> BList = intToList(B);

		int positionFound = -1;

		boolean foundFlag = false;
		for(int indexB=0; indexB<BList.size(); indexB++){

			if(BList.get(indexB) == AList.get(0)){
				foundFlag = true;
				for(int indexA=0, tempIndexB = indexB; indexA<AList.size(); indexA++, tempIndexB++){
					if(BList.get(tempIndexB) != AList.get(indexA)){
						foundFlag = false;
						break;
					}
				}

				if(foundFlag == true){
					positionFound=indexB;
					break;
				}
			}

		}

		System.out.println(positionFound);
	}

	public static List<Integer> intToList(int number){
		List<Integer> resultingList = new ArrayList();

		int temp;
		while(number>0){
			temp = number/10;
			temp *= 10;
			resultingList.add(number-temp);
			number /= 10;
		}


		//
		int tempValue;
		int listSize = resultingList.size();
		for(int i=0; i<listSize/2; i++){
			tempValue = resultingList.get(i);
			resultingList.set(i, resultingList.get(listSize-1-i));
			resultingList.set(listSize-1-i, tempValue);
		}


		return resultingList;
	}
}
