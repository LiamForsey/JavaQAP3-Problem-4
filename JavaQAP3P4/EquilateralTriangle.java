public class EquilateralTriangle extends Triangle {
    private double side;

   
    public EquilateralTriangle(double side) {
        super(side, side, side);
        this.side = side;
    }

    
    @Override
    public double getArea() {
        return (Math.sqrt(3) / 4) * side * side;
    }

    
    @Override
    public double getPerimeter() {
        return 3 * side;
    }

    
    @Override
    public void scale(double factor) {
        side *= factor;
    }
}
