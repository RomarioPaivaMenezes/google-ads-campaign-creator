package com.campainc.model.db.sitelink;

import java.util.ArrayList;
import java.util.List;

public class SiteLinkCertificado implements SiteLinkInterface{
	
	static List<String> siteLinkCertificadoTitle  = new ArrayList<>();
	static List<String> siteLinkCertificadoDescription  = new ArrayList<>();
	
	static {
		siteLinkCertificadoTitle.add("Curso Com Certificado");
	}
	
	static {

		siteLinkCertificadoDescription.add("Seja Reconhecid(o)");
		siteLinkCertificadoDescription.add("Certificado no Final do Curso");
		siteLinkCertificadoDescription.add("Adquira Hoje +Certificado");
	}

	@Override
	public List<String> getSiteLinkTitles() {
		return siteLinkCertificadoTitle;
	}

	@Override
	public List<String> getSiteLinkDescriptions() {
		return siteLinkCertificadoDescription;
	}

}
