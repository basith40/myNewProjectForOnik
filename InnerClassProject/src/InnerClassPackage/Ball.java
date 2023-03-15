package InnerClassPackage;

public class Ball {
	private String ballName;
	private String ballColor;
	private int capacity;
	private int ballSize;
	
	
	public void setUpBall() {
		new CricketBall().setUpBall();
		
	}
	
	
	class CricketBall{
		public void setUpBall() {
			ballName="cricket ball";
			ballColor="White";
			ballSize=2;
			
			System.out.println(ballName+ "\n " +ballColor+ "\n " +ballSize);
		}
	}

}
