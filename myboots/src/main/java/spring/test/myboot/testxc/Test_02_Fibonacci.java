package spring.test.myboot.testxc;

public class Test_02_Fibonacci {
    int count =0;
    public static void main(String[] args) {

        Test_02_Fibonacci d = new Test_02_Fibonacci();
        System.out.println(d.f(6));
    }


    public  int f(int n ) {
        if (1== n || 2 == n){

            return 1;
        }
        else{
            return f(n-1) + f(n-2);
        }
    }
}