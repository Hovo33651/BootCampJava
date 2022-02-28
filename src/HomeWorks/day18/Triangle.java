package HomeWorks.day18;

public class Triangle {
    double sideA;
    double sideB;
    double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        if (sideA < 1 || sideA > 20) {
            System.out.println("sideA must be in range 1 - 20");
        }
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        if (sideB < 1 || sideB > 20) {
            System.out.println("sideB must be in range 1 - 20");
        }
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        if (sideC < 1 || sideC > 20) {
            System.out.println("sideC must be in range 1 - 20");
        }
        this.sideC = sideC;
    }



}
