package basics;

import java.security.SecureRandom;
import java.util.Objects;

public class Misc {
    public static void main(String[] args) {
        Customer c1 = new Customer(1L);
        Customer c2 = new Customer(2L);

        Customer c3 = new Customer((long) 2.3f);

        System.out.println("(c1 == c2): " + (c1 == c2));
        System.out.println("c1.equals(c2): " + c1.equals(c2));

        System.out.println("c2.equals(c3): " + c2.equals(c3));
        System.out.println("(c1 == c2): " + (c2==c3));
    }
}

class Customer {
    private final Long id;
    private final String name;

    Customer(Long id) {
        this.id = id;
        this.name = new SecureRandom().nextInt() + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return id.equals(customer.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
