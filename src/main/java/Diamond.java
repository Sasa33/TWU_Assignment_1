public class Diamond {
    private int num;
    private DiamondStyle style;
    private String name;

    public Diamond(int i) {
        this.num = i;
        this.style = DiamondStyle.TRIANGLE;
        this.name = "";
    }

    public Diamond(int i, DiamondStyle diamondStyle) {
        this.num = i;
        this.style = diamondStyle;
        this.name = "";
    }

    public Diamond(int i, DiamondStyle diamondStyle, String name) {
        this.num = i;
        this.style = diamondStyle;
        this.name = name;
    }

    public void print() {
        switch (this.style) {
            case TRIANGLE:
                printTheUpperTriangle();
                break;
            case DIAMOND:
                printDiamond();
                break;
            default:
                printTheUpperTriangle();
                break;
        }
    }

    private void printDiamond() {
        printTheUpperTriangle();

        printTheLowerTriangle();
    }

    private void printTheLowerTriangle() {
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

    private void printTheUpperTriangle() {
        for(int i = 0; i < this.num - 1; i++) {
            for(int j = 1; j < this.num - i; j++) {
                System.out.print(' ');
            }
            for(int j = 1; j <= 2 * i + 1; j++) {
                System.out.print('*');
            }
            System.out.print('\n');
        }

        printTheMiddleRowOfDiamond();
    }

    private void printTheMiddleRowOfDiamond() {
        if(this.name.isEmpty()) {
            for(int j = 1; j <= 2 * this.num - 1; j++) {
                System.out.print('*');
            }
        } else {
            System.out.print(this.name);
        }
        System.out.print('\n');
    }
}
