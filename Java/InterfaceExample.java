public class InterfaceExample {
    public static void main(String[] args){
        Math math = new Math();
        System.out.println(math.factorial(7));
        System.out.println(math.sub(7,3));
        System.out.println(math.sum(7,7));
    }
}

interface Arithmetic {
    int sum(int num1, int num2);
    int sub(int num1, int num2);
}

interface NumOperations {
    int factorial(int num);
}

class Math implements  Arithmetic, NumOperations{

    public int sum(int num1, int num2) {
        return num1+num2;
    }

    public int sub(int num1, int num2) {
        return num1-num2;
    }

    public int factorial(int num) {
        int tot = 1;
        for(int idx =2; idx <= num;idx++){
            tot +=idx;
        }
        return tot;
    }
}