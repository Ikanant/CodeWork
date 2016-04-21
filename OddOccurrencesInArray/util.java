import java.util.List;
import java.util.ArrayList;

class util{
  public static void main(String[] args){
    int A[] = {9,3,9,3,9,7,9};

    System.out.println(solution(A));
  }

  public static int solution(int []A){

    int found = 0;
    for(int i=0; i<A.length-3; i+=4){
      if(A[i] != A[i+2]){
        found = A[i];
        break;
      }

      if(A[i+1] != A[i+3]){
        found = A[i+1];
        break;
      }
    }
    found = A[A.length-2];

    return found;
  }
}
