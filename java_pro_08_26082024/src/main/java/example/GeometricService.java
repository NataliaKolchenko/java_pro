package example;

import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

@Getter
public class GeometricService {

    public List<Square> findPerfectSquares(List<Geometric> geometries) {
        return geometries.stream()
                .filter(geometric -> geometric instanceof Square)
                .map(Square.class::cast)
                .filter(site -> site.getSideAB() == site.getSideBC())
                .toList();
    }

    public List<Circle> findCirclesInMinMaxRadiusRange(List<Geometric> geometries, double minRadius, double maxRadius) {
        return geometries.stream()
                .filter(geometric -> geometric instanceof Circle)
                .map(Circle.class::cast)
                .filter(circle -> circle.getRadius() >= minRadius && circle.getRadius() <= maxRadius)
                .toList();
    }

    public List<Line> findLinesLongerThanLength(List<Geometric> geometries, double length) {
        return geometries.stream()
                .filter(geometric -> geometric instanceof Line)
                .map(Line.class::cast)
                .filter(line -> line.getLengthL() > length)
                .toList();
    }

    //Метод возвращает список треугольников (класса Triangle),
    // у которых радиус вписанного круга больше среднего радиуса всех кругов в коллекции.
    public List<Triangle> findTrianglesWithLargerInscribedCircleThanAverage(List<Geometric> geometries) {
        //S = sqrt(p * (p-a) * (p-b) * (p-c))
        //p = a+b+c/ 2
        //r = S / p
        double avg = avgRadius(geometries);
        return geometries.stream()
                .filter(geometric -> geometric instanceof Triangle)
                .map(Triangle.class::cast)
                .filter(triangle -> {
                    double a = triangle.getSideAB();
                    double b = triangle.getSideBC();
                    double c = triangle.getSideCA();
                    double minP = (a + b + c) / 2;

                    double S = Math.sqrt(minP * (minP - a) * (minP - b) * (minP - c));
                    return (S / minP) > avg;
                })
                .toList();
    }

    //находим радиус конктресного вписанного круга
    private double calcRadiusTriangle(Triangle triangle) {
        double a = triangle.getSideAB();
        double b = triangle.getSideBC();
        double c = triangle.getSideCA();
        double minP = (a + b + c) / 2;

        double S = Math.sqrt(minP * (minP - a) * (minP - b) * (minP - c));
        return S / minP;
    }

    //находим средний радиус
    private double avgRadius(List<Geometric> geometries) {
        return geometries.stream()
                .filter(geometric -> geometric instanceof Triangle)
                .map(Triangle.class::cast)
                .mapToDouble(triangle -> {
                    double a = triangle.getSideAB();
                    double b = triangle.getSideBC();
                    double c = triangle.getSideCA();
                    double minP = (a + b + c) / 2;
                    double S = Math.sqrt(minP * (minP - a) * (minP - b) * (minP - c));
                    return S / minP;
                })
                .average()
                .orElse(0);
    }

    public long countByType(List<Geometric> geometries, Class<? extends Geometric> type) {
        return geometries.stream()
                .filter(geometric -> type.isInstance(geometric))
                .count();

//        return geometries.stream()
//                .collect(Collectors.groupingBy(Geometric::getClass, Collectors.counting()))
//                .getOrDefault(type, 0L); // Возвращаем количество или 0, если тип не найден

    }

    //Метод возвращает список всех квадратов и кругов,
    // у которых стороны (для квадратов) или радиус (для кругов) находятся в заданном диапазоне.
    public List<Geometric> findSquaresAndCirclesInRange(List<Geometric> geometries, double minValue, double maxValue) {
        return geometries.stream()
                .filter(geometric -> geometric instanceof Square &&
                        (((Square) geometric).getSideAB() >= minValue && ((Square) geometric).getSideAB() <= maxValue) ||
                        geometric instanceof Circle &&
                                (((Circle) geometric).getRadius() >= minValue && ((Circle) geometric).getRadius() <= maxValue))
                .toList();
    }
}