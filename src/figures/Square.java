package figures;

public class Square extends Figure implements Common {

    private int side;

    public Square(int side){
        this.side = side;
    }

    public int getPerimeter() {
        return (int) 4 * side;
    }

    @Override
    public long Area() {
        return side*side;
    }

    @Override
    public String toString() {
        return " Квадрат(-а). Длина стороны - " + side + ", площадь - " + Area() + ", периметр: " + getPerimeter() + ", " + Drow() + "рисуем";
    }
}
