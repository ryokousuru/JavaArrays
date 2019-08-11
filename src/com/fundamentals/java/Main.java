package com.fundamentals.java;

public class Main {

    /*
     * pages 19-20; example of passing arrays as parameters
     * this method is called towards the bottom of this page
     * */

    static void Show(String[] mega) {
        System.out.println("The first color is " + mega[0]);
        System.out.println("The second color is " + mega[1]);
        System.out.println("The next color is " + mega[2]);
        System.out.println("The last color is " + mega[3]);
    }

    /*
     * passing arrays as parameters combined with iterating through
     * a multidimensional array
     *combination of examples on pages 17 -18 & 19 - 20
     *
     * */

    static void Building(String[][] brick) {  //array brick is declared & defined at the end prior to method call
        for (int e = 0; e < 5; e++) {
            for (int f = 0; f < 4; f++) {
                System.out.println("The building at row " + (e + 1) + " column " + (f + 1) + " is the " + brick[e][f]);
            }
        }
    } // end of method

    public static void main(String[] args) {


        /*
         * Declearing an array that will hold 4 elements
         * based on page 9 example
         * */

        int[] one = new int[4];
        one[0] = 7;    //define the elements of the array (computers count from zero instead of one)
        one[1] = 8;
        one[2] = 9;
        one[3] = 10;  //elements zero through three make up the four elements

        //Displaying the elements in the array based on page 10 example

        System.out.println("In a week there are " + one[0] + " days.");
        System.out.println("Multiply two by itself once and then again in order to get " + one[1]);
        System.out.println("The number of seconds in an hour is a multiple of " + one[2]);
        System.out.println("When counting, an second digit appears when reaching the number " + one[3]);

        //page 11 example; using arrays with strings
        String[] cat = new String[4];   //array has four elements
        cat[0] = "paw";
        cat[1] = "whiskers";
        cat[2] = "tail";
        cat[3] = "meow";

        System.out.println("The kitten touched my hand with her " + cat[0] + ".");
        System.out.println("The " + cat[1] + " allow the kitten to feel things in the dark.");
        System.out.println("The pup is really happy sing his " + cat[2] + " is rapidly going back and forth.");
        System.out.println(cat[3] + " means the kitty would like to have some chow.");

        //page 12 - illustrating uses of standard operator (+) with string and integer arrays
        String[] ja = new String[4];
        ja[0] = "ichi";
        ja[1] = "ni";
        ja[2] = "san";
        ja[3] = "yon";

        int[] no = new int[4];
        no[0] = 1;
        no[1] = 2;
        no[2] = 3;
        no[3] = 4;

        System.out.println(ja[0] + " means " + no[0] + " in Japanese.");
        System.out.println(ja[1] + " is the Japanese word for " + no[1]);
        System.out.println(ja[2] + " is the word for " + no[2]);
        System.out.println(" ....and " + ja[3] + " is the word for " + no[3] + ".");

        //page 14 - initializing arrays
        int[] cap = {19, 20, 21, 22};
        System.out.println("An example of a prime number is " + cap[0]);
        System.out.println("Four times five is " + cap[1]);
        System.out.println("Five squared minus four is " + cap[2]);
        System.out.println("Eleven by two is " + cap[3]);

        //page 15 - iterate through the elements of an array; uses 2 for loops
        int[] map = new int[5];

        for (int b = 0; b < 5; b++)
            map[b] = b;

        for (int b = 0; b < 5; b++)
            System.out.println("The for loop puts map[" + b + "] at " + map[b]);

        /*
            pages 16 & 17 - define a multidimensional array
            first number is the number of rows; second number is the number of columns
         */
        String[][] cube = new String[5][4];
        //Display the multidimensional array
        cube[0][0] = "cat";
        cube[0][1] = "dog";
        cube[0][2] = "fish";
        cube[0][3] = "flamingo";
        cube[1][0] = "antelope";
        cube[1][1] = "giraffe";
        cube[1][2] = "zebra";
        cube[1][3] = "horse";
        cube[2][0] = "polar bear";
        cube[2][1] = "gorilla";
        cube[2][2] = "sea otter";
        cube[2][3] = "penguin";
        cube[3][0] = "chimpanzee";
        cube[3][1] = "tiger";
        cube[3][2] = "rhino";
        cube[3][3] = "cheetah";
        cube[4][0] = "hippo";
        cube[4][1] = "lion";
        cube[4][2] = "kangaroo";
        cube[4][3] = "camel";

        //Display the multi-dimensional array
        System.out.println("The animal at row 1 column 1 is a " + cube[0][0]);
        System.out.println("The animal at row 1 column 2 is a " + cube[0][1]);
        System.out.println("The animal at row 1 column 3 is a " + cube[0][2]);
        System.out.println("The animal at row 1 column 4 is a " + cube[0][3]);
        System.out.println("The animal at row 2 column 1 is an " + cube[1][0]);
        System.out.println("The animal at row 2 column 2 is a " + cube[1][1]);
        System.out.println("The animal at row 2 column 3 is a " + cube[1][2]);
        System.out.println("The animal at row 2 column 4 is a " + cube[1][3]);
        System.out.println("The animal at row 3 column 1 is a " + cube[2][0]);
        System.out.println("The animal at row 3 column 2 is a " + cube[2][1]);
        System.out.println("The animal at row 3 column 3 is a " + cube[2][2]);
        System.out.println("The animal at row 3 column 4 is a " + cube[2][3]);
        System.out.println("The animal at row 4 column 1 is a " + cube[3][0]);
        System.out.println("The animal at row 4 column 2 is a " + cube[3][1]);
        System.out.println("The animal at row 4 column 3 is a " + cube[3][2]);
        System.out.println("The animal at row 4 column 4 is a " + cube[3][3]);
        System.out.println("The animal at row 5 column 1 is a " + cube[4][0]);
        System.out.println("The animal at row 5 column 2 is a " + cube[4][1]);
        System.out.println("The animal at row 5 column 3 is a " + cube[4][2]);
        System.out.println("The animal at row 5 column 4 is a " + cube[4][3]);

        /*
         * pages 17 & 18 - example of iterating through a two dimensinoal array
         * starts by defining the multidimensional array
         * */
        String[][] chop = new String[5][4];

        //define the multidimensional array
        chop[0][0] = "Finland";
        chop[0][1] = "Germay";
        chop[0][2] = "Slovenia";
        chop[0][3] = "Japan";
        chop[1][0] = "France";
        chop[1][1] = "Czech Republic";
        chop[1][2] = "Malaysia";
        chop[1][3] = "Italy";
        chop[2][0] = "Greece";
        chop[2][1] = "Lithuania";
        chop[2][2] = "Norway";
        chop[2][3] = "Hungary";
        chop[3][0] = "Latvia";
        chop[3][1] = "New Zealand";
        chop[3][2] = "Ukraine";
        chop[3][3] = "South Korea";
        chop[4][0] = "Iceland";
        chop[4][1] = "Bulgaria";
        chop[4][2] = "Australia";
        chop[4][3] = "Armenia";

        /*
         * display the multidimensional array by iterating through it
         * uses two four loops to do this
         * */

        for (int c = 0; c < 5; c++) {
            for (int d = 0; d < 4; d++) {
                System.out.println("The country at row " + (c + 1) + " column " + (d + 1) + " is " + chop[c][d]);
            } // end of inside for loop
        } // end of outside for loop

        /*
         * pages 19-20; example of passing arrays as parameters
         * see the very top of this page for the mega method
         * */

        String[] mega = new String[4];
        mega[0] = "gold";
        mega[1] = "white";
        mega[2] = "red";
        mega[3] = "brown";

        //call the method with the array parameter
        Show(mega);

        //declare & define array for the 'Building' method (above)

        String[][] brick = new String[5][4];
        brick[0][0] = "post office";
        brick[0][1] = "library";
        brick[0][2] = "school";
        brick[0][3] = "city hall";
        brick[1][0] = "federal building";
        brick[1][1] = "shopping mall";
        brick[1][2] = "airport";
        brick[1][3] = "railway station";
        brick[2][0] = "grocery store";
        brick[2][1] = "bowling alley";
        brick[2][2] = "bicycle shop";
        brick[2][3] = "bus station";
        brick[3][0] = "court house";
        brick[3][1] = "bookstore";
        brick[3][2] = "restaurant";
        brick[3][3] = "dry cleaner";
        brick[4][0] = "museum";
        brick[4][1] = "hotel";
        brick[4][2] = "hair salon";
        brick[4][3] = "art gallery";

        Building(brick); //calling the building method

    }
}





