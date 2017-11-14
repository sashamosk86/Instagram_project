package ITEA_2;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.time.LocalDate;

public class DebtMan extends Human implements Externalizable{
    private double totalDebt;
    private LocalDate startDate;

    public DebtMan(String name,double totalDebt){
        super(name);
        this.totalDebt = totalDebt;
    }


    public void setTotalDebt(double totalDebt) {
        this.totalDebt = totalDebt;
    }



    public double getTotalDebt() {
        return totalDebt;
    }

    public LocalDate getStartDate() {
        return startDate;
    }



    @Override
    public String toString() {
        return "DebtMan{" +
               ", totalDebt=" + totalDebt +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {

    }
}
