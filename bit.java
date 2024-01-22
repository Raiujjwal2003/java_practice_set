public class bit {

  public static int alphaBitwise(int[] A, int n) {
    int count = 0;
    for (int i = 0; i < n; i++) {
      int bitCount = Integer.bitCount(A[i]);
      if (bitCount > n / 2) {
        count++;
      }
    }

    int result = 0;
    for (int i = 31; i >= 0; i--) {
      if (count >= (n + 1) / 2) {
        result |= (1 << i);
      }
    }

    return result;
  }

  public static void main(String[] args) {
    int[] A = {3, 4, 6, 7, 2};
    int n = A.length;
    int result = alphaBitwise(A, n);
    System.out.println(result);
  }
}