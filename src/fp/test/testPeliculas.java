package fp.test;

import fp.MarvelDC.Empresa;
import fp.MarvelDC.MarvelDC;

public class testPeliculas {

	public static void main(String[] args) {
		
		MarvelDC p1 = new MarvelDC ("Iron Man", 1, 7.9, 79, 126,2008, 140000000, 98618668, Empresa.MARVEL);
        MarvelDC p2 = new MarvelDC ("Iron Man Three",7.2, 62, 130, 2013,200000000);
        System.out.println(p1);
        System.out.println(p1.MismaAnyoestreno(p2));
        System.out.println(p1.compareTo(p2));

	}

}
