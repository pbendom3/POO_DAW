package hashEquals;

public class RefrescosApp {

    static void main() {

        Refresco fanta = new Refresco("Fanta",0.50);
        Refresco cocacola = new Refresco("Fanta",1.50);

        System.out.println(fanta.hashCode());
        System.out.println(cocacola.hashCode());
        if (cocacola.equals(fanta)){
            System.out.println("Son iguales");
        }





    }
}
