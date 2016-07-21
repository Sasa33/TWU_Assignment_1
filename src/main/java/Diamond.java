public class Diamond {
    private int num;
    private String style;

    public Diamond(int i) {
        this.num = i;
        this.style = "triangle";
    }

    public Diamond(int i, String s) {
        this.num = i;
        this.style = s;
    }

    public void print() {
        switch (this.style) {
            case "triangle":
                printTriangle();
                break;
            case "diamond":
                printDiamond();
                break;
            default:
                printTriangle();
                break;
        }
    }

    private void printDiamond() {
        printTriangle();
        for(int i = this.num - 1; i > 0; i--) {
            for(int j = 0; j < this.num - i; j++) {
                System.out.print(' ');
            }
            for(int j = 1; j <= 2 * i - 1; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }

    private void printTriangle() {
        for(int i = 0; i < this.num; i++) {
            for(int j = 1; j < this.num - i; j++) {
                System.out.print(' ');
            }
            for(int j = 1; j <= 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }
    }
}
