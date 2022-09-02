public class TestHeritage {
    public static void main(String[] args) {
        // Employees
        Employee rafael = new Employee("Rafael");
        rafael.setCpf("22222222");
        Employee cristian = new Employee("Cristian");
        cristian.setCpf("45646546546");
        Employee alessandra = new Employee("Alessandra");
        alessandra.setCpf("9879879879");
        Employee henrique = new Employee("Henrique");
        Employee rodrigo = new Employee("Rodrigo");

        System.out.println("employees: ");
        System.out.println(rafael.getName());
        System.out.println(cristian.getName());
        System.out.println(alessandra.getName());
        System.out.println(henrique.getName());
        System.out.println(rodrigo.getName());
        System.out.println();


        // Customers
        Customer cust1 = new Customer( "Cust1","111.111.111-11" );


        Customer cust2 = new Customer("Cust2","222.222.222-22");


        Customer cust3 = new Customer( "Cust3","333.333.333-33");



        System.out.println("Customers CPF");
        System.out.println(cust1.getCpf());
        System.out.println(cust2.getCpf());
        System.out.println(cust3.getCpf());








    }
}
