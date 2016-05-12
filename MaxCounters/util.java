class util {
  public static void main(String[] args) {
    int N = 3;
    int[] A = {1,1,1,3,5,2,9,1,6};

    for(int val: solution(N, A)){
        System.out.print(val + " ");
    }
  }

  public static int[] solution(int N, int[] A) {
    int[] result = new int[N];
    int max = 0;
    int lastMax = 0;

    for (int val: A){
      val--;


      if(val < N){
        result[val] = result[val]+1;

        if(result[val] > max) {
          max = result[val];
        }
      } else {
        lastMax += max;
        max=0;
        result = new int[N];;
      }
    }

    for(int i=0; i<result.length; i++){
      result[i] += lastMax;
    }

    return result;
  }
}

/*
1 1 1 3 5 2 9 1 6


1 0 0
2 0 0
3 0 0
0 0 0
0 1 0
0 0 0
1 0 0
0 0 0 +5

1 0 0
2 0 0
3 0 0
3 3 3
3 4 3
4 4 4
5 4 4
5 5 5
*/
