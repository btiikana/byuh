public class Main {
    public static void main(String[] args) {
        String grade = "B";
        String message;

        switch (grade) {
            case "A":
                message = "Excellent!";
                break;
            case "B":
                message = "Good job!";
                break;
            case "C":
                message = "You passed.";
                break;
            case "D":
                message = "Try harder.";
                break;
            case "F":
                message = "Failed.";
                break;
            default:
                message = "Invalid grade.";
        }

        System.out.println(message);  // Output: Good job!
    }
}
