package com.campainc.test;

import java.util.List;
import java.util.Set;

import com.campainc.model.db.sitelink.SiteLinkCreator;
import com.campainc.model.db.sitelink.SiteLinkCreator.SegmentSiteLink;
import com.campainc.model.db.sitelink.SiteLinkCreator.TypeSiteLink;

import domain.CampainAds;
import domain.GroupAds;
import domain.assets.SiteLink;

public class SiteLinkTest {
	
public static void main(String[] args) {
		
		/*CampainAds campain = new CampainAds(
				"CampainhaTest",
				"RPM",
				"Romário",
				"inscreva-se",
				"http://teste.com.br",
				"http://teste.com.br",
				"RPM",
				258.00D,
				"50",
				"7",
				"8",
				12,
				"TesteJava",
				null,
				null
				);*/
	
		CampainAds campain = new CampainAds(
			"[S] F.F - 41ºG - CM R$173.5 - Guitarra Rock Academy [7/4/2023][TK - R$347 - CM - 0.5% - VL - R$173.5]\r\n", 		//name
			"Guitarra Rock Academy",	//nomeProduto
			"Ozielzinho",				//nomeProdutor	
			"inscreva-se",  		//displayPath
			"https://guitarrarockonline.com.br/pv-c00-guitarra-rock-academy/?ref=V81593962O",	//finalURL
			"https://go.hotmart.com/V81593962O",	//trackingtemplate
			"GRA",					//nomeMetodo
			346.96D,				//valorProduto
			"30",					//valorDesconto
			"0",					//quantidadeBonus
			"9",					//quantidadeModulos
			12,						//quantidadeParcelas
			"Tocar Guitarra",			//nicho
			null,					//keyWordsAd
			null					//groups
			);
		
		SiteLink siteLink = new SiteLink();

		siteLink.setSiteLinkTest(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.TITLE, TypeSiteLink.GARANTIA)); 
		siteLink.setDescriptionLine1(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.DESCRIPTION, TypeSiteLink.GARANTIA));
		siteLink.setDescriptionLine2(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.DESCRIPTION, TypeSiteLink.GARANTIA));

		System.out.println("SITELINK - 1 - GARANTIA");
		System.out.println("Title: "+siteLink.getSiteLinkTest());
		System.out.println("Description1: "+siteLink.getDescriptionLine1());
		System.out.println("Description2: "+siteLink.getDescriptionLine2());
		System.out.println("URL: "+campain.getFinalURL()+"&src=slk1");
		
		System.out.println();
		SiteLink siteLink2 = new SiteLink();
		
		siteLink2.setSiteLinkTest(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.TITLE, TypeSiteLink.CERTIFICADO)); 
		siteLink2.setDescriptionLine1(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.DESCRIPTION, TypeSiteLink.CERTIFICADO));
		siteLink2.setDescriptionLine2(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.DESCRIPTION, TypeSiteLink.CERTIFICADO));
		
		System.out.println("SITELINK - 2 - CERTIFICADO");
		System.out.println("Title: "+siteLink2.getSiteLinkTest());
		System.out.println("Description1: "+siteLink2.getDescriptionLine1());
		System.out.println("Description2: "+siteLink2.getDescriptionLine2());
		System.out.println("URL: "+campain.getFinalURL()+"&src=slk2");
		
		System.out.println();
		SiteLink siteLink3 = new SiteLink();
		
		siteLink3.setSiteLinkTest(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.TITLE, TypeSiteLink.DEFAULT)); 
		siteLink3.setDescriptionLine1(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.DESCRIPTION, TypeSiteLink.DEFAULT));
		siteLink3.setDescriptionLine2(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.DESCRIPTION, TypeSiteLink.DEFAULT));
		
		System.out.println("SITELINK - 3 - DEFAULT");
		System.out.println("Title: "+siteLink3.getSiteLinkTest());
		System.out.println("Description1: "+siteLink3.getDescriptionLine1());
		System.out.println("Description2: "+siteLink3.getDescriptionLine2());
		System.out.println("URL: "+campain.getFinalURL()+"&src=slk3");
		
		System.out.println();
		SiteLink siteLink4 = new SiteLink();
		
		siteLink4.setSiteLinkTest(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.TITLE, TypeSiteLink.DEFAULT)); 
		siteLink4.setDescriptionLine1(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.DESCRIPTION, TypeSiteLink.DEFAULT));
		siteLink4.setDescriptionLine2(SiteLinkCreator.getSiteLinkDefault(campain, SegmentSiteLink.DESCRIPTION, TypeSiteLink.DEFAULT));
		
		System.out.println("SITELINK - 4 - DEFAULT");
		System.out.println("Title: "+siteLink4.getSiteLinkTest());
		System.out.println("Description1: "+siteLink4.getDescriptionLine1());
		System.out.println("Description2: "+siteLink4.getDescriptionLine2());
		System.out.println("URL: "+campain.getFinalURL()+"&src=slk4");
	}


}
