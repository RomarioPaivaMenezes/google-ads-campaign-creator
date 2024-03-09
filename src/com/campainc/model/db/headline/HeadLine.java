package com.campainc.model.db.headline;

import java.util.ArrayList;
import java.util.List;

public class HeadLine {
	
	static List<String> headLines  = new ArrayList<>();
	static List<String> headLinesProdutorName  = new ArrayList<>();
	
	static {

		headLines.add("Conheça O %Metodo% 2023");
		headLines.add("Sistema %Metodo%");
		headLines.add("Método %Metodo% 2023 Hoje R$ %Valor%");
		headLines.add("Método %Metodo%");
		headLines.add("Método %Metodo% 2023 Hoje R$ %Valor%");
		headLines.add("Método Completo Com Garantia");
		headLines.add("Aproveite a Oferta Especial");
		headLines.add("Super Oferta Hoje %Parcelas%x R$ %ValorParcelado%");
		headLines.add("Oferta %NomeProduto%");
		headLines.add("Método do %NomeProdutor%");
		headLines.add("Compre Hoje Método Completo");
		headLines.add("Método %Metodo% Oficial R$%Valor%");
		headLines.add("Curso de %Nicho% Online");
		headLines.add("Método Certificado por %Entidade%");
		headLines.add("Hoje por apenas %Parcelas%x R$ %ValorParcelado%");
		headLines.add("%Desconto%% Desconto +Bônus Especiais");
		headLines.add("Curso Online Com Garantia");
		headLines.add("Á Vista R$%Valor% ou %Parcelas%x R$%ValorParcelado%");
		headLines.add("[Site Oficial]");
		headLines.add("Super Oferta Hoje %Parcelas%x R$%ValorParcelado%");
		headLines.add("Hoje Apenas R$ %Valor% Á Vista");
		headLines.add("Método Completo +%Bonus% Bônus R$%Valor%");
		headLines.add("Oferta Programa %NomeProduto%");
		headLines.add("Método %Metodo% Super Oferta Hoje");
		headLines.add("Alavanque Sua Carreira");
		headLines.add("%Desconto%% Desconto Hoje c/ +%Bonus% Bônus");
		
	}
		
	static {
		headLinesProdutorName.add("%NomeProdutor% Curso Oficial");
		headLinesProdutorName.add("Curso %NomeProduto% %NomeProdutor%");
		headLinesProdutorName.add("Método %NomeProduto% - %NomeProdutor%");
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
