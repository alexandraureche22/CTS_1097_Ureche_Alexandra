package spectacol.prtotype.main;

import spectacol.factory.IShow;
import spectacol.factory.ShowFactory;
import spectacol.prtotype.Poster;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Poster poster1 = new Poster("concert","logo.png");
        Poster poster2 = new Poster("teatru","logo.png");
        Poster poster3 = new Poster("standup","logo.png");
        Poster poster4 = (Poster) poster1.cloneaza();
        System.out.println("sunt egale?"+(poster1==poster4));

        IShow s1 = ShowFactory.creeaza("concert","vita","arene","azi",
                "rock", List.of("x","y"));
        IShow s2 = ShowFactory.creeaza("standup","comic club","std maicuta",
                "22-12-2026 20:00",true, List.of("toma","parcalab"));
        IShow s3 = ShowFactory.creeaza("teatru","bio eco","teatru mic",
                "22-12-2026 20:00","rock", List.of("chirila","maia"));

        Poster afis1 = (Poster) poster1.cloneaza();
        Poster afis2 = (Poster) poster2.cloneaza();
        Poster afis3 = (Poster) poster3.cloneaza();
        afis1.setShow(s1);
        afis2.setShow(s2);
        afis3.setShow(s3);
        afis1.print();
        afis2.print();
        afis3.print();



    }
}
