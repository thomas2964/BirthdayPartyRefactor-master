package scrap.heap.refactor;

enum CakeColor {
    BROWN, YELLOW
}

enum CakeSize {
    LARGE, MEDIUM, SMALL
}

enum CakeShape {
    CIRCLE, SQUARE
}

enum CakeFlavor {
    CHOCOLATE, VANILLA
}

enum CakeFrostingFlavor {
    CHOCOLATE, VANILLA
}

/* Without Builder Pattern
public class Cake {
    private CakeFlavor flavor;
    private CakeFrostingFlavor frostingFlavor;
    private CakeShape shape;
    private CakeSize size;
    private CakeColor color;

    public Cake(CakeFlavor flavor, CakeFrostingFlavor frostingFlavor, CakeShape shape, CakeSize size, CakeColor color) {
        this.flavor = flavor;
        this.frostingFlavor = frostingFlavor;
        this.shape = shape;
        this.size = size;
        this.color = color;
    }

    public void orderCake() {
        System.out.println("Refactored cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + color);
    }
*/

// Use Builder Pattern
public class Cake {

    private final CakeFlavor flavor;
    private final CakeFrostingFlavor frostingFlavor;
    private final CakeShape shape;
    private final CakeSize size;
    private final CakeColor color;

    public Cake(Builder builder) {
        this.flavor = builder.flavor;
        this.frostingFlavor = builder.frostingFlavor;
        this.shape = builder.shape;
        this.size = builder.size;
        this.color = builder.color;
    }

    public static class Builder {

        private CakeFlavor flavor;
        private CakeFrostingFlavor frostingFlavor;
        private CakeShape shape;
        private CakeSize size;
        private CakeColor color;

        public static Builder newInstance()
        {
            return new Builder();
        }

        private Builder() {}

        public Builder setFlavor(CakeFlavor flavor) {
            this.flavor = flavor;
            return this;
        }

        public Builder setFrostingFlavor(CakeFrostingFlavor frostingFlavor) {
            this.frostingFlavor = frostingFlavor;
            return this;
        }

        public Builder setShape(CakeShape shape) {
            this.shape = shape;
            return this;
        }

        public Builder setSize(CakeSize size) {
            this.size = size;
            return this;
        }

        public Builder setColor(CakeColor color) {
            this.color = color;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }
    }

    public void orderCake() {
        System.out.println("Builder cake ordered; " + flavor + ", " + frostingFlavor  + ", " + shape + ", " + size + ", " + color);
    }

}
