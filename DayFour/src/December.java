import java.io.BufferedReader ;
import java.io.IOException;
import java.io.InputStreamReader;

public class December {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Seasons season = Seasons.MONSOON;
		System.out.println(season.toString());
		System.out.println("Enter a season in CAPS");
		Seasons s = Seasons.valueOf(br.readLine().toUpperCase());
		if(season == s)
			System.out.println("Ye Re Ye Re Pausa!");
		else
			System.out.println("Rain Rain go away!");
	}
}
