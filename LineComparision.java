import java.util.Scanner;

public class LineComparision {
    private static double LengthOfLine(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    private double x1, y1, x2, y2;
    public LineComparision(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LineComparision otherLine = (LineComparision) obj;
        return Double.compare(otherLine.x1, x1) == 0 &&
                Double.compare(otherLine.y1, y1) == 0 &&
                Double.compare(otherLine.x2, x2) == 0 &&
                Double.compare(otherLine.y2, y2) == 0;
    }
    public static void main(String[] agrs) {
        System.out.println("Welcome to line comparision problem");
       Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();
        scanner.close();
        double length = LengthOfLine(x1, y1, x2, y2);
        System.out.println("Length of the lines: " + length);

        LineComparision line1 = new LineComparision(x1,y1, x2, y2);
        LineComparision line2= new LineComparision(x2,y2, x1, y2);
    

        System.out.println("Line 1 equals Line 2: " + line1.equals(line2));
       
    }
}
    

    
    
