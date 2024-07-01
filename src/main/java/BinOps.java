public class BinOps {
    public String sum(String a, String b) {
        int result = Integer.parseInt(a) + Integer.parseInt(b);
        return Integer.toBinaryString(result);
    }

    public String mult(String a, String b) {
        int result = Integer.parseInt(a) * Integer.parseInt(b);
        return Integer.toBinaryString(result);
    }
}
