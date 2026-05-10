package hotel.main;

import hotel.model.prototype.VoucherPresetat;

public class MainPrototype {
    public static void main(String[] args) {
        VoucherPresetat v1 = new VoucherPresetat("design voucher menu premiu");

        VoucherPresetat v2 = (VoucherPresetat) v1.cloneaza();
        v2.setCodReducere("5a0");
        v2.setNume("ureche");
        v2.setDiscount(50);
        v2.afiseazaVoucher();
    }
}
