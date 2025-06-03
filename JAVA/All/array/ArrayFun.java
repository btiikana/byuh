public class ArrayFun {
    
    public static void main(String[] args) {
        /*First Declaration Method*/
        double[] prices = new double[4];
        /*Second Declaration Method*/
        int[] books;
        books = new int[3];

        prices[0] = 5.00;
        prices[1] = 10.00;
        prices[2] = 1.00;
        prices[3] = 2.00;

        books[0] = 2;
        books[1] = 1;
        books[2] = 4;

        // Prices
        System.out.println("One slice of Pie will cost " + prices[0] + "..");
        System.out.println(prices[1] + " is the average price of a gift card..");
        System.out.println("You are poor if you carry " + prices[2] + " bills in your wallet..");
        System.out.println("Gas used to only cost " + prices[3] + " per gallon..");

        // Books
        System.out.println("The last " + books[0] + " books were rented out..");
        System.out.println("I need to buy " + books[1] + " more book for Spring semester..");
        System.out.println(books[2] + " books were given out for free last semester for the CFM course.");
    }
}
