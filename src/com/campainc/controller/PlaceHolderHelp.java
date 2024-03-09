package com.campainc.controller;

import domain.CampainAds;

public class PlaceHolderHelp {

	private final static String NOME_METODO = "%Metodo%";
	private final static String NOME_PRODUTO = "%NomeProduto%";
	private final static String NOME_PRODUTOR = "%NomeProdutor%";
	private final static String VALOR_PRODUTO = "%Valor%";
	private final static String VALOR_PARCELADO = "%ValorParcelado%";
	private final static String VALOR_DESCONTO = "%Desconto%";
	private final static String QUANTIDADE_DE_BONUS = "%Bonus%";
	private final static String QUANTIDADE_DE_MODULOS = "%Modulos%";
	private final static String QUANTIDADE_DE_PARCELAS = "%Parcelas%";
	private final static String NICHO = "%Nicho%";
	
	
	public static String replacePlaceHolders(String toReplace, CampainAds ads) {
		
		if(toReplace.replace(NOME_METODO, ads.getNomeMetodo()).length() > 30) {
			toReplace = toReplace.replace(NOME_METODO, ads.getNomeProduto());
		}else {
			toReplace = toReplace.replace(NOME_METODO, ads.getNomeMetodo());
		}
		
		toReplace = toReplace.replace(NOME_PRODUTO, ads.getNomeProduto());
		toReplace = toReplace.replace(NOME_PRODUTOR, ads.getNomeProdutor());
		toReplace = toReplace.replace(VALOR_PRODUTO, String.valueOf(ads.getValorProduto()));
		toReplace = toReplace.replace(VALOR_DESCONTO, ads.getValorDesconto());
		toReplace = toReplace.replace(QUANTIDADE_DE_BONUS, ads.getQuantidadeBonus());
		toReplace = toReplace.replace(QUANTIDADE_DE_MODULOS, ads.getQuantidadeModulos());
		toReplace = toReplace.replace(QUANTIDADE_DE_PARCELAS, String.valueOf(ads.getQuantidadeParcelas()));
		toReplace = toReplace.replace(VALOR_PARCELADO, String.valueOf(ads.getValorProduto()/ads.getQuantidadeParcelas()));
		toReplace = toReplace.replace(NICHO, ads.getNicho());
		
		return toReplace;
	}
	
}
