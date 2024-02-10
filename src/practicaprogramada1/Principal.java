package practicaprogramada1;

public class Principal {

    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("*** EMPLEADO ***");
        Empleado e = new Empleado("Alex", "15588", 21, true, 100000, 12.5);
        System.out.println(e.toString());
        
        System.out.println("\n*** PROGRAMADOR ***");
        Programador p = new Programador("Joss", "1122", 30, false, 200000, 
                10, 5842, "Java");
        System.out.println(p.toString());;
    }
}
