import java.util.ArrayList;

public class MethodsArrayList {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<String>();
        // add() -- Append song to the end of the list
        //e.g
        songs.add("Queen of my heart - Westlife");
        songs.add("Congratulation - Post Malone");
        songs.add("Dark King - Boogie with da hoodie");
        songs.add("When I look at you - Miley Cyrus");

        // add(index) -- Overwrite and push away item back by 1 in the list
        //e.g
        songs.add(3, "Ice - Dez");


        System.out.println("ArrayList created!..");
        System.out.println(songs);

        // set() -- Change or modify item in the list
        //e.g
        songs.set(3, "Baby - Justin Bieber");
        System.out.println("ArrayList modified!");
        System.out.println(songs);

        // get() -- Access the item index
        System.out.println("Item(s): " + songs.get(1) + " and " + songs.get(2) + " are going to be removed from the ArrayList!");

        // remove() -- Delete item in the list
        //e.g
        songs.remove(1);
        //-------OR---------//
        songs.remove("Dark King - Boogie with da hoodie"); // Delete item without specifying index

        System.out.println("ArrayList item successfully deleted!");
        System.out.println(songs);
    }


}
