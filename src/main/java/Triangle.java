import java.awt.*;


public class Triangle {
    private int num;
    private TriangleStyle triangleStyle = TriangleStyle.horizontal;

    public Triangle(int n) {
        this.num = n;
    }

    public Triangle(int n, TriangleStyle triangleStyle) {
        this.num = n;
        this.triangleStyle = triangleStyle;
    }

    public void print() {
        for(int i = 1; i <= this.num; i++) {
            switch (this.triangleStyle) {
                case horizontal:
                    System.out.print('*');
                    break;
                case vertical:
                    System.out.println('*');
                    break;
                case triangle:
                    for (int j = 1; j <= i; j++) {
                        System.out.print('*');
                    }
                    System.out.print('\n');
                    break;
                default:
                    System.out.print('*');
            }
        }
        System.out.print('\n');
    }
}
