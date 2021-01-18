package scrap.heap.refactor;

public class App {
/*    public String getGreeting() {
        return "Hello world.";
    }*/

    public static void main(String[] args) {

        App app = new App();

        //Place birthday party orders
        app.birthdayPartyPurchase();

    }

    public int birthdayPartyPurchase() {
        int numOrder = 0;

        /* Without Builder Pattern for Cake
        Balloon balloon = new Balloon(BalloonColor.RED, BalloonMaterial.MYLAR, 4);
        balloon.orderBalloon();
        Cake cake = new Cake(CakeFlavor.CHOCOLATE, CakeFrostingFlavor.CHOCOLATE, CakeShape.CIRCLE, CakeSize.LARGE, CakeColor.BROWN);
        cake.orderCake();
        ++numOrder;

        Balloon balloon2 = new Balloon(BalloonColor.BLUE, BalloonMaterial.LATEX, 7);
        balloon2.orderBalloon();
        Cake cake2 = new Cake(CakeFlavor.VANILLA, CakeFrostingFlavor.CHOCOLATE, CakeShape.SQUARE, CakeSize.MEDIUM, CakeColor.BROWN);
        cake2.orderCake();
        ++numOrder;

        Balloon balloon3 = new Balloon(BalloonColor.YELLOW, BalloonMaterial.MYLAR, 4);
        balloon3.orderBalloon();
        Cake cake3 = new Cake(CakeFlavor.VANILLA, CakeFrostingFlavor.VANILLA, CakeShape.SQUARE, CakeSize.SMALL, CakeColor.YELLOW);
        cake3.orderCake();
        ++numOrder;
        */

        Balloon balloon = new Balloon(BalloonColor.RED, BalloonMaterial.MYLAR, 4);
        balloon.orderBalloon();

        // With Builder Pattern for Cake
        Cake cake = Cake.Builder.newInstance().setFlavor(CakeFlavor.CHOCOLATE).
                setFrostingFlavor(CakeFrostingFlavor.CHOCOLATE).setShape(CakeShape.CIRCLE)
                .setSize(CakeSize.LARGE).setColor(CakeColor.BROWN).build();
        cake.orderCake();
        ++numOrder;

        Balloon balloon2 = new Balloon(BalloonColor.BLUE, BalloonMaterial.LATEX, 7);
        balloon2.orderBalloon();

        Cake cake2 = Cake.Builder.newInstance().setFlavor(CakeFlavor.VANILLA).
                setFrostingFlavor(CakeFrostingFlavor.CHOCOLATE).setShape(CakeShape.SQUARE)
                .setSize(CakeSize.MEDIUM).setColor(CakeColor.BROWN).build();
        cake2.orderCake();
        ++numOrder;

        Balloon balloon3 = new Balloon(BalloonColor.YELLOW, BalloonMaterial.MYLAR, 4);
        balloon3.orderBalloon();

        Cake cake3 = Cake.Builder.newInstance().setFlavor(CakeFlavor.VANILLA).
                setFrostingFlavor(CakeFrostingFlavor.VANILLA).setShape(CakeShape.SQUARE)
                .setSize(CakeSize.SMALL).setColor(CakeColor.YELLOW).build();
        cake3.orderCake();
        ++numOrder;

        return numOrder;
    }
}
