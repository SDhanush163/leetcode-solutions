package Easy;

public class No69_Sqrt_x {
    public int mySqrt(int x) {
        long probe = x;
        while (probe * probe > x)
            probe = (probe + x / probe) / 2;
        return (int) probe;
    }
}
