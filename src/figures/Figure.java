package figures;

abstract class Figure {

    protected String name;
    private String color;
//    private Enum color{
//        BLUE,
//        GREEN;
//    }

    protected double area;

//    public static void main(String[] args){
//        System.out.println((int) (1 + Math.random() * 10));
//    }

    public String Drow() {
//        return Math.random() < 0.5;
        if (Math.random() < 0.5) return "не ";
        return "";
    }
    int i = (int) (1 + Math.random() * 10);

    public String GetColor() {
        return this.color;
    }

    public void SetColor(String color) {
        this.color = color;
    }
}
