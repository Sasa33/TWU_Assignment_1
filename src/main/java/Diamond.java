public class Diamond {
    private int num;
    private String style;
    private String name;

    public Diamond(int i) {
        this.num = i;
        this.style = "triangle";
        this.name = "";
    }

    public Diamond(int i, String s) {
        this.num = i;
        this.style = s;
        this.name = "";
    }

    public Diamond(int i, String s, String name) {
        this.num = i;
        this.style = s;
        this.name = name;
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
        if(this.name.isEmpty()) {
            printTriangle();
        } else {
            for(int i = 0; i < this.num - 1; i++) {
                for(int j = 1; j < this.num - i; j++) {
                    System.out.print(' ');
                }
                for(int j = 1; j <= 2 * i + 1; j++) {
                    System.out.print('*');
                }
                System.out.print('\n');
            }
            System.out.println(this.name);
        }

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
