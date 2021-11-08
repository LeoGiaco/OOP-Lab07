/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */
	BASKET("Basketball", 5, Place.INDOOR),
	VOLLEY("Volleyball", 6, Place.INDOOR),
	TENNIS("Tennis", 1, Place.OUTDOOR),
	BIKE("Biking", 3, Place.OUTDOOR),
	F1("Formula 1", 1, Place.OUTDOOR),
	MOTOGP("MotoGP", 1, Place.OUTDOOR),
	SOCCER("Soccer", 11, Place.OUTDOOR);
    /*
     * 
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	private final int members;
	private final String name;
	private final Place place;
    /*
     * 
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int noTeamMembers, final String actualName)
     */
	private Sport(final String name, final int members, final Place place) {
		this.name = name;
		this.members = members;
		this.place = place;
	}
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	/**
	 * Returns a boolean that shows if the sport is individual or not.
	 * @return true if the number of team members is = 1.
	 */
	public boolean isIndividualSport() {
		return this.members == 1;
	}
	
	/**
	 * Returns a boolean that shows if the sport is indoor or not.
	 * @return true if place is = {@link Place}.INDOOR.
	 */
	public boolean isIndoorSport() {
		return this.place == Place.INDOOR;
	}
	
	/**
	 * Retrieves the name of the sport.
	 * @return the name of the sport.
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Retrieves the place where the sport is practiced.
	 * @return a {@link Place}.
	 */
	public Place getPlace() {
		return this.place;
	}
	
	/**
	 * Returns the number of team members for the sport.
	 * @return a number.
	 */
	public int getMembers() {
		return this.members;
	}
	
	/**
	 * Returns a string representation of the sport.
	 */
	public String toString() {
		return "[Sport: name= " + this.getName() + ", place=" + this.getPlace() + ", members=" + this.getMembers() + "]";
	}
}
