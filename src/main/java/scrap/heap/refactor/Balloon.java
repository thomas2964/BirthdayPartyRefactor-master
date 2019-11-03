package scrap.heap.refactor;

enum BalloonColor {
    RED, BLUE, YELLOW
}

enum BalloonMaterial {
    MYLAR, LATEX
}

public class Balloon {

    private final BalloonColor color;
    private final BalloonMaterial material;
    private final int number;

    public Balloon(BalloonColor color, BalloonMaterial material, int number) {
        this.color = color;
        this.material = material;
        this.number = number;
    }

    void orderBalloon() {
        System.out.println("Refactored Balloons ordered; " + color + ", " + material  + ", " + number);
    }
}
