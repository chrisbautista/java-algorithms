# Bubble Sort

##    Description:
Bubble sort is a comparison​-based algorithm that compares each pair of elements in an array and swaps them if they are out of order until the entire array is sorted. For each element in the list, the algorithm compares every pair of elements.

##    Use cases:
##    Test cases:

1. Sorted list
2. Unsorted list
3. Unsorted list of 100
4. Unsorted list of 300
5. Unsorted list of 300 with duplicates

##    Solution:

```java

    public class BubbleSort {
        ...


    public static int[] sort(int []inputList){
        int n = inputList.length;
        int ctr = 1;
        int []outputList = inputList;
        boolean swapped = false;
        
        for(int j=n; j > 0; j--){   
            swapped = false;
            for(int i=0; i < j-1; i++){   
                if(outputList[i] > outputList[i+1]){
                    int tmp = outputList[i];
                    outputList[i] = outputList[i+1];
                    outputList[i+1] = tmp;
                    swapped = true;
                }                                
                ctr++;
            }    
            n--;
            
            if(!swapped){ 
                break; 
            }
        }    

        out("\n# of iterations: " +  ctr);

        return outputList;
    }



        ...
    }// end BubbleSort
```

##    Performance:
##    Reference:

https://brilliant.org/wiki/bubble-sort/