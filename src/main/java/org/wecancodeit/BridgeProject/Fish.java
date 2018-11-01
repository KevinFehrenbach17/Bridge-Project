package org.wecancodeit.BridgeProject;

import javax.persistence.Embeddable;

@Embeddable
public class Fish {

	private String fishName;
	private String binomialNomencluture;
	private String imgUrl;

	public Fish() {
	}

	public Fish(String fishName, String binomialNomencluture, String imgUrl) {
		this.fishName = fishName;
		this.binomialNomencluture = binomialNomencluture;
		this.imgUrl = imgUrl;
	}

	public String getFishName() {
		return fishName;
	}

	public String getBinomialNomencluture() {
		return binomialNomencluture;
	}

	public String getImgUrl() {
		return imgUrl;
	}

}
