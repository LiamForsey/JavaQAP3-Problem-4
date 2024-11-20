public class Demo {
    
    public static void scaleAll(Scalable[] scalableArray, double factor) {
        for (Scalable scalable : scalableArray) {
            scalable.scale(factor);
        }
    }

    public static void main(String[] args) {
        
        Shape[] shapes = new Shape[5];
        shapes[0] = new Circle(5);
        shapes[1] = new Ellipse(6, 4);
        shapes[2] = new Triangle(3, 4, 5);
        shapes[3] = new EquilateralTriangle(6);
        shapes[4] = new Triangle(7, 8, 9);

       
        System.out.println("Original Shapes:");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }

        
        scaleAll(new Scalable[]{(Scalable) shapes[0], (Scalable) shapes[1], (Scalable) shapes[2], (Scalable) shapes[3], (Scalable) shapes[4]}, 2);

        
        System.out.println("\nScaled Shapes (by factor 2):");
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }
}
