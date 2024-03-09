package domain;

import java.util.ArrayList;
import java.util.List;

import domain.ads.ResponsiveLayoutAds;

public class GroupAds {
	
	private List<ResponsiveLayoutAds> siteLinks = new ArrayList<>();

	/**
	 * @return the siteLinks
	 */
	public List<ResponsiveLayoutAds> getSiteLinks() {
		return siteLinks;
	}

	/**
	 * @param siteLinks the siteLinks to set
	 */
	public void setSiteLinks(List<ResponsiveLayoutAds> siteLinks) {
		this.siteLinks = siteLinks;
	}

	
	
}
