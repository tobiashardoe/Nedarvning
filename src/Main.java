import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        LocalDate bestBeforeDate = LocalDate.of(2026,4,1    );
         Product stol = new Product(899, "Stol");
         Product tshirt = new Product(199, "T-Shirt");
         Perishable chokolade = new Perishable(35, "Chocolade bar", bestBeforeDate);

        System.out.println(stol);
        System.out.println(tshirt);
        System.out.println(chokolade);

        if (chokolade instanceof Perishable){
            Perishable p = (Perishable) chokolade;
            System.out.println("Er chokoladen udløbet? " + p.isAfterBestBefore());
        }
    }

}
