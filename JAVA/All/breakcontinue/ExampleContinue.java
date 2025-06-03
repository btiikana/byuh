public class ExampleContinue {
    public static void main(String[] args) {
        String[] myStrings = {
            "//Aloha", "World", "Welcome", "//Home"
        };

        int y = 5;
        System.out.println("Words that start with // are removed:");
        for (int i=0; i<myStrings.length; i++) {
            if (myStrings[i].startsWith("//")) {
                continue;
            }
            System.out.println(myStrings[i]);
        }
        System.out.println("Displaying all original contents here:");
        for (var word : myStrings) {
            System.out.println(word);
        }
        
    }
}