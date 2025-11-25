package core.basesyntax;

import java.util.Random;

public class FigureSupplier {
    private static final int FIGURE_COUNT = 5;
    private static final int MAX_RANDOM_SIDE = 10;
    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    public Figure getRandomFigure() {
        int type = random.nextInt(5);
        String color = colorSupplier.getRandomColor();

        switch (type) {
            case 0:
                return new Square(color, random.nextInt(10) + 1);
            case 1:
                return new Rectangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            case 2:
                return new Circle(color, random.nextInt(10) + 1);
            case 3:
                return new RightTriangle(color, random.nextInt(10) + 1, random.nextInt(10) + 1);
            default:
                return new IsoscelesTrapezoid(color,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1,
                        random.nextInt(10) + 1);
        }
    }

    public Figure getDefaultFigure() {
        return new Circle("white", 10);
    }
}
