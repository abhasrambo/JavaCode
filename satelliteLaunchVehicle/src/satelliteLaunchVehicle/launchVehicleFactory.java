/*
 * Author: Abhas Kumar
 * Date:08/18/2017
 * File Name: launchVehicleFactory.Java
 * Description: This is the factory class.
 */
package satelliteLaunchVehicle;

public class launchVehicleFactory {
	public static satelliteLaunchVehicle getLaunchVechileType(String typeOfLaunchVehicle, String countryOfOrigin, String numberOfStages, String payLoad ){
		if("saturn".equalsIgnoreCase(typeOfLaunchVehicle))
		{
			return new saturn(countryOfOrigin, numberOfStages, payLoad);
		}
		else if("plsv".equalsIgnoreCase(typeOfLaunchVehicle) )
		{
			return new plsv(countryOfOrigin, numberOfStages, payLoad);
		}
			return null;
	}
}
