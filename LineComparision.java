import java.util.Scanner;
public class LineComparision implements Comparable<LineComparision> {
    private double x1, y1, x2, y2;

    private static double LengthOfLine(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }
    public LineComparision(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    @Override
    public int compareTo(LineComparision otherLine) {
        double length1 = LengthOfLine(x1, y1, x2, y2);
        double length2 = LengthOfLine(otherLine.x1, otherLine.y1, otherLine.x2, otherLine.y2);

        if (length1 == length2) {
            return 0; 
        } else if (length1 < length2) {
            return -1; 
        } else {
            return 1;
        }
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
        LineComparision line3 = new LineComparision(x1,y1,x2,y2);

        int comparison1to2 = line1.compareTo(line2);
        int comparison1to3 = line1.compareTo(line3);

        System.out.println("Line 1 equals Line 2: " + line1.equals(line2));

        if (comparison1to2 == 0) {
            System.out.println("Line 1 is equal to Line 2");
        } else if (comparison1to2 < 0) {
            System.out.println("Line 1 is shorter than Line 2");
        } else {
            System.out.println("Line 1 is longer than Line 2");
        }

        if (comparison1to3 == 0) {
            System.out.println("Line 1 is equal to Line 3");
        } else if (comparison1to3 < 0) {
            System.out.println("Line 1 is shorter than Line 3");
        } else {
            System.out.println("Line 1 is longer than Line 3");
        }
    }
        
       
    }

    

    
    
