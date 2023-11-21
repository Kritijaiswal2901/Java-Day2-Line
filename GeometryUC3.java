public class GeometryUC3 implements Comparable<GeometryUC3> {
    private double x1, y1, x2, y2;

    public GeometryUC3(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public int compareTo(GeometryUC3 otherLine) {
        double length1 = calculateLength(x1, y1, x2, y2);
        double length2 = calculateLength(otherLine.x1, otherLine.y1, otherLine.x2, otherLine.y2);

        if (length1 == length2) {
            return 0; // Lines are equal in length
        } else if (length1 < length2) {
            return -1; // Line 1 is shorter than Line 2
        } else {
            return 1; // Line 1 is longer than Line 2
        }
    }

    private double calculateLength(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {
        GeometryUC3 line1 = new GeometryUC3(2, 3, 5, 7);
        GeometryUC3 line2 = new GeometryUC3(2, 3, 5, 7);
        GeometryUC3 line3 = new GeometryUC3(1, 1, 4, 5);

        int comparison1to2 = line1.compareTo(line2);
        int comparison1to3 = line1.compareTo(line3);

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
