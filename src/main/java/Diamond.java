public class Diamond {
    private int sideLength;
    private DiamondStyle style;
    private String name;

    public Diamond(int i) {
        this.sideLength = i;
        this.style = DiamondStyle.TRIANGLE;
        this.name = "";
    }

    public Diamond(int i, DiamondStyle diamondStyle) {
        this.sideLength = i;
        this.style = diamondStyle;
        this.name = "";
    }

    public Diamond(int i, DiamondStyle diamondStyle, String name) {
        this.sideLength = i;
        this.style = diamondStyle;
        this.name = name;
    }

    public void print() {
        switch (this.style) {
            case TRIANGLE:
                printTriangle();
                break;
            case DIAMOND:
                printDiamond();
                break;
            default:
                printTriangle();
                break;
        }
    }

    private void printTriangle() {
        printTheUpperTriangle();

        printTheMiddleRowOfDiamond();
    }

    private void printDiamond() {
        printTheUpperTriangle();

        printTheMiddleRowOfDiamond();

        printTheLowerTriangle();
    }

    private void printOneRow(int i) {
        for(int j = 1; j < this.sideLength - i; j++) {
            System.out.print(' ');
        }
        for(int j = 1; j <= 2 * i + 1; j++) {
            System.out.print('*');
        }
        System.out.print('\n');
    }

    private void printTheLowerTriangle() {
        for(int i = this.sideLength - 2; i >= 0; i--) {
            printOneRow(i);
        }
    }

    private void printTheUpperTriangle() {
        for(int i = 0; i < this.sideLength - 1; i++) {
            printOneRow(i);
        }
    }

    private void printTheMiddleRowOfDiamond() {
        if(this.name.isEmpty()) {
            for(int j = 1; j <= 2 * this.sideLength - 1; j++) {
                System.out.print('*');
            }
        } else {
            System.out.print(this.name);
        }
        System.out.print('\n');
    }
}
