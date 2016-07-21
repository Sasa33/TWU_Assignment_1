import java.awt.*;

public class Triangle {
    private int num;
    private String style = "horizontal";

    public Triangle(int n) {
        this.num = n;
    }

    public Triangle(int n, String s) {
        this.num = n;
        this.style = s;
    }

    public void print() {
        int number = this.num;

        for(int i = 1; i <= number; i++) {
            if(this.style.equals("horizontal")) {
                System.out.print('*');
            } else if(this.style.equals("vertical")) {
                System.out.println('*');
            } else if(this.style.equals("triangle")) {
                for(int j = 1; j <= i; j++) {
                    System.out.print('*');
                }
                System.out.print('\n');
            }

        }
    }
}
