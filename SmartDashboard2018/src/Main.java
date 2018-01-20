import java.util.Random;

public class Main {

	public static void main(String[] args) throws Exception{

		SmartDashboard2018 dashboard = new SmartDashboard2018();
		Random rand = new Random();
		
		while(true) {
			dashboard.update(rand.nextInt());
		}
		
	}

}
