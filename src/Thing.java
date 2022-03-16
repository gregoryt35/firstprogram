public class Thing {

    private int num;
    private int[] numList;

    public Thing(int num) {
        this.num = num;
        numList = {1, 2, 3};
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}