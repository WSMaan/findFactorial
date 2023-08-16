
public  class FindFactorial {
    public static void main(String[] args) {
        int number = 3;
        System.out.println(findFactorial(number));

    }

    public static long findFactorial(int num) {
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

}


