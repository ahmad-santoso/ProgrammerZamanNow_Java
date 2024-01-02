package programmer.zaman.now.application;

import static programmer.zaman.now.data.Application.PROCESSORS;
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        System.out.println(APPLICATION);       // Tentang variabel (memanggil file Constant)
        System.out.println(VERSION);

        System.out.println(
                MathUtil.sum(1,1,1,1,1)         // Tentang method (memanggil file MathUtil)
        );

        Country.City city = new Country.City();         // Tentang Class (memanggil file Country)
        city.setName("Tigaraksa");
        System.out.println(city.getName());

        System.out.println(PROCESSORS);     // Tentang Block (memanggil file Application)
    }
}
