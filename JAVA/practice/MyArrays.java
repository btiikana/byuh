public class MyArrays {
    
    String[] songs;
    int[] favoriteNumbers;
    int[][] multiDimArrays;

    public MyArrays() {
        songs = new String[] {
            "Somebody I used to know", "Queen of heart"
        };

        favoriteNumbers = new int[6];
        favoriteNumbers[0] = 2;
        favoriteNumbers[1] = 4;
        favoriteNumbers[2] = 6;
        favoriteNumbers[3] = 8;
        favoriteNumbers[4] = 10;
        favoriteNumbers[5] = 12;

        multiDimArrays = new int[][] {
            {1, 2, 3, 4 ,5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5},
            {1, 2, 3, 4, 5}
            
        };

        // call methods
        updatingMyArrays();
        printMyArrays();
    }

    public void updatingMyArrays() {
        //Change the songs
        songs[0] = "I'm in love with my guitar - Jason Derulo";
        songs[1] = "When I look at you - Miley Cyrus";

        // Change the numbers
        favoriteNumbers[3] = 2;
        favoriteNumbers[4] = 4;
        favoriteNumbers[5] = 6;
    }

    public void printMyArrays() {
        for (String song : songs) {
            System.out.println(song);
        }
        for (int num : favoriteNumbers) {
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        new MyArrays();
    }
}
