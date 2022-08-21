package part6.section3;

import part6.section3.OCustomer;

public class OCustomerAccess {
    public static void main(String[] args) {
        String name = OCustomer.INSTANCE.getName();
        System.out.println(name);
    }
}
