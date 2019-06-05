package com.javapractice.searchAlgorithms;

public class BinarySearch {



      private int[] createArray(int [] arr, int startIndex, int endIndex){
          System.out.println(" starIndex "+startIndex +" endIndex "+endIndex);
          int [] result= new int[endIndex-startIndex];

          for(int i=startIndex,j=0 ;i<endIndex;i++,j++){
              result[j]=arr[i];
          }
          return  result;
      }


    public  void binarySearch(int [] arr, int element){

        int size=arr.length;
        if(size !=1) {
            if (element == arr[size / 2]) {
                System.out.println("element found at "+size/2);
            }//element is grater look into right halves
            else if (element > arr[size / 2]) {
                System.out.println(" right halves ");
                binarySearch(createArray(arr, size / 2, size), element);
            } else {
                System.out.println(" left halves");
                binarySearch(createArray(arr, 0, size / 2), element);
            }
        }else{
            System.out.println("element does not exist");
        }


    }

    public static void main(String ...args){

        int [] arr={20,25,40,60,70};
        int element=60;
        BinarySearch binarySearch= new BinarySearch();
        binarySearch.binarySearch(arr,element);

    }
}
