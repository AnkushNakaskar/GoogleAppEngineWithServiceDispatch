package com.vuclip.content.entity;

import java.io.Serializable;

public class ClipEntity implements Serializable {

	private static final long serialVersionUID = 2L;

	private Long id;

	private String productType;

	private String shortTitle;
	
	public static final String ID = "id";
	public static final String Name = "name";
	public static final String ProductType = "productType";
	public static final String ShortTitle = "shortTitle";


	public ClipEntity() {

	}

	public ClipEntity(Builder builder) {
		this.id = builder.id;
		this.productType = builder.productType;
		this.shortTitle = builder.shortTitle;
	}

	public Long getId() {
		return id;
	}

	public static class Builder {

		private Long id;

		private String productType;

		private String shortTitle;

		public Builder id(Long id) {
			this.id = id;
			return this;
		}

		public Builder productType(String productType) {
			this.productType = productType;
			return this;
		}

		public Builder shortTitle(String shortTitle) {
			this.shortTitle = shortTitle;
			return this;
		}

		public ClipEntity build() {
			return new ClipEntity(this);
		}

	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductType() {
		return productType;
	}

	public void setProductType(String productType) {
		this.productType = productType;
	}

	public String getShortTitle() {
		return shortTitle;
	}

	public void setShortTitle(String shortTitle) {
		this.shortTitle = shortTitle;
	}

}
