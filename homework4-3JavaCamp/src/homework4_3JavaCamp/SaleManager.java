package homework4_3JavaCamp;

public class SaleManager implements SaleService{

	@Override
	public void sell(Player player) {
		
		System.out.println(player.getFirstName() + " i�in sat�n alma i�lemi ba�ar�l�.");
		
	}

	@Override
	public void sellWithCampaign(Player player, Campaign campaign) {

		sell(player);
		System.out.println("Merhaba " + player.getFirstName() + player.getLastName() + ", " + campaign.getName()+ " kampanyas�ndan " + campaign.getStartingDay() + " ve " + campaign.getExpirationDay() + " g�nleri aras�nda " + campaign.getDuration(campaign.getStartingDay(), campaign.getExpirationDay()) + " g�n boyunca yararlanabileceksiniz.");
		
	}
	
	
	
	
	

}
