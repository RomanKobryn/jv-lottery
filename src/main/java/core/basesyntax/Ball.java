package core.basesyntax;

public class Ball {
    private int number;
    private String color;

    public Ball(String color, int number) {
        this.color = color;
        this.number = number;
    }

    @Override
    public String toString() {
        String result = "Number of the ball is: " + number + ". Color is: " + color;
        return result;
    }
}