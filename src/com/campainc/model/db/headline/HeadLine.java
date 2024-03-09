package com.campainc.model.db.headline;

import java.util.ArrayList;
import java.util.List;

public class HeadLine {
	
	static List<String> headLines  = new ArrayList<>();
	static List<String> headLinesProdutorName  = new ArrayList<>();
	
	static {

		headLines.add("Conhe�a O %Metodo% 2023");
		headLines.add("Sistema %Metodo%");
		headLines.add("M�todo %Metodo% 2023 Hoje R$ %Valor%");
		headLines.add("M�todo %Metodo%");
		headLines.add("M�todo %Metodo% 2023 Hoje R$ %Valor%");
		headLines.add("M�todo Completo Com Garantia");
		headLines.add("Aproveite a Oferta Especial");
		headLines.add("Super Oferta Hoje %Parcelas%x R$ %ValorParcelado%");
		headLines.add("Oferta %NomeProduto%");
		headLines.add("M�todo do %NomeProdutor%");
		headLines.add("Compre Hoje M�todo Completo");
		headLines.add("M�todo %Metodo% Oficial R$%Valor%");
		headLines.add("Curso de %Nicho% Online");
		headLines.add("M�todo Certificado por %Entidade%");
		headLines.add("Hoje por apenas %Parcelas%x R$ %ValorParcelado%");
		headLines.add("%Desconto%% Desconto +B�nus Especiais");
		headLines.add("Curso Online Com Garantia");
		headLines.add("� Vista R$%Valor% ou %Parcelas%x R$%ValorParcelado%");
		headLines.add("[Site Oficial]");
		headLines.add("Super Oferta Hoje %Parcelas%x R$%ValorParcelado%");
		headLines.add("Hoje Apenas R$ %Valor% � Vista");
		headLines.add("M�todo Completo +%Bonus% B�nus R$%Valor%");
		headLines.add("Oferta Programa %NomeProduto%");
		headLines.add("M�todo %Metodo% Super Oferta Hoje");
		headLines.add("Alavanque Sua Carreira");
		headLines.add("%Desconto%% Desconto Hoje c/ +%Bonus% B�nus");
		
	}
		
	static {
		headLinesProdutorName.add("%NomeProdutor% Curso Oficial");
		headLinesProdutorName.add("Curso %NomeProduto% %NomeProdutor%");
		headLinesProdutorName.add("M�todo %NomeProduto% - %NomeProdutor%");
		headLinesProdutorName.add("%NomeProdutor% - %NomeProduto%");
	}

	/**
	 * @return the headLines
	 */
	public static List<String> getHeadLines() {
		return headLines;
	}

	/**
	 * @param headLines the headLines to set
	 */
	public static void setHeadLines(List<String> headLines) {
		HeadLine.headLines = headLines;
	}

	/**
	 * @return the headLinesProdutorName
	 */
	public static List<String> getHeadLinesProdutorName() {
		return headLinesProdutorName;
	}

	/**
	 * @param headLinesProdutorName the headLinesProdutorName to set
	 */
	public static void setHeadLinesProdutorName(List<String> headLinesProdutorName) {
		HeadLine.headLinesProdutorName = headLinesProdutorName;
	}

		
	
	
	
}
