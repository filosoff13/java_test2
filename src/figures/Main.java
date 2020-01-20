package figures;

import org.jetbrains.annotations.NotNull;

import java.awt.*;

public class Main {

    public static void main(String[] args) {

        int randomTriangle = random();
        int randomTrapeze = random();
        int randomSquare = random();
        int randomCircle = random();

        if (randomTriangle != 0) System.out.println(randomTriangle + triangleData().toString());
        if (randomTrapeze != 0) System.out.println(randomTrapeze + trapezeData().toString());
        if (randomSquare != 0) System.out.println(randomSquare + squareData().toString());
        if (randomCircle != 0) System.out.println(randomCircle + circleData().toString());

    }

    /**
     *
     * @return generate random number 0..9
     */
    private static int random(){
        //generate random number 0..9
//        return (int) (1 + Math.random() * 10);
        return (int) (Math.random() * 10);
    }

    @NotNull
    private static Triangle triangleData(){
        return new Triangle(5, 5, 5);
    }

    @NotNull
    private static Trapeze trapezeData(){
        return new Trapeze(5, 5, 5);
    }

    @NotNull
    private static Square squareData(){
        return new Square(5);
    }

    @NotNull
    private static Circle circleData(){
        return new Circle(5);
    }


}
