public class MathDemo{
    static int max(int a, int b){
        if(a > b){
            return a;
        } else {
            return b;
        }
    }
    static int min(int a, int b){
        if(a < b){
            return a;
        } else {
            return b;
        }
    }
    static int sum(int[] arr){
        int total = 0;
        for(int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }
    static float mean (int [] arr){
        int total = sum(arr);
        return (float) total / arr.length;
    }
    static int factorial(int n){
        int total = 1;
        for (int i = 1; i<=n; i++){
            total *= i;
        }
        return total;
    }
    //f) we can call methods without creating an object of the class first
    public static void main(String[] args){
        int a = 5;
        int b = 10;
        System.out.println("Max: " + max(a, b));
        System.out.println("Min: " + min(a, b));
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Sum: " + sum(arr));
        System.out.println("Mean: " + mean(arr));
        System.out.println("Factorial of 5: " + factorial(5));
    }
}
