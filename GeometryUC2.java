public class GeometryUC2 {
    private double x1, y1, x2, y2;

    public GeometryUC2(double x1, double y1, double x2, double y2) {
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
        GeometryUC2 otherLine = (GeometryUC2) obj;
        return Double.compare(otherLine.x1, x1) == 0 &&
                Double.compare(otherLine.y1, y1) == 0 &&
                Double.compare(otherLine.x2, x2) == 0 &&
                Double.compare(otherLine.y2, y2) == 0;
    }

    public static void main(String[] args) {
        GeometryUC2 line1 = new GeometryUC2(2, 3, 5, 7);
        GeometryUC2 line2 = new GeometryUC2(2, 3, 5, 7);
        GeometryUC2 line3 = new GeometryUC2(1, 1, 4, 5);

        System.out.println("Line 1 equals Line 2: " + line1.equals(line2)); // true
        System.out.println("Line 1 equals Line 3: " + line1.equals(line3)); // false
    }
}
