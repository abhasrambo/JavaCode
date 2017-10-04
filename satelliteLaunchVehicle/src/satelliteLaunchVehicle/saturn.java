/*
 * Author: Abhas Kumar
 * Date:08/18/2017
 * File Name: saturn.Java
 * Description: This is the one of two sub-class of the factory design implementation
 */
package satelliteLaunchVehicle;

public class saturn extends satelliteLaunchVehicle {

		private String countryOfOrigin;
		private String numberOfStages;
		private String payLoad;
		
		public saturn(String countryOfOrigin, String numberOfStages, String payLoad)
		{
			this.countryOfOrigin = countryOfOrigin;
			this.numberOfStages = numberOfStages;
			this.payLoad = payLoad;
		}
//setting properties for first subclass
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
