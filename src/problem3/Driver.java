package problem3;

public class Driver {
    public static void main(String[] args) {
        Figure[] figures = {new UpwardHat(), new UpwardHat(),
                new DownwardHat(), new FaceMaker(), new Vertical()};

        // Displaying the figures using polymorphism
        for(Figure figure : figures) {
            figure.getFigure();
        }

        System.out.println("\n");
        Figure[] figures2 = {new UpwardHat(), new UpwardHat(),
                new DownwardHat(), new FaceMaker(), new Vertical()};

        // Displaying the figures and their class names using polymorphism
        for(Figure figure2 : figures2) {
            System.out.print(figure2.getClass().getSimpleName() + " : ");
            figure2.getFigure();
            System.out.println();
        }
    }
}
