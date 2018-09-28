public class ArrayDemo{


  //Make a return function to use for higher taskes
  public static String pArray(int[] ary){
    String a = "[ ";
    for(int i = 0; i < ary.length - 1; i++){
      a = a + ary[i] + ", ";
    }
    a += ary[ary.length - 1] + "]";
    return a;
  }


  //Complete task 0a
  public static void printArray(int[]ary){
    System.out.println(pArray(ary));
  }


//Return function for 0b to use later

public static String pArray2(int[][] ary){
  String a = "[ ";
  for(int i = 0; i < ary.length; i++){
    a += pArray(ary[i]);
  }
  return a + "  ]";
}
// Complete 0b
public static void printArray2(int[][] ary){
  System.out.println(pArray2(ary));
}

//1
public static int countZeroes2D(int[][] ary){
  int counter = 0;
  String a = pArray2(ary);
  for(int i = 0; i < a.length(); i++){
    if (a.charAt(i) == '0'){
      counter += 1;
    }
  }
  return counter;
}

//2a
public static void fill2D(int[][] ary){
  for(int row = 0; row <ary.length; row++){
    for(int coloumn = 0; coloumn < ary[row].length; coloumn++){
      if(coloumn == row){
        ary[row][coloumn] = 3;
      } else {
        ary[row][coloumn] = 1;
      }
    }
  }
}

//2b
public static int[][] fill2DCopy(int[][] vals){
  int[][] answer = new int[vals.length][];
  for(int row = 0; row<vals[0].length; row++){
    for(int coloumn = 0; coloumn<vals[row].length; coloumn++){
      if (vals[row][coloumn] < 0){
        answer[row][coloumn] = 3;
      } else {
        answer[row][coloumn] = 1;
      }
    }
  }
  return answer ;
}

//Main
  public static void main(String[] args){
    int[] l = new int[10];
    printArray(l);
    int[][] m = new int[3][2];
    printArray2(m);
    System.out.println(countZeroes2D(m));
    fill2D(m);
    printArray2(m);
    printArray2(fill2DCopy(m));
  }
}
