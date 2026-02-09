package Array;

public class checkfreaquency {
    public static void main (String args [] ){

        int[] arr = { 1 , 3, 4, 2, 2, 3, 7, 2, 3, 7 } ;
        int x = 9 ;
        int count  = 0 ;

        for ( int i = 0 ; i < arr.length; i++ ){
            if (arr[i] == x){
                count++;
            }
        }
        System.out.println(count);
    }
}
