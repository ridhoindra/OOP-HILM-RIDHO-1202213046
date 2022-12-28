public class Calculation implements Runnable{
    private double radius,side,area;
    private final double phi = 3.14;


    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPhi() {
        return this.phi;
    }


    public void setSquare(double side) throws IllegalArgumentException {
        if (side<1) {
            throw new IllegalArgumentException("Side value is invalid");
        }
        this.area = side*side;
    }

    public double getSquare() {
        return this.area;
    }

    public void setCircle(double radius) throws IllegalArgumentException{
        if (radius<1) {
            throw new IllegalArgumentException("Radius value is invalid");
        }
        this.area = phi*radius*radius;
    }

    public double getCircle() {
        return this.area;
    }

    public void setTrapezoid(double a, double b, double t) throws IllegalArgumentException{
        if (a<1 || b<1 || t<1) {
            throw new IllegalArgumentException("Sides and Height value is invalid");
        }
        this.area = ((a+b)*t)/2;
    }

    public double getTrapezoid() {
        return this.area;
    }

    public void run() {
        System.out.println("Program will start in ...");
        for (int i = 3;i>0;i--){
            try {
                System.out.println("Starting with thread "+i);
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
