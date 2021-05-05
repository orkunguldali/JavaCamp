package homework4_3JavaCamp;


public class Main {

	public static void main(String[] args) {
		
		
		Player player = new Player("Orkun", "Güldalı", 2001);
		PlayerManager playerManager = new PlayerManager();
		
		Campaign campaign = new Campaign("May Event", 10,25);
		CampaignManager campaignManager = new CampaignManager();
		SaleManager saleManager = new SaleManager();
		
		
		campaignManager.addCampaign(campaign);
		campaignManager.updateCampaign(campaign);
				
		playerManager.register(player);
		playerManager.verifyPlayer(player);
		
		
		saleManager.sell(player);
		saleManager.sellWithCampaign(player, campaign);
		
		playerManager.delete(player);
		campaignManager.deleteCampaign(campaign);


}
	
}
