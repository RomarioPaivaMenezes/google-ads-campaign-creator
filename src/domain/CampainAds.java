package domain;

import java.util.List;
import java.util.Set;

public class CampainAds {

	private String name;
	private String nomeProduto;
	private String nomeProdutor;
	private String displayPath;
	private String finalURL;
	private String trackingtemplate;
	private String nomeMetodo;
	private double valorProduto;
	private String valorDesconto;
	private String quantidadeBonus;
	private String quantidadeModulos;
	private int quantidadeParcelas;
	private String nicho;
	private Set<String> keyWordsAd;
	private List<GroupAds> groups;
	
	public CampainAds(String name, String nomeProduto, String nomeProdutor, String displayPath, String finalURL,
			String trackingtemplate, String nomeMetodo, double valorProduto, String valorDesconto,
			String quantidadeBonus, String quantidadeModulos, int quantidadeParcelas, String nicho,
			Set<String> keyWordsAd, List<GroupAds> groups) {
		super();
		this.name = name;
		this.nomeProduto = nomeProduto;
		this.nomeProdutor = nomeProdutor;
		this.displayPath = displayPath;
		this.finalURL = finalURL;
		this.trackingtemplate = trackingtemplate;
		this.nomeMetodo = nomeMetodo;
		this.valorProduto = valorProduto;
		this.valorDesconto = valorDesconto;
		this.quantidadeBonus = quantidadeBonus;
		this.quantidadeModulos = quantidadeModulos;
		this.quantidadeParcelas = quantidadeParcelas;
		this.nicho = nicho;
		this.keyWordsAd = keyWordsAd;
		this.groups = groups;
	}

	/**
	 * @return the nomeMetodo
	 */
	public String getNomeMetodo() {
		return nomeMetodo;
	}



	/**
	 * @param nomeMetodo the nomeMetodo to set
	 */
	public void setNomeMetodo(String nomeMetodo) {
		this.nomeMetodo = nomeMetodo;
	}



	/**
	 * @return the valorProduto
	 */
	public double getValorProduto() {
		return valorProduto;
	}



	/**
	 * @param valorProduto the valorProduto to set
	 */
	public void setValorProduto(double valorProduto) {
		this.valorProduto = valorProduto;
	}



	/**
	 * @return the valorDesconto
	 */
	public String getValorDesconto() {
		return valorDesconto;
	}



	/**
	 * @param valorDesconto the valorDesconto to set
	 */
	public void setValorDesconto(String valorDesconto) {
		this.valorDesconto = valorDesconto;
	}



	/**
	 * @return the quantidadeBonus
	 */
	public String getQuantidadeBonus() {
		return quantidadeBonus;
	}



	/**
	 * @param quantidadeBonus the quantidadeBonus to set
	 */
	public void setQuantidadeBonus(String quantidadeBonus) {
		this.quantidadeBonus = quantidadeBonus;
	}



	/**
	 * @return the quantidadeModulos
	 */
	public String getQuantidadeModulos() {
		return quantidadeModulos;
	}



	/**
	 * @param quantidadeModulos the quantidadeModulos to set
	 */
	public void setQuantidadeModulos(String quantidadeModulos) {
		this.quantidadeModulos = quantidadeModulos;
	}



	/**
	 * @return the quantidadeParcelas
	 */
	public int getQuantidadeParcelas() {
		return quantidadeParcelas;
	}



	/**
	 * @param quantidadeParcelas the quantidadeParcelas to set
	 */
	public void setQuantidadeParcelas(int quantidadeParcelas) {
		this.quantidadeParcelas = quantidadeParcelas;
	}



	/**
	 * @return the nicho
	 */
	public String getNicho() {
		return nicho;
	}



	/**
	 * @param nicho the nicho to set
	 */
	public void setNicho(String nicho) {
		this.nicho = nicho;
	}



	/**
	 * @return the nomeProduto
	 */
	public String getNomeProduto() {
		return nomeProduto;
	}



	/**
	 * @param nomeProduto the nomeProduto to set
	 */
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}



	/**
	 * @return the nomeProdutor
	 */
	public String getNomeProdutor() {
		return nomeProdutor;
	}



	/**
	 * @param nomeProdutor the nomeProdutor to set
	 */
	public void setNomeProdutor(String nomeProdutor) {
		this.nomeProdutor = nomeProdutor;
	}



	/**
	 * @return the keyWordsAd
	 */
	public Set<String> getKeyWordsAd() {
		return keyWordsAd;
	}



	/**
	 * @param keyWordsAd the keyWordsAd to set
	 */
	public void setKeyWordsAd(Set<String> keyWordsAd) {
		this.keyWordsAd = keyWordsAd;
	}



	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the displayPath
	 */
	public String getDisplayPath() {
		return displayPath;
	}

	/**
	 * @param displayPath the displayPath to set
	 */
	public void setDisplayPath(String displayPath) {
		this.displayPath = displayPath;
	}

	/**
	 * @return the finalURL
	 */
	public String getFinalURL() {
		return finalURL;
	}

	/**
	 * @param finalURL the finalURL to set
	 */
	public void setFinalURL(String finalURL) {
		this.finalURL = finalURL;
	}

	/**
	 * @return the trackingtemplate
	 */
	public String getTrackingtemplate() {
		return trackingtemplate;
	}

	/**
	 * @param trackingtemplate the trackingtemplate to set
	 */
	public void setTrackingtemplate(String trackingtemplate) {
		this.trackingtemplate = trackingtemplate;
	}

	/**
	 * @return the groups
	 */
	public List<GroupAds> getGroups() {
		return groups;
	}

	/**
	 * @param groups the groups to set
	 */
	public void setGroups(List<GroupAds> groups) {
		this.groups = groups;
	}
	
	
	
	
}
