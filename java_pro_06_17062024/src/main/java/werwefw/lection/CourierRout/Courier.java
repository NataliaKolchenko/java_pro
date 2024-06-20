package werwefw.lection.CourierRout;

import java.util.*;

public class Courier {

    public static void main(String[] args) {

        var mapGenerator = new MapGenerator();
//         System.out.println(
//         new MapPrinter().printRawData(
//         mapGenerator.getMap()));
//        System.out.println(
//                new MapPrinter().printColoredMap(
//                        mapGenerator.getMap()));

        var waveAlgorithm = new WaveAlgorithm(mapGenerator.getMap());
        //установка локации курьера
        Point2D startPoint = new Point2D(5, 5);
        Point2D endPoint = new Point2D(1,12);

        System.out.println("Start point:" + startPoint);
        System.out.println("End point:" + endPoint+'\n');

        waveAlgorithm.colorize(startPoint, endPoint);

//         System.out.println(
//         new MapPrinter().printColoredMap(
//         mapGenerator.getMap()));

        System.out.println(
                new MapPrinter().printRawData(
                        mapGenerator.getMap()));

        System.out.println(waveAlgorithm.getRoad1(endPoint, startPoint));
        System.out.println();

        System.out.println(
                new MapPrinter().printRawData(
                        mapGenerator.getMap()));
    }
}

    class Point2D {
        int x, y;

    public Point2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("x: %d  y: %d", x, y);
    }
}

    class MapGenerator {
        int[][] map;

    public MapGenerator() {
        int[][] initialMap = {
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1},
                {-1, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, -1, 0, 0, -1, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, -1, 0, -1, -1, -1, -1, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1},
                {-1, -1, -1, 0, -1, 0, -1, 0, 0, -1, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, -1, 0, -1, 0, 0, -1, -1, -1, 0, 0, -1},
                {-1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, -1, 0, 0, 0, 0, -1, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, -1, -1, -1, -1, -1, -1, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, 0, 0, 0, -1, -1, -1, -1, -1, -1, -1, 0, 0, 0, -1},
                {-1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1},
                {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1}
        };

        this.map = initialMap;
    }

    public int[][] getMap() {
        return map;
    }

//    public void setCat(Point2D pos) {
//        map[pos.x][pos.y] = -2;
//    }
//
//    public void setExit(Point2D pos) {
//        map[pos.x][pos.y] = -3;
//    }
}

class MapPrinter {

    public String printRawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : map) {
            for (int cell : row) {
                sb.append(String.format("%5d", cell));
            }
            sb.append("\n");
        }
        sb.append("\n".repeat(3));

        return sb.toString();
    }

    public String printColoredMap(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int[] row : map) {
            for (int cell : row) {
                switch (cell) {
                    // case 0: sb.append("░"); break;
                    case 0 -> sb.append("░");
                    case -1 -> sb.append("▓");
                    case -2 -> sb.append("К");
                    case -3 -> sb.append("E");
                    default -> sb.append(" ");
                }
            }
            sb.append("\n");
        }
        sb.append("\n".repeat(3));
        return sb.toString();
    }
}

class WaveAlgorithm {
    int[][] map;

    public WaveAlgorithm(int[][] map) {
        this.map = map;
    }

    public void colorize(Point2D startPoint, Point2D endPoint) {
        Queue<Point2D> queue = new LinkedList<>();
        queue.add(startPoint);
        map[startPoint.x][startPoint.y] = 1;
        map[endPoint.x][endPoint.y] = 500;


        while (!queue.isEmpty()) {
            Point2D p = queue.remove();

            if (map[p.x - 1][p.y] == 0) {
                queue.add(new Point2D(p.x - 1, p.y));
                map[p.x - 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y - 1] == 0) {
                queue.add(new Point2D(p.x, p.y - 1));
                map[p.x][p.y - 1] = map[p.x][p.y] + 1;
            }
            if (map[p.x + 1][p.y] == 0) {
                queue.add(new Point2D(p.x + 1, p.y));
                map[p.x + 1][p.y] = map[p.x][p.y] + 1;
            }
            if (map[p.x][p.y + 1] == 0) {
                queue.add(new Point2D(p.x, p.y + 1));
                map[p.x][p.y + 1] = map[p.x][p.y] + 1;
            }
        }
    }

    public HashMap<Integer, Point2D> getRoad1(Point2D start, Point2D exit) {
        HashMap<Integer, Point2D> roadMap = new HashMap<>();
        roadMap.put(500, new Point2D(start.x,start.y));
        Point2D newPoint = new Point2D(start.x,start.y);

        SortedMap<Integer, Point2D> tempSortedMap;
        int tempPoint = map[newPoint.x][newPoint.y];

        while (map[newPoint.x][newPoint.y] != map[exit.x][exit.y]) {
            tempSortedMap = new TreeMap<>();

                if (map[newPoint.x-1][newPoint.y] == -1){ // up
                } else {
                    tempPoint = map[newPoint.x-1][newPoint.y];
                    tempSortedMap.put(tempPoint, new Point2D(newPoint.x-1,newPoint.y));
                }

                if (map[newPoint.x][newPoint.y+1] == -1) { // left
                } else if (map[newPoint.x][newPoint.y+1] < tempPoint) {
                    tempPoint = map[newPoint.x][newPoint.y+1];
                    tempSortedMap.put(tempPoint, new Point2D(newPoint.x,newPoint.y+1));
                }

                if (map[newPoint.x+1][newPoint.y] == -1) { // down
                } else if (map[newPoint.x+1][newPoint.y] < tempPoint) {
                    tempPoint = map[newPoint.x+1][newPoint.y];
                    tempSortedMap.put(tempPoint, new Point2D(newPoint.x+1,newPoint.y));
                }

                if (map[newPoint.x][newPoint.y-1] == -1) { // right
                } else if (map[newPoint.x][newPoint.y-1] < tempPoint) {
                    tempPoint = map[newPoint.x][newPoint.y-1];
                    tempSortedMap.put(tempPoint, new Point2D(newPoint.x,newPoint.y-1));
                }

            roadMap.put(tempSortedMap.firstKey(), tempSortedMap.get(tempSortedMap.firstKey()));
            tempPoint = tempSortedMap.firstKey();


            newPoint.x = tempSortedMap.get(tempSortedMap.firstKey()).x;
            newPoint.y = tempSortedMap.get(tempSortedMap.firstKey()).y;

        }



        for (int i = 2; i <= 11; i++) {
            map[roadMap.get(i).x][roadMap.get(i).y] = 111;
        }




        return roadMap;
    }

}
