package domain.ads;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import domain.assets.Callout;
import domain.assets.SiteLink;
import domain.assets.StructuredSnippet;

public class ResponsiveLayoutAds {

	Set<String> headLins = new HashSet<>();
	Set<String> descriptions = new HashSet<>();
	Callout callout = new Callout();
	List<SiteLink> siteLinks = new ArrayList<>();
	List<StructuredSnippet> structuredSnippet = new ArrayList<>();
	
}
