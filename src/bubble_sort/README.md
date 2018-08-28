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

 public static double[] sort(double []inputList){
        int n = inputList.length;
        boolean swapped = true;
        int limit = 0;

        long lStartTime = startTimer();

        while(swapped && limit<10000000) { // make sure it doesn't run forever
            swapped = false;
            for(int i=0; i < n-1; i++){   
                if(inputList[i+1] < inputList[i]){
                    double tmp = inputList[i];
                    inputList[i] = inputList[i+1];
                    inputList[i+1] = tmp;
                    swapped = true;
                }
                limit ++;
            }      
        }

        endTimer(lStartTime);
        out("How many iterations ? " + limit);

        return inputList;

    }

```

##    Performance:
##    Reference:

https://brilliant.org/wiki/bubble-sort/