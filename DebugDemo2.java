public class DebugDemo2 {

  final static int z = 0;

  public static void main(String[] args) {
      System.out.println(modernMachine(5, 2));
  }

  public static float modernMachine(float n, float m) {
      float ix;
      //m = z;
      //infinity: IEEE 754

      ix = n / m;
      return ix;
  }
}