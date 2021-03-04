package chapter7.array;

public class TowDimensionArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        System.out.println(arr.length);  //2 행의 수를 말함
        System.out.println(arr[0].length); //3 1행의 길이.
        System.out.println(arr[1].length); //3 1행의 길이.

        int[][] arr1 = {{1,2,3}, {4,5,6}};

        for(int i=0; i<arr1.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.println(arr1[i][j]);
            }
        }


    }



}
