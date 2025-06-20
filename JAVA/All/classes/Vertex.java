public class Vertex {
    int x;
    int y;

    /* If value is provided in main class object then a parameterized 
    Constructor is needed*/
    public Vertex(int xx, int yy) {
        x = xx;
        y = yy;
    }
    
    /* If value is not provided in the main class object then default
     constructor has to have variables declared and hold values*/
    public Vertex () {
        x = 0;
        y = 0;
    }
}