package HomeWorks.day18;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle() {
    }

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        Validator.isRangeSideC(sideA,sideB,sideC);
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
        if (Validator.isRangeSideC(sideC, 1, 20))
            this.sideC = sideC;
    }

    private boolean isTriangleValid(double sideA, double sideB, double sideC) {
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA) {
            return false;
        }
        return true;
    }

    public boolean check(Triangle triangle) {
        return isTriangleValid(triangle.sideA, triangle.sideB, triangle.sideC);
    }

    public boolean isRight(double sideA, double sideB, double sideC) {
        double hyp = Math.max((Math.max(sideA, sideB)), sideC);
        if (hyp == sideA && (sideA * sideA) == (sideB * sideB) + (sideC * sideC)) {
            return true;
        } else if (hyp == sideB && (sideB * sideB) == (sideA * sideA) + (sideC * sideC)) {
            return true;
        } else if (hyp == sideC && (sideC * sideC) == (sideA * sideA) + (sideB * sideB)) {
            return true;
        }
        return false;
    }


    public double countSquareOrPerimeter(Triangle triangle) {
        if (isRight(triangle.sideA, triangle.sideB, triangle.sideC)) {
            double max = Math.max((Math.max(triangle.sideA, triangle.sideB)), triangle.sideC);
            if (max == triangle.sideA) {
                return (triangle.sideB * triangle.sideC) / 2;
            } else if (max == triangle.sideB) {
                return (triangle.sideA * triangle.sideC) / 2;
            } else return (triangle.sideA * triangle.sideB) / 2;
        }
        return triangle.sideA + triangle.sideB + triangle.sideC;
    }


}
