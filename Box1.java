class Box1 {
    double width, height, depth;
    Box1() {
        width = height = depth = -1.0;
    }
    Box1(double len) {
        width = height = depth = len;
    }
    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }
    double volume() {
        return width * height * depth;
    }
}
class BoxNew extends Box1 {
    double weight;
    BoxNew() {
        super();
        weight = 0.0;
    }
    BoxNew(double len, double wt) {
        super(len);
        weight = wt;
    }
    BoxNew(double w, double h, double d, double wt) {
        super(w, h, d);
        weight = wt;
    }
}
class Boxvalue {
    public static void main(String[] args) {
        BoxNew b1 = new BoxNew(),
               b2 = new BoxNew(5, 30),
               b3 = new BoxNew(4, 7, 5, 12);        
       System.out.println("b1.volume() : " + b1.volume());
       System.out.println("b2.volume() : " + b2.volume());
       System.out.println("b3.volume() : " + b3.volume());
    }
}