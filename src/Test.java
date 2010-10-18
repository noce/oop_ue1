public class Test{
	public static void main(String args[]){
		
		/* funktioniert. Is aber wahrscheinlich nicht die eleganteste/schönste Lösung
		 * Das hier ist eigentlich das was dann in der Test klasse stehen soll
		 * reden wir uns halt zam montag oder so ( habe jez nox nix kommentiert)
		 */
		
		Product p1 = new Product("Klobürste","Modell: Ida >> seehr ergonomisch",4);
		Product p2 = new Product("Steckdose","Modell: Manfred. Auch nicht schlecht",10);
		Product p3 = new Product("Stecker","Modell: Stefanie. Passt zu Manfred");
		
		ProductGroup haushalt = new ProductGroup("Haushalt");
		haushalt.addProduct(p1);
		haushalt.addProduct(p2);
		
		ProductGroup wohnen = new ProductGroup("Wohnen");
		wohnen.addProduct(p3);
		
		haushalt.addToGroup(wohnen);
		
		System.out.println(haushalt.toString());
		
		Configuration c1 = new Configuration("Küche");
		c1.addProduct(p1, 1);
		c1.addProduct(p2, 5);
		
		c1.buildConfig();
		
		/*Testfall Konfiguration zu oft gebaut, zu wenig Teile*/
		c1.buildConfig();
		//System.out.println(haushalt.toString());
		
		
		System.out.println(c1.toString());
	}
}
