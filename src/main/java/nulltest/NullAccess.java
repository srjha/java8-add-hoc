package nulltest;

public class NullAccess {
    public static void main(String[] args) {
        Customer customer = null;
        System.out.println("Output 1:" + customer.defaultCustomerTypeId);
        //System.out.println("Output 2:" + customer.defaultCustomerTypeId());

        customer = new Customer();
        System.out.println("Output 3:" + customer.defaultCustomerTypeId);
        System.out.println("Output 4:" + customer.defaultCustomerTypeId());
    }
}

class Customer {
    public static long defaultCustomerTypeId = 99;
    public long defaultCustomerTypeId() {
        return 79L;
    }
}