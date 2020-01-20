package figures;

public class Circle extends Figure implements Common {

    /**известен радиус круга
     *  r радиус
     */

//    private double PI = 3.1415926535897932384626433832795;
    private int r;

    public Circle(int r){
        this.r = r;
    }

    public int getRadius() {
        return this.r;
    }

    @Override
    public long Area() {
        return (long) (Math.pow(r, 2) * Math.PI);
    }

    @Override
    public String toString() {
        return " Круг(-а). Радиус - " + r + ", площадь - " + Area() + ", " + Drow() + "рисуем";
    }
}
