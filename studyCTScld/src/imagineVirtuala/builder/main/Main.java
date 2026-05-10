package imagineVirtuala.builder.main;

import imagineVirtuala.builder.Builder;
import imagineVirtuala.builder.IImagineBuilder;
import imagineVirtuala.builder.ImagineVirtuala;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ImagineVirtuala i1 = new Builder().setNumeImagine("png").setAntivirus("dwbd").build();
        ImagineVirtuala i2 = new Builder().setNumeImagine("nhdwqjd").setAntivirus("dfewfwewbd").
                setAplicatiiExtra(List.of("fox", "mozila", "roblox")).build();
        ImagineVirtuala i3 = new Builder().setNumeImagine("pngfwefweg").setAntivirus("dwtrhqerbd").build();
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
    }
}
