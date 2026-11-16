public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");
        int numOdd = 0;
        System.out.print("1 1 ");
        int m = 1;
        int n = 1;

        for (int i = 0; i < x-2; i++) {

            if (i%2==0){n=n+m; System.out.print(n);}
            else{m = m+n; System.out.print(m);}
            if (i < x - 3) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        numOdd = 2*(x/3) + x%3;
        System.out.println("The number of odd numbers is: " + numOdd);
        

    }
}
