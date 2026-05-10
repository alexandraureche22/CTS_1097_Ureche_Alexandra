package adapter.restaurant;

import java.util.List;

public class Main {
    static void main() {
        SoftBucatarie softBucatarie = new SoftBucatarie("soft1");
        ISoftBar iSoftBar1 = new SoftBar();
        ISoftBar iSoftBar = new SoftAdaptor(softBucatarie);
        List<ISoftBar> softs = List.of(iSoftBar1,iSoftBar);
        softs.forEach(ISoftBar::proceseazaComandaBar);
    }
}
