public class DiagonalMatrix {
  // - Create (dynamically) a two dimensional array
  //   with the following matrix. Use a loop!
  //
  //   1 0 0 0
  //   0 1 0 0
  //   0 0 1 0
  //   0 0 0 1
  //
  // - Print this two dimensional array to the output
  public static void main(String[] args) {
    int lengthOfArray =4;
    int[][] twoDim = new int[lengthOfArray][lengthOfArray];
    for (int i = 0; i < lengthOfArray; i++) {
      for (int j = 0; j < lengthOfArray; j++) {
        if (i==j){
          twoDim[i][j]=1;
        } else {
          twoDim[i][j]=0;
        }
      }
    }
    for (int i = 0; i < lengthOfArray; i++) {
      for (int j = 0; j < lengthOfArray; j++) {
        System.out.print(twoDim[i][j] + " ");
      }
      System.out.println();
    }
  }
}
