package javaBasics.recursion;

public class Gcd {
    public static int gcd(int m, int n){
        if(m > n) return gcd(n, m);
        if(m == n) return m;
        if(m == 0) return n;
        if(n == 1) return 1;
        return gcd(m, n % m);
    }
    public static void main(String[] args) {
        int m = 6;
        int n = 24;
        System.out.println(gcd(m, n));  // 6
    }
}
