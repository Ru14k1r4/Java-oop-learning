public class Swap {
  
  static void swap(MyInt a, MyInt b) {
    int temp = a.i;
    a.i = b.i;
    b.i = temp;
  }

  public static void main(String[] args) {
    MyInt a = new MyInt(3);
    MyInt b = new MyInt(2);

    System.out.printf("Before:\ta = %d, b = %d\n", a.i, b.i);
    swap(a, b);
    System.out.printf("After:\ta = %d, b = %d\n", a.i, b.i);
  }
}
