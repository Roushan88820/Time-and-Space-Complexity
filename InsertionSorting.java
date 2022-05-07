import java.util.*;
import java.io.*;

public class Main {

    public static void main( String [] args) {    

    Scanner scn = new Scanner (System.in);
    int n = scn.nextInt();
    int [] arr = new int [n];

    for(int i = 0; i <= arr.length - 1 ; i++ ) {

        arr[i] = scn.nextInt();

    }

    selection_sort(arr);
    print(arr);

  }

  public static void  selection_sort ( int [] arr) {

    for( int jrny = 1 ; jrny <= arr.length - 1 ; jrny++ ) {
        for( int j = jrny - 1 ; j >= 0 ; j--) {

            if( arr[j] > arr[j+1] ) {

                int temp = arr[j + 1] ;
                arr[ j+1 ] = arr[j];
                arr[j] = temp;

            }else {
                break;
            }

        }
    }
  }

    public static void print( int [] arr) {

        for( int var : arr) {
            System.out.print( var + " ");
        }

        System.out.print(".");

    }
}    

