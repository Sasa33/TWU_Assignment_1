public class Triangle {
    private int num;
    private TriangleStyle triangleStyle = TriangleStyle.HORIZONTAL;

    public Triangle(int n) {
        this.num = n;
    }

    public Triangle(int n, TriangleStyle triangleStyle) {
        this.num = n;
        this.triangleStyle = triangleStyle;
    }

    public void print() {
        boolean needANewLine = false;
        for(int i = 1; i <= this.num; i++) {
            switch (this.triangleStyle) {
                case HORIZONTAL:
                    System.out.print('*');
                    needANewLine = true;
                    break;
                case VERTICAL:
                    System.out.println('*');
                    break;
                case TRIANGLE:
                    for (int j = 1; j <= i; j++) {
                        System.out.print('*');
                    }
                    System.out.print('\n');
                    break;
                default:
                    System.out.print('*');
                    needANewLine = true;
            }
        }
        if (needANewLine) {
            System.out.print('\n');
        }
    }
}
