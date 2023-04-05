public class Main {
    public static void main(String[] args) {
    }

    public static void printSum() {
        int [][] matrix1 ={{1,2,3},
                          {4,5,6}};
        int [][] matrix2 ={{7,2,1},
                          {0,8,6}};
        int [][] result = {{0,0,0},
                {0,0,0}};

        for(int i = 0;i<=matrix1.length;i++){
            for(int j = 0;j<=matrix2.length;j++){
                result[i][j]=matrix1[i][j]+matrix2[i][j];
            }
        }

    }
}