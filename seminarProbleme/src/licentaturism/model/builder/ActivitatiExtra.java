package licentaturism.model.builder;

import java.util.List;

public class ActivitatiExtra {
    private List<String> excursiiGrup;
    private List<String> viziteMuzee;

    public ActivitatiExtra(List<String> excursiiGrup, List<String> viziteMuzee) {
        this.excursiiGrup = excursiiGrup;
        this.viziteMuzee = viziteMuzee;
    }

    @Override
    public String
    toString() {
        return "ActivitatiExtra{" +
                "excursiiGrup=" + excursiiGrup +
                ", viziteMuzee=" + viziteMuzee +
                '}';
    }
}
