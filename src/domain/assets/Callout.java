package domain.assets;

import java.util.HashSet;
import java.util.Set;

public class Callout {
	
	private Set<String> callOuts = new HashSet<>();

	/**
	 * @return the callOuts
	 */
	public Set<String> getCallOuts() {
		return callOuts;
	}

	/**
	 * @param callOuts the callOuts to set
	 */
	public void setCallOuts(Set<String> callOuts) {
		this.callOuts = callOuts;
	}
	
	
}
