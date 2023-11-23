package lec_1;
//lec_1
public class Point2D {
    private int x, y; // Это координата х и у

    /**
     * Это конструктор ...
     * 
     * @param valueX это координата Х
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) { //конструктор
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) { //конструктор
        this(value, value); //вызываем это из конструктора выше Point2D, где два аргумента
    }

    public Point2D() { //конструктор
        this(0);//вызываем это из конструктора выше Point2D, где 1 аргумент
    }

    public int getX() { //чтение x
        return x;
    }

    public int getY() {//чтение y
        return y;
    }

    public void setX(int value) { //присвоили новый x
        this.x = value;
    }

    public void setY(int value) {//присвоили новый y
        this.y = value;
    }

    private String getInfo() { //вывод красивый
        return String.format("x: %d; y: %d", x, y);
    }

    @Override
    public String toString() { //вывод вызываем getInfo метод
        return getInfo();
    }
// static - обращаемся через имя типа
    public static double distance(Point2D a, Point2D b) { //расстояние между двумя точками 
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
}
// ctor
// get; set;
// docs
//
