package DSA;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(josephus(5, 3));
    }

    public static int josephus(int n, int k) {
        if (n == 1) return 0;
        return (josephus(n - 1, k) + k) % n;
    }
}

/*

n = 5 , k = 3

1st round :
1(g) 2 3 4 5 -> 1 2 4 5

2nd round :
1 2 4(g) 5 : 2 4 5

3rd round :
2(g) 4 5 : 2 4

4th round :
2(g) 4 : 4

winner : 4
*/