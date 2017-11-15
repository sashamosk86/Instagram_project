package itea.day1;

public class CollectorCompany {
    private String name;
    private DebtMan debtMan;

    public CollectorCompany(String name, DebtMan debtMan){
        this.name = name;
        this.debtMan = debtMan;
    }

    public String getName() {
        return name;
    }

    public DebtMan getDebtMan() {
        return debtMan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDebtMan(DebtMan debtMan) {
        this.debtMan = debtMan;
    }

    @Override
    public String toString() {
        return "CollectorCompany{" +
                "name='" + name + '\'' +
                ", debtMan=" + debtMan +
                '}';
    }
}
