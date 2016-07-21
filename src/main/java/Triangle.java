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

        while(number > 0) {
            if(this.style.equals("horizontal")) {
                System.out.print('*');
            } else if(this.style.equals("vertical")) {
                System.out.println('*');
            }
            number--;
        }
    }
}
