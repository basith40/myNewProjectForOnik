package EnumPackage;

public class EnumLearning {
	public enum list{LILA,}
	public static final int BASITH = 34;
	public static final int SHAMMI = 20;
	public static final int NAHIRA = 17;
	public static final int MAHIMA = 15;

	public static void main(String[] args) {
		int myfamaly = 17;
		if(myfamaly == SHAMMI) {
			System.out.println("thats good");
		}
		else {
			System.out.println("iam not happy");
		}
	}

}
