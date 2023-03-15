package JuneHomeWorkPart2;

import java.text.SimpleDateFormat;

public class LNowDateTime {

	public static void main(String[] args) {
		SimpleDateFormat cdt = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss.sss");
		System.out.format("Now : "+cdt.format(System.currentTimeMillis()));

	}

}
