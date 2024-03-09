package com.campainc.model.db.headline;

import java.util.Collections;
import java.util.List;
import java.util.Random;

import com.campainc.controller.PlaceHolderHelp;

import domain.CampainAds;

public class HeadLineCreator {
	
	public static String getHeadLine(CampainAds campain, SegmentHeadLine segmentSiteLink) {
		
		String line = genarateSiteLink(new HeadLine(), segmentSiteLink);
		return PlaceHolderHelp.replacePlaceHolders(line, campain);
	}
	
	private static String genarateSiteLink(HeadLine headline, SegmentHeadLine segmentSiteLink) {

		List<String> list = null;
		switch (segmentSiteLink) {
		case PRODUTO:
			list = headline.getHeadLines();
			break;

		case PRODUTOR:
			list = headline.getHeadLinesProdutorName();
			break;
		}
		Collections.shuffle(list);
		return getSiteLink(list);
	}

	private static String getSiteLink(List<String> headlinesDb) {
		Random random = new Random();
		int i = random.nextInt(headlinesDb.size());
		return headlinesDb.get(i);
	}

	public enum SegmentHeadLine{
		PRODUTO,
		PRODUTOR;
	}
	

	
}
