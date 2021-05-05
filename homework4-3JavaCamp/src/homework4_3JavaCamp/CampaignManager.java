package homework4_3JavaCamp;

public class CampaignManager implements CampaignService{

	@Override
	public void addCampaign(Campaign campaign) {
		
		System.out.println(campaign.getName() + "kampanyası başarıyla eklendi.");		
	}

	@Override
	public void deleteCampaign(Campaign campaign) {
		
		System.out.println(campaign.getName() + "kampanyası silindi.");

	}

	@Override
	public void updateCampaign(Campaign campaign) {
		
		System.out.println(campaign.getName() + "kampanyası başarıyla güncellendi.");

	}
	
	
	
}
