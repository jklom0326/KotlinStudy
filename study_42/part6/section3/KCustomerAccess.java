package part6.section3;

public class KCustomerAccess {
    public static void main(String[] args) {
        // 코틀린 클래스의 컴패니언 객체를 접근
        System.out.println(KCustomer.LEVEL);
        KCustomer.login();
        KCustomer.Companion.login();
    }
}
