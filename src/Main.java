//git add .classpath .project Main.java

public class Main{
	public static void main(String args[]){
		
		/* funktioniert. Is aber wahrscheinlich nicht die eleganteste/schönste Lösung
		 * Das hier ist eigentlich das was dann in der Test klasse stehen soll
		 * reden wir uns halt zam montag oder so ( habe jez nox nix kommentiert)
		 */
		
		product p1 = new product("Klohbürste","Modell: Ida >> seehr ergonomisch",4);
		product p2 = new product("Steckdose","Modell: Manfred. Auch nicht schlecht",10);
		product p3 = new product("Stecker","Modell: Stefanie. Passt zu Manfred");
		
		productgroup haushalt = new productgroup("Haushalt");
		haushalt.addProduct(p1);
		haushalt.addProduct(p2);
		
		productgroup wohnen = new productgroup("Wohnen");
		wohnen.addProduct(p3);
		
		haushalt.addToGroup(wohnen);
		
		System.out.println(haushalt.toString());
		
		configuration c1 = new configuration("Küche");
		c1.addProduct(p1, 1);
		c1.addProduct(p2, 5);
		
		c1.buildConfig();
		
		/*Testfall Konfiguration zu oft gebaut, zu wenig Teile
		c1.buildConfig();
		System.out.println(haushalt.toString());
		*/
		
		System.out.println(c1.toString());
	}
}
