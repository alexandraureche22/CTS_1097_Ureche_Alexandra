package prototype.map;

public class Main {
    public static void main(String[] args) {
        RegistruInvitatie registruInvitatie = new RegistruInvitatie();

        InvitatiePresetata invitatiePremium = new InvitatiePresetata("alb negru","arial","fara elemente");
        InvitatiePresetata invitatieStandard = new InvitatiePresetata("color","times","cu elemente");

        registruInvitatie.salveazaInvitatie("premium",invitatiePremium);
        registruInvitatie.salveazaInvitatie("standard",invitatieStandard);

        InvitatiePresetata inv1 = registruInvitatie.getInvitatie("premium");
        InvitatiePresetata inv2 = registruInvitatie.getInvitatie("standard");
        inv1.setTip("caca maca");
        inv2.setTip("loco moco");
        inv1.print();
        inv2.print();

    }
}
