package com.javapractice.searchAlgorithms;

/**
 *
 *  https://www.geeksforgeeks.org/linear-search/
 *
 *  <p>
 *      The time complexity of above algorithm is O(n).

        Linear search is rarely used practically because other search algorithms such as the binary search
        algorithm and hash tables allow significantly faster searching comparison to Linear search.
 *
 *  </p>
 *
 * */
public class LinearSearch {


      public int linearSearch (int [] array, int element){
          int counter=0;
           for(int i : array){

               if(i==element){
                   return  counter;
               }
               counter++;
           }

           return -1;

      }



    public static void main(String...args){

          int [] arr={20,25,40,60,70};
          int element=25;
          LinearSearch linearSearch= new LinearSearch();
          int result= linearSearch.linearSearch(arr,element);
           if(result!=-1)
          System.out.println("Element present at "+result);
           else
               System.out.println(" Element does not exist");

    }
}
