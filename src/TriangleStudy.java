public class TriangleStudy {
    boolean isRightTriangle(Triangle triangle) {
//        W trójkącie nie jest określone który bok to jest przeciwprostokątna
//        Sprawdzane są wg twierdzenia Pitagorasa wszystkie przypadki
//        Dzięki logicznemu OR zmienna rightAngled przyjmie wartość true gdy jeden z przypadków równania będzie prawdziwy
        boolean rightAngled = false;
        rightAngled = (rightAngled || (triangle.siteA*triangle.siteA == triangle.siteB*triangle.siteB + triangle.siteC*triangle.siteC));
        rightAngled = (rightAngled || (triangle.siteB*triangle.siteB == triangle.siteA*triangle.siteA + triangle.siteC*triangle.siteC));
        rightAngled = (rightAngled || (triangle.siteC*triangle.siteC == triangle.siteB*triangle.siteB + triangle.siteA*triangle.siteA));
        return rightAngled;
    }
}
