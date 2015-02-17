
public abstract class Planet {
	private double _diameter;
	private double _mass;
	private int _moonCount;
	private String _name;
	private double _orbitalPeriod;
	private int _ringCount;
	private double _rotationPeriod;
	
	public double getDiameter() {
		return _diameter;
	}
	public double getMass() {
		return _mass;
	}
	public int getMoonCount() {
		return _moonCount;
	}
	public void setMoonCount(int _moonCount) {
		this._moonCount = _moonCount;
	}
	public String getName() {
		return _name;
	}
	public double getOrbitalPeriod() {
		return _orbitalPeriod;
	}
	public void setOrbitalPeriod(double _orbitalPeriod) {
		this._orbitalPeriod = _orbitalPeriod;
	}
	public int getRingCount() {
		return _ringCount;
	}
	public void setRingCount(int _ringCount) {
		this._ringCount = _ringCount;
	}
	public double getRotationPeriod() {
		return _rotationPeriod;
	}
	public void setRotationPeriod(double _rotationPeriod) {
		this._rotationPeriod = _rotationPeriod;
	}

public Planet(String name, double diameter, double mass){
	this._name = name;
	this._diameter = diameter;
	this._mass = mass;
}

@Override 
public String toString(){
	return getName() + " has a diamteter of " + _diameter + " kilometers and a mass of " + _mass + " tons";
}
	
}
