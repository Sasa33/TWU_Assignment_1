public class Triangle {
    private int num;

    public Triangle(int n) {
        this.num = n;
    }

    public void print() {
        int number = this.num;

        while(number>0) {
            System.out.print('*');
            number--;
        }
    }
}
