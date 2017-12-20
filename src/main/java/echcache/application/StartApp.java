package echcache.application;

public class StartApp {

	public static void main(String[] args) throws InterruptedException {
		
		for(int i = 0; i< 50 ; i++){
			System.out.println("---------    "+i+"   --------------");
			//Thread.sleep(1000);
		HibernateUtils.loadStateAndDistrict();
		//HibernateUtils.loadStateAndDistrict();
		//HibernateUtils.loadStateAndDistrict();
		}
		
	}
	
}
