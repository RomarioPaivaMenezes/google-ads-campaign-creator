package com.campainc.test;

import com.campainc.model.db.headline.HeadLineCreator;
import com.campainc.model.db.headline.HeadLineCreator.SegmentHeadLine;

import domain.CampainAds;

public class HeadLineTest {

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



		System.out.println("HEADLINES - 1 - PRODUTO");
		for (int i = 0; i < 10 ; i++) {
			System.out.println(HeadLineCreator.getHeadLine(campain, SegmentHeadLine.PRODUTO)); 
		}

		System.out.println();
		System.out.println("HEADLINES - 2 - PRODUTOR");
		for (int i = 0; i < 10 ; i++) {
			System.out.println(HeadLineCreator.getHeadLine(campain, SegmentHeadLine.PRODUTOR)); 
		}




	}


}
