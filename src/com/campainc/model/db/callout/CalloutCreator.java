package com.campainc.model.db.callout;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Set;

import domain.assets.Callout;

public class CalloutCreator {
	
	
	static List<String> calloutsDB  = new ArrayList<>();
	
	static {
		calloutsDB.add("M�todo Comprovado");
		calloutsDB.add("100% Comfi�vel");
		calloutsDB.add("Promo��o imperd�vel");
		calloutsDB.add("Curso 100% Confi�vel");
		calloutsDB.add("Curso Completo em 12x");
		calloutsDB.add("Compre com Garantia");
		calloutsDB.add("Site Oficial de Inscri��o");
		calloutsDB.add("Satisfa��o Garantida");
		calloutsDB.add("Compre com Desconto");
		calloutsDB.add("Adquira Hoje Mesmo");
		calloutsDB.add("M�todo Comprovado");
	}
	
	
	public static void addCallOut(Set<String> calloutCampain, int limitSizeReal, int limitLeft) {
		Collections.shuffle(calloutsDB);
		
		Random random = new Random();
		if(limitLeft == 0) {
			random.ints(0, calloutsDB.size()).limit(limitSizeReal).forEach(c -> {
				calloutCampain.add(calloutsDB.get(c));
			});	
		}else {
				random.ints(0, calloutsDB.size()).limit(limitLeft).forEach(c -> {
					calloutCampain.add(calloutsDB.get(c));
				});	
		}
		
		if(calloutCampain.size() < limitSizeReal) {
				limitLeft = limitSizeReal - calloutCampain.size();
				addCallOut(calloutCampain, limitSizeReal, limitLeft);
		}
	}
	

}
