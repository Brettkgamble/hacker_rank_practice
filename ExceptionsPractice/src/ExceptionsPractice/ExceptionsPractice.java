package ExceptionsPractice;

public class ExceptionsPractice {

    public static void main(String[] args) {
        try {
            int[] c = new int[5];
            System.out.print("Element 6 at index 5 = " + c[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception Thrown " + e);
        } finally {
            System.out.println("Finally finished try-catch");
        }

    }
}
