package com.campainc.model.db.sitelink;

import java.util.ArrayList;
import java.util.List;

public class SiteLinkGarantia implements SiteLinkInterface {
	
	static List<String> siteLinkGarantiaTitle  = new ArrayList<>();
	static List<String> siteLinkGarantiaDescription  = new ArrayList<>();
	
	static {
		siteLinkGarantiaTitle.add("Com Garantia e Risco Zero");
		siteLinkGarantiaTitle.add("Compre com Garantia");
		siteLinkGarantiaDescription.add("Curso Com Garantia");
		siteLinkGarantiaDescription.add("Risco Zero");
	}
	
	static {
		siteLinkGarantiaDescription.add("7 Dias de Garantia para Testar");
		siteLinkGarantiaDescription.add("Ou Seu dinheiro 100% de Volta");
		siteLinkGarantiaDescription.add("7 Dias de Garantia Incondicional");
		siteLinkGarantiaDescription.add("Compra Segura 100% de Satisfação");
		siteLinkGarantiaDescription.add("Compre Agora e Tenha 7 Dias");
		siteLinkGarantiaDescription.add("Para Decidir Se o Curso é Para Você");
		siteLinkGarantiaDescription.add("7 Dias de Garantia para testar");
		siteLinkGarantiaDescription.add("Ou seu dinheiro 100% de volta");
	}

	@Override
	public List<String> getSiteLinkTitles() {
		return siteLinkGarantiaTitle;
	}

	@Override
	public List<String> getSiteLinkDescriptions() {
		return siteLinkGarantiaDescription;
	}
	
	
}
