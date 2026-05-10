package hotel.model.prototype;

public class VoucherPresetat implements  IVoucher, ICloneaza{
    private String nume;
    private String codReducere;
    private int discount;
    private String design;

    public VoucherPresetat(String design) {
        this.nume = " ";
        this.codReducere = " ";
        this.discount = 0;
        this.design = design;
    }

    public VoucherPresetat(VoucherPresetat altul) {
        this.nume = altul.nume;
        this.codReducere = altul.codReducere;
        this.discount = altul.discount;
        this.design = altul.design;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCodReducere(String codReducere) {
        this.codReducere = codReducere;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "VoucherPresetat{" +
                "nume='" + nume + '\'' +
                ", codReducere='" + codReducere + '\'' +
                ", discount=" + discount +
                ", design='" + design + '\'' +
                '}';
    }

    @Override
    public void afiseazaVoucher() {
        System.out.println("VoucherPresetat{" +
                "nume='" + nume + '\'' +
                ", codReducere='" + codReducere + '\'' +
                ", discount=" + discount +
                ", design='" + design + '\'' +
                '}');
    }

    @Override
    public IVoucher cloneaza() {
        return new VoucherPresetat(this);
    }
}
