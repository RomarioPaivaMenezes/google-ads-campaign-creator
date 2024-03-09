package com.campainc.model.db.sitelink;

import java.util.ArrayList;
import java.util.List;

public class SiteLinkDefault implements SiteLinkInterface{

	private static List<String> siteLinkTitles  = new ArrayList<>();
	private static List<String> siteLinkDescription  = new ArrayList<>();
	
	static {
		siteLinkTitles.add("Compre o Método Aprovado");
		siteLinkTitles.add("Bônus 1 Mês Grupo Vip");
		siteLinkTitles.add("%NomeProdutor% Oficial");
		siteLinkTitles.add("Compre com Garantia R$%Valor%");
		siteLinkTitles.add("Alavanque Sua Carreira");
		siteLinkTitles.add("Método de %NomeProdutor% 100% Online");
		siteLinkTitles.add("Método %Metodo% 100% Online");
		siteLinkTitles.add("Hoje %Parcelas% X de R$ %Valor%");
		siteLinkTitles.add("Oferta Hoje %Parcelas%x R$ %ValorParcelado%");
		siteLinkTitles.add("Garanta Sua Vaga Hoje");
		siteLinkTitles.add("[Hoje Por Apenas R$%Valor%]");
		siteLinkTitles.add("Conheça O %Metodo% 2023");
		
	}
	
	static {
		siteLinkDescription.add("Não perca mais tempo comece hoje");
		siteLinkDescription.add("Começe agora mesmo | %Parcelas%x R$%ValorParcelado%");
		siteLinkDescription.add("Te Ensino Passo a Passo");
		siteLinkDescription.add("No Curso mais Completo do Brasil");
		siteLinkDescription.add("Você Satisfeito 100%");
		siteLinkDescription.add("100% Online +5 Módulos e 5 Bônus");
		siteLinkDescription.add("Aulas Bônus +Treinamentos em Videos");
		siteLinkDescription.add("Técnica Testada e Comprovada");
		siteLinkDescription.add("Tenha Cliente Fiéis e Se Destaque");
		siteLinkDescription.add("Material Didático e Grupo de Apoio");
		siteLinkDescription.add("+%Modulos% Módulos e +%Bonus% Bônus Exclusivos");
		siteLinkDescription.add("Adquira Hoje o Método %Metodo%");
		siteLinkDescription.add("Seja Especialista Fidelize Clientes");
		siteLinkDescription.add("Curso d(o) %NomeProdutor%");
		siteLinkDescription.add("100% Online com Grupo de Alunos");
		siteLinkDescription.add("Com Suporte e Comunidade Facebook");
		siteLinkDescription.add("Últimas Vagas com %Desconto%% de Desconto");
		siteLinkDescription.add("Bônus Exclusivos");
		siteLinkDescription.add("Aprenda Tudo Sobre %Nicho%");
		siteLinkDescription.add("Com Desconto Inscrição Somente Hoje");
		siteLinkDescription.add("Oferta Por Tempo Limitado");
		siteLinkDescription.add("Aproveite a Oferta Especial");
		siteLinkDescription.add("Super Oferta Hoje %Parcelas%x R$ %ValorParcelado%");
		siteLinkDescription.add("Compre Hoje Método Completo");
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
