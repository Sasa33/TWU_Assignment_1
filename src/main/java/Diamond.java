public class Diamond {
    private int num;

    public Diamond(int i) {
        this.num = i;
    }

    public void print() {
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
