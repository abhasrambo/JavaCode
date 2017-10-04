/*
 * Author: Abhas Kumar
 * Date:08/18/2017
 * File Name: plsv.Java
 * Description: This is the two of two sub-class of the factory design implementation
 */
package satelliteLaunchVehicle;

public class plsv extends satelliteLaunchVehicle {
	private String countryOfOrigin;
	private String numberOfStages;
	private String payLoad;
	
	public plsv(String countryOfOrigin, String numberOfStages, String payLoad)
	{
		this.countryOfOrigin = countryOfOrigin;
		this.numberOfStages = numberOfStages;
		this.payLoad = payLoad;
	}
	//setting properties for second subclass
	@Override
	public String getCountryOfOrigin() {
		
		return this.countryOfOrigin;
	}

	@Override
	public String getNumberOfStages() {
	
		return this.numberOfStages;
	}

	@Override
	public String getPayLoad() {
		
		return this.payLoad;
	}

}
