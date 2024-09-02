package example;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;


import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeometricServiceTest {
    @Test
    void testFindPerfectSquares() {
        Square square = new Square(1, 1);
        Square rectangle = new Square(1, 2);
        Triangle triangle = GeometricFactory.generateValidTriangle();
        Line line = new Line(5);

        List<Geometric> geometricsList = new ArrayList<>();
        geometricsList.add(square);
        geometricsList.add(rectangle);
        geometricsList.add(triangle);
        geometricsList.add(line);

        Square actualSquare = new GeometricService().findPerfectSquares(geometricsList).get(0);

        assertEquals(square, actualSquare);
    }

    @ParameterizedTest
    @MethodSource("testParamFindPerfectSquares")
    void testParamFindPerfectSquares(List<Geometric> geometric, List<Square> expectedResult) {
        List<Square> actualSquare = new GeometricService().findPerfectSquares(geometric);
        assertEquals(expectedResult, actualSquare);
    }

    static Stream<Arguments> testParamFindPerfectSquares() {
        Square square = new Square(1, 1);
        Square rectangle = new Square(1, 2);
        Triangle triangle = GeometricFactory.generateValidTriangle();
        Line line = new Line(5);

        return Stream.of(
                Arguments.of(List.of(square), List.of(square)),
                Arguments.of(List.of(square, square), List.of(square, square)),
                Arguments.of(List.of(square, rectangle), List.of(square)),
                Arguments.of(List.of(rectangle), Collections.EMPTY_LIST),
                Arguments.of(List.of(triangle), Collections.EMPTY_LIST),
                Arguments.of(List.of(line), Collections.EMPTY_LIST));

    }

    @ParameterizedTest
    @MethodSource("testFindCirclesInMinMaxRadiusRange")
    void testFindCirclesInMinMaxRadiusRange(List<Geometric> geometrics, List<Circle> expectedResult) {
        List<Circle> actualCircle = new GeometricService().findCirclesInMinMaxRadiusRange(geometrics, 3, 5);
        assertEquals(expectedResult, actualCircle);
    }

    static Stream<Arguments> testFindCirclesInMinMaxRadiusRange() {
        Square square = new Square(1, 1);
        Square rectangle = new Square(1, 2);
        Triangle triangle = GeometricFactory.generateValidTriangle();
        Circle circle1 = new Circle(1);
        Circle circle2 = new Circle(2);
        Circle circle3 = new Circle(3);
        Circle circle4 = new Circle(4);
        Circle circle5 = new Circle(5);
        Circle circle6 = new Circle(6);
        Circle circle7 = new Circle(3);
        Line line = new Line(5);
        return Stream.of(
                Arguments.of(List.of(circle1), Collections.EMPTY_LIST),
                Arguments.of(List.of(circle1, circle2, circle3, circle4, circle5, circle6, circle7),
                        List.of(circle3, circle4, circle5, circle3)),
                Arguments.of(List.of(square), Collections.EMPTY_LIST),
                Arguments.of(List.of(rectangle), Collections.EMPTY_LIST),
                Arguments.of(List.of(triangle), Collections.EMPTY_LIST),
                Arguments.of(List.of(line), Collections.EMPTY_LIST));

    }

    @ParameterizedTest
    @MethodSource("testFindLinesLongerThanLength")
    void testFindLinesLongerThanLength(List<Geometric> geometrics, List<Line> expectedResult) {
        List<Line> actualLine = new GeometricService().findLinesLongerThanLength(geometrics, 15);
        assertEquals(expectedResult, actualLine);
    }

    static Stream<Arguments> testFindLinesLongerThanLength() {
        Square square = new Square(16, 15);
        Square rectangle = new Square(1, 2);
        Triangle triangle = GeometricFactory.generateValidTriangle();
        Circle circle1 = new Circle(15);
        Line line1 = new Line(5);
        Line line2 = new Line(15);
        Line line3 = new Line(50);
        Line line4 = new Line(25);

        return Stream.of(
                Arguments.of(List.of(square), Collections.EMPTY_LIST),
                Arguments.of(List.of(square, rectangle, triangle, circle1, line1, line2, line3, line4),
                        List.of(line3, line4)),
                Arguments.of(List.of(line1, line2), Collections.EMPTY_LIST));

    }

    @ParameterizedTest
    @MethodSource("testCountByTypeSquare")
    void testCountByType(List<Geometric> geometrics, long expectedResult) {
        long actualCountSquare = new GeometricService().countByType(geometrics, Square.class);
        assertEquals(expectedResult, actualCountSquare);
    }

    static Stream<Arguments> testCountByTypeSquare() {
        Square square2 = new Square(16, 15);
        Square square1 = new Square(16, 15);
        Square rectangle = new Square(1, 2);
        Triangle triangle = GeometricFactory.generateValidTriangle();
        Circle circle1 = new Circle(15);
        Line line1 = new Line(5);
        Line line2 = new Line(15);
        Line line3 = new Line(50);
        Line line4 = new Line(25);

        return Stream.of(
                Arguments.of(List.of(square1, square2), 2),
                Arguments.of(List.of(rectangle, triangle, circle1, line1, line2, line3, line4),
                        1),
                Arguments.of(List.of(line1, line2), 0));

    }

    @ParameterizedTest
    @MethodSource("testFindSquaresAndCirclesInRange")
    void testFindSquaresAndCirclesInRange(List<Geometric> geometrics, List<Geometric> expectedResult) {
        List<Geometric> actualList = new GeometricService().findSquaresAndCirclesInRange(geometrics, 3, 6);
        assertEquals(expectedResult, actualList);
    }

    static Stream<Arguments> testFindSquaresAndCirclesInRange() {
        Square square2 = new Square(2, 2);
        Square square1 = new Square(3, 3);
        Square square4 = new Square(4, 4);
        Square square5 = new Square(6, 6);
        Square square6 = new Square(10, 10);

        Square rectangle = new Square(3, 6);
        Triangle triangle = GeometricFactory.generateValidTriangle();

        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(5);
        Circle circle4 = new Circle(6);
        Circle circle5 = new Circle(10);

        Line line1 = new Line(5);
        return Stream.of(
                Arguments.of(List.of(square1, square2, square4, square5, square6), List.of(square1, square4, square5)),
                Arguments.of(List.of(square1, square2, square4, square5, square6, rectangle),
                        List.of(square1, square4, square5, rectangle)),
                Arguments.of(List.of(triangle, line1), Collections.EMPTY_LIST),
                Arguments.of(List.of(circle1, circle2, circle3, circle4, circle5), List.of(circle2, circle3, circle4)),
                Arguments.of(List.of(square1, square2, square4, square5, square6, circle1, circle2, circle3, circle4, circle5),
                        List.of(square1, square4, square5, circle2, circle3, circle4)),
                Arguments.of(List.of(square2, square6, circle1, circle5),
                        Collections.EMPTY_LIST)
        );
    }

    @ParameterizedTest
    @MethodSource("testFindTrianglesWithLargerInscribedCircleThanAverage")
    void testFindTrianglesWithLargerInscribedCircleThanAverage(List<Geometric> geometries, List<Triangle> expectedTriangles) {
        List<Triangle> result = new GeometricService().findTrianglesWithLargerInscribedCircleThanAverage(geometries);
        assertEquals(expectedTriangles, result);
    }

    static Stream<Arguments> testFindTrianglesWithLargerInscribedCircleThanAverage() {
        return Stream.of(
                Arguments.of(
                        List.of(
                                new Triangle(3, 4, 5),   // r = 1
                                new Triangle(6, 8, 10)   // r = 2
                        ),
                        List.of(new Triangle(6, 8, 10))
                ),

                Arguments.of(
                        List.of(
                                new Triangle(3, 4, 5),   // r = 1
                                new Triangle(6, 8, 10),  // r = 2
                                new Triangle(5, 12, 13)  // r = 2
                        ),
                        List.of(new Triangle(6, 8, 10),
                                new Triangle(5, 12, 13)
                        )),

                Arguments.of(
                        List.of(),
                        List.of()
                )
        );
    }
}