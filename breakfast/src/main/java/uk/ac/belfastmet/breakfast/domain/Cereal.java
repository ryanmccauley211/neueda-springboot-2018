package uk.ac.belfastmet.breakfast.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cereal {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cerealId;
	private String manufacturer;
	private String cerealName;
	private Integer energy;
	private Integer calories;
	private Double protein;
	private Double carbohydrates;
	private Double sugars;
	private Double fat;
	private Double saturates;
	private Double fibre;
	private Double sodium;
	private Double salt;
	private Double iron;
	
	public Cereal() {super();}
	
	public Cereal(Integer cerealId, String manufacturer, String cerealName, Integer energy, Integer calories,
			Double protein, Double carbohydrates, Double sugars, Double fat, Double saturates, Double fibre,
			Double sodium, Double salt, Double iron) {
		super();
		this.cerealId = cerealId;
		this.manufacturer = manufacturer;
		this.cerealName = cerealName;
		this.energy = energy;
		this.calories = calories;
		this.protein = protein;
		this.carbohydrates = carbohydrates;
		this.sugars = sugars;
		this.fat = fat;
		this.saturates = saturates;
		this.fibre = fibre;
		this.sodium = sodium;
		this.salt = salt;
		this.iron = iron;
	}

	public Integer getCerealId() {
		return cerealId;
	}

	public void setCerealId(Integer cerealId) {
		this.cerealId = cerealId;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCerealName() {
		return cerealName;
	}

	public void setCerealName(String cerealName) {
		this.cerealName = cerealName;
	}

	public Integer getEnergy() {
		return energy;
	}

	public void setEnergy(Integer energy) {
		this.energy = energy;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Double getProtein() {
		return protein;
	}

	public void setProtein(Double protein) {
		this.protein = protein;
	}

	public Double getCarbohydrates() {
		return carbohydrates;
	}

	public void setCarbohydrates(Double carbohydrates) {
		this.carbohydrates = carbohydrates;
	}

	public Double getSugars() {
		return sugars;
	}

	public void setSugars(Double sugars) {
		this.sugars = sugars;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getSaturates() {
		return saturates;
	}

	public void setSaturates(Double saturates) {
		this.saturates = saturates;
	}

	public Double getFibre() {
		return fibre;
	}

	public void setFibre(Double fibre) {
		this.fibre = fibre;
	}

	public Double getSodium() {
		return sodium;
	}

	public void setSodium(Double sodium) {
		this.sodium = sodium;
	}

	public Double getSalt() {
		return salt;
	}

	public void setSalt(Double salt) {
		this.salt = salt;
	}

	public Double getIron() {
		return iron;
	}

	public void setIron(Double iron) {
		this.iron = iron;
	}
}
