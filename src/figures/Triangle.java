package figures;

public class Triangle extends Figure implements Common {

    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getHypotenuse() {
        return (int) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    @Override
    public long Area() {
        long p = (a + b + c)/2;
        return (long) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public String toString() {
        return " Треугольник(-а). Стороны - " + a + ", " + b + ", " + c + ", площадь - " + Area() + ", гипотенуза: " + getHypotenuse() + ", " + Drow() + "рисуем";
    }
}
