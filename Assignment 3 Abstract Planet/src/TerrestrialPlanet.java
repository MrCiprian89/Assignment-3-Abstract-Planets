/**
 * 
 */

/**
 * @author Steve
 *
 */
public class TerrestrialPlanet extends Planet implements IHabitable, IHasMoons {

	private Boolean _oxygen;
	/**
	 * @param name
	 * @param diameter
	 * @param mass
	 */
	public TerrestrialPlanet(String name, double diameter, double mass, Boolean oxygen) {
		super(name, diameter, mass);
		this._oxygen = oxygen;
	}

	/* (non-Javadoc)
	 * @see IHasMoons#HasMoons()
	 */
	@Override
	public Boolean HasMoons() {
		return (getMoonCount() > 0) ? true : false;
	}

	/* (non-Javadoc)
	 * @see IHabitable#Habitable()
	 */
	@Override
	public Boolean Habitable() {
		return (this._oxygen) ? true : false;
	}

}
