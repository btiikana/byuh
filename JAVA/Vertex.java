public class Vertex {
    int x;
    int y;

    public Vertex() {
	x = 0;
	y = 0;
    }

    public Vertex(int xx, int yy) {
        x = xx;
        y = yy;
    }

    public Vertex(Vertex other) {
	this.x = other.x;
	this.y = other.y;
    }	

    public void translate(int dx, int dy) {
	x += dx;
	y += dy;
    }
}

