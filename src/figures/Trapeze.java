package figures;

public class Trapeze extends Figure implements Common {

    /**известны оба основания и высота
     *  a одно основание
     *  b второе основание
     *  h высота
     */

    private int a;
    private int b;
    private int h;

    public Trapeze(int a, int b, int h){
        this.a = a;
        this.b = b;
        this.h = h;
    }

    @Override
    public long Area() {
        return (a + b) * h / 2;
    }

    @Override
    public String toString() {
        return " Трапеция(-й). Одно основание:" + a + " , второе основание:" + b + ", высота: " + h + ", площадь - " + Area() + ", " + Drow() + "рисуем";
    }

}
