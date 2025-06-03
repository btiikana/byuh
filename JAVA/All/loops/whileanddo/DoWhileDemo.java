class DoWhileDemo {
    public static void main(String[] args){
        int count = 1;
        // All do expressions are read at the bottom of the loop..
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
    }
}

