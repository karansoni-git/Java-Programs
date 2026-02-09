package DSA;

public class nCr_Calculate {
    public static void main(String[] args) {
        System.out.println(nCr_Recursion(5, 3));
    }

    public static int nCr_Recursion(int n, int r) {
        if (n == r || r == 0) return 1;  // base case.
        return nCr_Recursion(n - 1, r - 1) + nCr_Recursion(n - 1, r);
    }

}

/*
=> Pascal’s Triangle (for calculating nCr)
    -> Pascal’s Triangle is a simple and powerful method to calculate combinations (nCr) without directly using factorial formulas.

    -> What is Pascal’s Triangle?

        Pascal’s Triangle is a triangular arrangement of numbers where:
            First and last element of every row is 1
            Each middle number = sum of two numbers just above it

            Structure:
                Row 0:            1
                Row 1:          1   1
                Row 2:        1   2   1
                Row 3:      1   3   3   1
                Row 4:    1   4   6   4   1
                Row 5:  1   5  10  10   5   1

    -> Connection between Pascal’s Triangle & nCr
        -> Each number in Pascal’s Triangle represents a combination value
                        𝑛𝐶𝑟 = value at row 𝑛 and position 𝑟.
                        Example:
                        Row 4 → 1 4 6 4 1
                        4C0 = 1
                        4C1 = 4
                        4C2 = 6
                        4C3 = 4
                        4C4 = 1

    -> Pascal’s Identity (Core Formula)
            The triangle is based on this identity:
                    𝑛𝐶𝑟=(𝑛−1)𝐶(𝑟−1)+(𝑛−1)𝐶𝑟
            Meaning:
                Every value comes from adding two values above it
                Example: 5C2=4C1+4C2=4+6=10
    -> How to Calculate nCr using Pascal’s Triangle (Step-by-Step)
                Example: Find 6C3
                Write rows till Row 6
                    Row 6 looks like: 1  6  15  20  15  6  1
                    Position r = 3
                    6C3 = 20
                    No factorials needed!

    -> Comparison with Factorial Formula
        Factorial Method : nCr = n! / r!(n−r)!
        Pascal’s Triangle Method:
            Faster
            No large factorials
            Useful for mental math & exams

    -> Important Properties for nCr
        Symmetry Property : nCr = nC(n−r)
            Example: 5C1 = 5C4 = 5
        Sum of Row :
            Sum of all values in row n: 2𝑛
        Example:
            Row 4 → 1+4+6+4+1 = 16 = 2^4
            First & Last Value : nC0 = nCn = 1

    -> When to Use Pascal’s Triangle? :
        Small values of n
        Competitive exams
        Probability problems
        Binomial expansion
        Avoid factorial calculation

    -> Quick Example Set
        Expression	  Value
            7C0	        1
            7C1	        7
            7C2	        21
            7C3	        35
            7C4	        35

    -> Real-Life Use :
        -> Probability
        -> Statistics
        -> Binomial Theorem
        -> Coding (DP approach for nCr)
        -> Mathematics Olympiads

-> Short Trick to Remember
Pascal’s Triangle = Shortcut table of nCr values
*/
