public class IntegerSetTest {
    public static void main(String[] args) {
        IntegerSet a = new IntegerSet();
        a.add(50);
        a.add(70);

        String s = "[50,70]";
        if (a.toString().replaceAll("", "").equals(s)) {
            System.out.println("pass");
        } else {
            System.out.println("fail");
        }
    }
}
