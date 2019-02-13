public class test {
    public static void main(String[] args) {

        Operationable operationable;
        operationable = (x,y)->x+y;
        operationable = (x,y)->x-y;
        operationable = (x,y)->x*y;
        operationable = (x,y)->x/y;

        int result = operationable.calculate(10,20);
        System.out.println(result);
    }
}


interface Operationable {
    int calculate(int x, int y);
}