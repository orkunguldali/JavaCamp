package homework4_3JavaCamp;


public class PlayerManager {
	
	public void register(Player player) {
		System.out.println("Merhaba, " + player.getFirstName() + player.getLastName() +" sisteme kaydoldunuz, lütfen doğrulamanızı yapınız.");	}
	
	public void delete(Player player) {
		System.out.println( player.getFirstName() + player.getLastName() +" ismindeki oyuncu kayıttan silindi.");
	}
	
	public boolean verifyPlayer(Player player) {
		
		if (player.getFirstName().length() >= 2 && player.getLastName().length()>=2 && player.getBirthYear() > 2002) {
			
			return true;
		
		}else {return false;}
		
	
		
	}
	
	
}
