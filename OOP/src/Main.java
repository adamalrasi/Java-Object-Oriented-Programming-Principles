//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        Customer customer = new Customer("Adam", "Alrasi");
        customer.setFirstName("AdamA ");
        customer.print();
        System.out.println(customer.getFirstName());
        Employee employee = new Employee("Mahad", "Abukar");
        employee.print();
    }
}