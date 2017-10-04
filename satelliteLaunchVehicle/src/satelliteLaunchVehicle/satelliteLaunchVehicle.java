/*
 * Author: Abhas Kumar
 * Date:08/18/2017
 * File Name: satelliteLaunchVehicle.Java
 * Description: Declares abstract method. This is the superclass of the factory design implementation
 */
package satelliteLaunchVehicle;

public abstract class satelliteLaunchVehicle {
	//declaration of all the abstract method
		public abstract String getCountryOfOrigin();
		public abstract String getNumberOfStages();
		public abstract String getPayLoad();
		
		@Override
		public String toString(){
			return "Origin of country:" + this.getCountryOfOrigin() + "\n" + "Number of Stages:" + this.getNumberOfStages() + "\n" + "Payload capacity:" + this.getPayLoad();
		}
}
