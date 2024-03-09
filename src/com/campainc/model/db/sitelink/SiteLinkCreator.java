package com.campainc.model.db.sitelink;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.campainc.controller.PlaceHolderHelp;

import domain.CampainAds;

public class SiteLinkCreator {
	
	public static String getSiteLinkDefault(CampainAds campain, SegmentSiteLink segmentSiteLink, TypeSiteLink typeSiteLink ) {
		
		SiteLinkInterface siteLinkDb = null;
		
		switch (typeSiteLink) {
		case GARANTIA:
			siteLinkDb = new SiteLinkGarantia();
			break;

		case CERTIFICADO:
			siteLinkDb = new SiteLinkCertificado();
			break;
			
		case DEFAULT:
		  siteLinkDb = new SiteLinkDefault();
		  break;
		}
		
		String line = genarateSiteLink(siteLinkDb, segmentSiteLink);
		return PlaceHolderHelp.replacePlaceHolders(line, campain);
	}
	
	private static String genarateSiteLink(SiteLinkInterface siteLink, SegmentSiteLink typeSiteLink) {

		List<String> list = null;
		switch (typeSiteLink) {
		case TITLE:
			list = siteLink.getSiteLinkTitles();
			break;

		case DESCRIPTION:
			list = siteLink.getSiteLinkDescriptions();
			break;
		}
		Collections.shuffle(list);
		return getSiteLink(list);
	}

	private static String getSiteLink(List<String> siteLinkDb) {
		Random random = new Random();
		int i = random.nextInt(siteLinkDb.size());
		return siteLinkDb.get(i);
	}

	public enum SegmentSiteLink{
		TITLE,
		DESCRIPTION;
	}
	
	public enum TypeSiteLink{
		GARANTIA,
		CERTIFICADO,
		DEFAULT;
	}
	
}
