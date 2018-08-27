public class BubbleSort {

    public BubbleSort(){
        out("Bubble Sort"); // prints Hello World
       
    }

    public static  long startTimer(){
        return System.nanoTime();
    }

    public static void endTimer(long lStartTime){
        long lEndTime =  System.nanoTime();

		//time elapsed
        long output = (lEndTime - lStartTime) / 1000000;

        System.out.println("Elapsed time in milliseconds: " + output);
    }

    public void showList(String str, double []inputList){
        System.out.print(str + " : ");
        for (int i = 0; i < inputList.length; i++) {
            System.out.print(inputList[i] + ", ");
         }
    }

    // util
    public static void out(String str){
        System.out.println(str);
    }

    public static double[] sort(double []inputList){
        int n = inputList.length;
        boolean swapped = true;
        int limit = 0;

        long lStartTime = startTimer();

        while(swapped && limit<10000) {
            swapped = false;
            for(int i=0; i < n-1; i++){   
                if(inputList[i+1] < inputList[i]){
                    double tmp = inputList[i];
                    inputList[i] = inputList[i+1];
                    inputList[i+1] = tmp;
                    swapped = true;
                }
            }
            limit ++;
        }

        out("");
        endTimer(lStartTime);
        out("How many iterations ? " + limit);

        return inputList;

    }

    
    public static void testCases(){

        double []testList;
        BubbleSort bubblesort = new BubbleSort();

        out("Test 1: Sorted");
        testList = new double[]{1, 2, 3, 4, 100, 120, 900, 1000};
        bubblesort.showList("Unsorted:", testList);
        testList = bubblesort.sort(testList);
        bubblesort.showList("Sorted:", testList);

        
        out("\n\n"+"Test 2: Some are Unsorted");
        testList = new double[]{1, 3, 4, 512, 2, 9, 11, 10, 50, 43, 17};
        bubblesort.showList("Unsorted:", testList);
        testList = bubblesort.sort(testList);
        bubblesort.showList("Sorted:", testList);


        out("\n\n"+"Test 3: set of 100");
        testList = new double[]{642, 898, 905, 770, 873, 193, 874, 970, 39, 458, 100, 408, 292, 890, 296, 24, 700, 372, 393, 645, 418, 4, 945, 233, 937, 285, 198, 129, 960, 252, 348, 235, 271, 966, 273, 811, 272, 925, 91, 242, 312, 639, 622, 225, 838, 105, 482, 469, 963, 323, 953, 420, 468, 858, 472, 42, 565, 583, 596, 763, 839, 13, 483, 128, 303, 850, 721, 331, 505, 284, 891, 548, 842, 427, 588, 595, 118, 671, 459, 520, 417, 232, 609, 179, 228, 454, 433, 921, 268, 500, 218, 846, 657, 798, 32, 161, 173, 230, 203, 780};
        bubblesort.showList("Unsorted:", testList);
        testList = bubblesort.sort(testList);
        bubblesort.showList("Sorted:", testList);

        out("\n\n"+"Test 4: set of 300");
        testList = new double[]{14, 757, 547, 259, 597, 971, 794, 369, 536, 854, 83, 494, 539, 454, 545, 727, 987, 258, 86, 50, 289, 144, 677, 84, 983, 457, 103, 646, 92, 898, 181, 920, 354, 422, 246, 298, 850, 186, 522, 921, 407, 142, 443, 952, 505, 651, 285, 682, 718, 420, 972, 331, 897, 577, 223, 154, 85, 836, 907, 482, 450, 518, 992, 609, 261, 779, 543, 908, 52, 815, 217, 925, 257, 999, 191, 831, 872, 416, 668, 140, 923, 478, 574, 846, 840, 344, 146, 212, 348, 733, 892, 884, 955, 325, 571, 448, 673, 198, 124, 33, 618, 847, 104, 932, 641, 362, 508, 723, 813, 177, 358, 752, 279, 628, 55, 754, 408, 555, 845, 994, 665, 649, 368, 337, 510, 268, 472, 291, 890, 965, 260, 998, 569, 324, 699, 47, 409, 80, 624, 759, 274, 292, 165, 403, 808, 638, 79, 769, 507, 18, 431, 517, 634, 721, 127, 796, 377, 942, 126, 240, 112, 542, 280, 852, 370, 44, 222, 341, 497, 185, 355, 551, 601, 37, 426, 452, 622, 74, 380, 786, 748, 509, 825, 100, 706, 789, 773, 553, 183, 830, 419, 532, 73, 939, 658, 68, 384, 159, 82, 56, 738, 593, 696, 133, 812, 118, 580, 417, 800, 573, 993, 365, 327, 168, 749, 871, 966, 320, 429, 398, 583, 512, 941, 293, 676, 780, 88, 211, 590, 477, 476, 652, 316, 678, 397, 393, 152, 493, 540, 134, 60, 194, 565, 662, 216, 334, 164, 607, 866, 253, 944, 876, 645, 633, 560, 858, 158, 145, 75, 751, 161, 116, 934, 629, 390, 221, 729, 436, 811, 31, 585, 5, 447, 277, 492, 591, 848, 973, 948, 916, 832, 535, 744, 644, 843, 603, 589, 736, 357, 248, 338, 150, 556, 21, 374, 406, 737, 527, 768, 288};
        bubblesort.showList("Unsorted:", testList);
        testList = bubblesort.sort(testList);
        bubblesort.showList("Sorted:", testList);

        out("\n\n"+"Test 5: set of 300 with duplicates");
        testList = new double[]{14, 757, 547, 259, 597, 971, 794, 369, 536, 854, 83, 494, 539, 454, 545, 727, 987, 258, 86, 50, 289, 144, 677, 84, 983, 457, 103, 646, 92, 898, 181, 920, 354, 422, 246, 298, 850, 186, 522, 921, 407, 142, 443, 952, 505, 651, 285, 682, 718, 420, 972, 331, 897, 577, 223, 154, 85, 836, 907, 482, 450, 518, 992, 609, 261, 779, 543, 908, 52, 815, 217, 925, 257, 999, 191, 831, 872, 416, 668, 140, 923, 478, 574, 846, 840, 344, 146, 212, 348, 733, 892, 884, 955, 325, 571, 448, 673, 198, 124, 33, 618, 847, 104, 932, 641, 362, 508, 723, 813, 177, 358, 752, 279, 628, 55, 754, 408, 555, 845, 994, 665, 649, 368, 337, 510, 268, 472, 291, 890, 965, 260, 998, 569, 324, 699, 47, 409, 80, 624, 759, 274, 292, 165, 403, 808, 638, 79, 769, 507, 18, 431, 517, 634, 721, 127, 796, 377, 942, 14, 757, 547, 259, 597, 971, 794, 369, 536, 854, 83, 494, 539, 454, 545, 727, 987, 258, 86, 50, 289, 144, 677, 84, 983, 457, 103, 646, 92, 898, 181, 920, 354, 422, 246, 298, 850, 186, 522, 921, 407, 142, 443, 952, 505, 651, 285, 682, 718, 420, 972, 331, 897, 577, 223, 154, 85, 836, 907, 482, 450, 518, 992, 609, 261, 779, 543, 908, 52, 815, 217, 925, 257, 999, 191, 831, 872, 416, 668, 140, 923, 478, 574, 846, 840, 344, 146, 212, 348, 733, 892, 884, 955, 325, 571, 448, 673, 198, 124, 33, 618, 847, 104, 932, 641, 362, 508, 723, 813, 177, 358, 752, 279, 628, 55, 754, 408, 555, 845, 994, 665, 649, 368, 337, 510, 268, 472, 291, 890, 965, 260, 998, 569, 324, 699, 47, 409, 80, 624, 759, 274, 292, 165, 403, 808, 638, 79, 769, 507, 18, 431, 517, 634, 721, 127, 796, 377, 942, };
        bubblesort.showList("Unsorted:", testList);
        testList = bubblesort.sort(testList);
        bubblesort.showList("Sorted:", testList);


    }
    
    public static void main(String []args) {
        BubbleSort.testCases();
    }


 }