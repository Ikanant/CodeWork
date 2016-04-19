import java.util.List;
import java.util.ArrayList;

class util{
  public static void main(String[] args){
    int A[] = {2,4,7,2,1,3,1,3,4,7,6,1,2,1,2};

    System.out.println(solution(A));
  }

  public static int solution(int []A){

    List<Integer> list = new ArrayList();

    for(int elem: A){
      if(list.contains(elem)){
        list.remove(new Integer(elem));
      }
      else{
        list.add(elem);
      }
    }



    return list.get(0);
  }
}
