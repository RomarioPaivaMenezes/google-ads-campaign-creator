package domain.assets;

import java.util.HashSet;
import java.util.Set;

public class StructuredSnippet {
	
	private Set<String> structuredSnippet = new HashSet<String>();

	/**
	 * @return the callOuts
	 */
	public Set<String> getStructuredSnippets() {
		return structuredSnippet;
	}

	/**
	 * @param callOuts the callOuts to set
	 */
	public void setStructuredSnippet(Set<String> callOuts) {
		this.structuredSnippet = callOuts;
	}
	
	
}
