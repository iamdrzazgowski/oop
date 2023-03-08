import java.util.Locale;

public class Polygon {
    private Point[] arr;
    private Style styleSettings;

    public Polygon(int count, Style styleSettings) {
        arr = new Point[count];
        this.styleSettings = styleSettings;
    }

    public void setPoint(int index, Point point) {
        arr[index] = point;
    }

    public void setPoints(Point[] points){
        arr = points;
    }

    public String toSvg() {
        String pointsString = "";
        for(Point point : arr)
            pointsString += point.x + "," + point.y + " ";

        return String.format(Locale.ENGLISH,"<polygonn points=\"%s\" style=\"%s\"/>", pointsString, styleSettings.toSvg());
    }


}
