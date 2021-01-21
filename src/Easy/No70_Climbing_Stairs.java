package Easy;

public class No70_Climbing_Stairs {

    // Brute force O(2^n) time
    public int climbStairs(int n) {
        return climbStairs(0, n);
    }

    public int climbStairs(int i, int n) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;
        return climbStairs(i + 1, n) + climbStairs(i + 2, n);
    }

    // Optimisation using an array O(n)
    public int climbStairs2(int n) {
        int[] arr = new int[n + 1];
        return climbStairs2(0, n, arr);
    }

    public int climbStairs2(int i, int n, int[] arr) {
        if (i > n)
            return 0;
        if (i == n)
            return 1;
        if (arr[i] > 0)
            return arr[i];
        arr[i] = climbStairs2(i + 1, n, arr) + climbStairs2(i + 2, n, arr);
        return arr[i];
    }
}
