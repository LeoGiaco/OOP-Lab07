/**
 * 
 */
package it.unibo.oop.lab.enum1;

/**
 * Represents an enumeration for declaring sports;
 * 
 * 1) Complete the definition of the enumeration.
 * 
 */
public enum Sport {
    /*
     * declare the following sports: - basket - soccer - tennis - bike - F1 -
     * motogp - volley
     */
	BASKET("Basketball"),
	SOCCER("Soccer"),
	TENNIS("Tennis"),
	BIKE("Biking"),
	F1("Formula 1"),
	MOTOGP("MotoGP"),
	VOLLEY("Volleyball");
	
	private final String name;

	private Sport(final String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
}
