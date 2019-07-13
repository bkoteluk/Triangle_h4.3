public class Triangle {
    double siteA;
    double siteB;
    double siteC;
//    double height;

    Triangle(double siteA, double siteB, double siteC /*, double height*/) {
        this.siteA = siteA;
        this.siteB = siteB;
        this.siteC = siteC;
//        this.height = height;
    }

    @Override
    public String toString() {
        return "Trójkąt o bokach a= " + siteA + ", b = " + siteB + ", c = " + siteC /*+ " i wysokości = " + height*/;
    }
}
