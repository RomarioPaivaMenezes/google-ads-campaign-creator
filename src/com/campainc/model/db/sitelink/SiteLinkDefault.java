package com.campainc.model.db.sitelink;

import java.util.ArrayList;
import java.util.List;

public class SiteLinkDefault implements SiteLinkInterface{

	private static List<String> siteLinkTitles  = new ArrayList<>();
	private static List<String> siteLinkDescription  = new ArrayList<>();
	
	static {
		siteLinkTitles.add("Compre o M�todo Aprovado");
		siteLinkTitles.add("B�nus 1 M�s Grupo Vip");
		siteLinkTitles.add("%NomeProdutor% Oficial");
		siteLinkTitles.add("Compre com Garantia R$%Valor%");
		siteLinkTitles.add("Alavanque Sua Carreira");
		siteLinkTitles.add("M�todo de %NomeProdutor% 100% Online");
		siteLinkTitles.add("M�todo %Metodo% 100% Online");
		siteLinkTitles.add("Hoje %Parcelas% X de R$ %Valor%");
		siteLinkTitles.add("Oferta Hoje %Parcelas%x R$ %ValorParcelado%");
		siteLinkTitles.add("Garanta Sua Vaga Hoje");
		siteLinkTitles.add("[Hoje Por Apenas R$%Valor%]");
		siteLinkTitles.add("Conhe�a O %Metodo% 2023");
		
	}
	
	static {
		siteLinkDescription.add("N�o perca mais tempo comece hoje");
		siteLinkDescription.add("Come�e agora mesmo | %Parcelas%x R$%ValorParcelado%");
		siteLinkDescription.add("Te Ensino Passo a Passo");
		siteLinkDescription.add("No Curso mais Completo do Brasil");
		siteLinkDescription.add("Voc� Satisfeito 100%");
		siteLinkDescription.add("100% Online +5 M�dulos e 5 B�nus");
		siteLinkDescription.add("Aulas B�nus +Treinamentos em Videos");
		siteLinkDescription.add("T�cnica Testada e Comprovada");
		siteLinkDescription.add("Tenha Cliente Fi�is e Se Destaque");
		siteLinkDescription.add("Material Did�tico e Grupo de Apoio");
		siteLinkDescription.add("+%Modulos% M�dulos e +%Bonus% B�nus Exclusivos");
		siteLinkDescription.add("Adquira Hoje o M�todo %Metodo%");
		siteLinkDescription.add("Seja Especialista Fidelize Clientes");
		siteLinkDescription.add("Curso d(o) %NomeProdutor%");
		siteLinkDescription.add("100% Online com Grupo de Alunos");
		siteLinkDescription.add("Com Suporte e Comunidade Facebook");
		siteLinkDescription.add("�ltimas Vagas com %Desconto%% de Desconto");
		siteLinkDescription.add("B�nus Exclusivos");
		siteLinkDescription.add("Aprenda Tudo Sobre %Nicho%");
		siteLinkDescription.add("Com Desconto Inscri��o Somente Hoje");
		siteLinkDescription.add("Oferta Por Tempo Limitado");
		siteLinkDescription.add("Aproveite a Oferta Especial");
		siteLinkDescription.add("Super Oferta Hoje %Parcelas%x R$ %ValorParcelado%");
		siteLinkDescription.add("Compre Hoje M�todo Completo");
		siteLinkDescription.add("Material de Apoio em PDF");
		siteLinkDescription.add("Suporte ao Aluno");
		siteLinkDescription.add("100% Online com Grupo de Alunos ");
		siteLinkDescription.add("Garanta Sua Vaga Hoje");
		
	}
	
	@Override
	public List<String> getSiteLinkTitles(){
		return siteLinkTitles;
	}

	@Override
	public List<String> getSiteLinkDescriptions() {
		return siteLinkDescription;
	}

}
