package hw11_hashCode;
/* Instead of the equalsPoint method presented, override the equals and hashCode methods in the class.*/

import java.util.Objects;

class Point {
    public double x; // абсцисса точки
    public double y; // ордината точки

    // возвращает строку с описанием точки
    public String toString() {
        return "(" + x + ";" + y + ")";
    }

    // выводит на экран описание точки
    public void printPoint() {
        System.out.print(this.toString());
    }

    // метод перемещает точку на указанный вектор
    public void movePoint(double a, double b) {
        x += a;
        y += b;
    }

    // метод изменяет координаты точки на указанные
    public void setPoint(double a, double b) {
        x = a;
        y = b;
    }

    // конструктор по умолчанию, создающий точку в начале координат
    public Point() {
        x = 0.0;
        y = 0.0;
    }

    // конструктор, создающий точку с указанными координатами
    public Point(double a, double b) {
        x = a;
        y = b;
    }

    // метод вычисляющий расстояние между точками
    public double length(Point p) {
        return Math.sqrt(Math.pow(p.x - x, 2) + Math.pow(p.y - y, 2));
    }

    @Override
    public int hashCode() {
        return (int) (31 * Double.hashCode(x) + Double.hashCode(y) * Math.abs(x-y));
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        if (x != point.x) {
            return false;
        }
        if (y != point.y) {
            return false;
        }
        return (this.x == point.x && this.y == point.x);
    }

    //    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Point point = (Point) o;
//        return Double.compare(point.x, x) == 0 && Double.compare(point.y, y) == 0;
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(x, y);
//    }

    // метод проверяющий совпадают ли точки
//    public boolean equalsPoint(Point p) {
//        if (this.x == p.x && this.y == p.y) {
//            return true;
//        } else {
//            return false;
//        }
//    }
}
