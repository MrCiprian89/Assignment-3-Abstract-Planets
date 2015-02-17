/**
 * 
 */

/**
 * @author Steve
 *
 */
public class GiantPlanet extends Planet implements IHasRings, IHasMoons {

	
	
	private String _type;
	
	/**
	 * @param name
	 * @param diameter
	 * @param mass
	 */
	public GiantPlanet(String name, double diameter, double mass, String type) {
		super(name, diameter, mass);
		this._type = type;
		// TODO Auto-generated constructor stub
	}

	
	
	/* (non-Javadoc)
	 * @see IHasMoons#HasMoons()
	 */
	@Override
	public Boolean HasMoons() {
		return (getMoonCount() > 0) ? true : false;
	}

	/* (non-Javadoc)
	 * @see IHasRings#HasRings()
	 */
	@Override
	public Boolean HasRings() {
		return (getRingCount() > 0) ? true : false;
	}

}
