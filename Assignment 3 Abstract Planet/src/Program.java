/**
 * 
 */

/**
 * @author Steve
 *
 */
public class Program {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GiantPlanet bigPlanet = new GiantPlanet("Jupiter", 108, 532, "ice");
		System.out.println(bigPlanet.toString());
		TerrestrialPlanet teresPlanet = new TerrestrialPlanet("Earth", 55.3, 382, true);
		System.out.println(teresPlanet.toString());

	}

}
