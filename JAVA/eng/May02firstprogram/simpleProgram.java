public class simpleProgram {

    public static void main(String[] args) {
        String hello = "Hello World";
        System.out.println(hello);
        System.out.println(myE(hello));
    }
    public static String myE(String here){
        here += "iamhere";
        return here;
    }

}
