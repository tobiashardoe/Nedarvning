package Task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Perishable extends Product {
    private LocalDate bestBefore;

    public Perishable(int price, String name, LocalDate bestBefore) {
        super(price, name);
        this.bestBefore = bestBefore;
    }

    @Override
    public String toString() {
        String s = super.toString();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM yyyy");
        s+= ", bedst før: "+bestBefore.format(formatter);
        return s;
    }
    public boolean isAfterBestBefore(){
    if(LocalDate.now().isAfter(bestBefore)) {
        return true;
    } return false;
    }
}
