/*
 * Author: Abhas Kumar
 * Date:08/18/2017
 * File Name: factoryMainClass.Java
 * Description: This is the implementation of client program.
 */
package satelliteLaunchVehicle;
// satelliteLaunchVehicle is the super class
//saturn and plsv are the two sub classses
//launchVehicleFactory is the factory class which are interacting with the sub classes
public class factoryMainClass {
	public static void main(String[] args)
	{
		satelliteLaunchVehicle objectPlsv = launchVehicleFactory.getLaunchVechileType("plsv", "India", "3", "3000 lb");
		satelliteLaunchVehicle objectSaturn = launchVehicleFactory.getLaunchVechileType("saturn", "USA", "5", "26000 lb");
		
		
		System.out.println("Details of PLSV   launch vehicle:"+"\t"+objectPlsv);
		System.out.println("Details of Saturn launch vehicle:"+"\t"+objectSaturn);
	}
}
