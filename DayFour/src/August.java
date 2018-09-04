import java.io.*;
public class August{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Seasons season = Seasons.MONSOON;
		System.out.println(season.toString());
		System.out.println("Enter a season in CAPS");
		String userSeason = br.readLine().toUpperCase();
		if(userSeason.equals(season.toString()))
			System.out.println("Ye Re Ye Re Pausa!");
		else
			System.out.println("Rain Rain go away!");
	}
}
