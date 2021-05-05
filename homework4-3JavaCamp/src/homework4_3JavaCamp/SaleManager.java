package homework4_3JavaCamp;

public class SaleManager implements SaleService{

	@Override
	public void sell(Player player) {
		
		System.out.println(player.getFirstName() + " için satýn alma iþlemi baþarýlý.");
		
	}

	@Override
	public void sellWithCampaign(Player player, Campaign campaign) {

		sell(player);
		System.out.println("Merhaba " + player.getFirstName() + player.getLastName() + ", " + campaign.getName()+ " kampanyasýndan " + campaign.getStartingDay() + " ve " + campaign.getExpirationDay() + " günleri arasýnda " + campaign.getDuration(campaign.getStartingDay(), campaign.getExpirationDay()) + " gün boyunca yararlanabileceksiniz.");
		
	}
	
	
	
	
	

}
