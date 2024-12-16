import java.util.ArrayList;
import java.util.Arrays;

public class PlaylistManager {
public static void main(String[] args){

String[] favs = {"ABBA - Dancing Queen","Queen - Bohemian Rhapsody","Phil Collins - Another Day in Paradise","AC/DC - Highway to Hell","Guns N' Roses - Sweet Child O' Mine","Sting - Fields of Gold","ABBA - Mamma Mia","ABBA - Waterloo","ABBA - Gimme! Gimme! Gimme! (A Man After Midnight)","Phil Collins - In the Air Tonight","Phil Collins - Against All Odds"};

System.out.println("Top 3 Most liked songs: ");
System.out.println(favs[0]);
System.out.println(favs[1]);
System.out.println(favs[2]);
System.out.println("---------------------------------------------------------------");

ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
desertIslandPlaylist.add("Sex and Apocalypse - The Final Temptation");

desertIslandPlaylist.add("Frank Sinatra - My Way");

desertIslandPlaylist.add("The Animals - House of the Rising Sun");

desertIslandPlaylist.add("Fleetwood Mac - Dreams");

desertIslandPlaylist.add("Led Zeppelin - Stairway to Heaven");

System.out.println("Top 5 songs before shuffle - "+desertIslandPlaylist);

int SongA = desertIslandPlaylist.indexOf("Frank Sinatra - My Way");

int SongB = desertIslandPlaylist.indexOf("Sex and Apocalypse - The Final Temptation");

String tempA = "Frank Sinatra - My Way";
desertIslandPlaylist.set(SongA,"Sex and Apocalypse - The Final Temptation");
desertIslandPlaylist.set(SongB,tempA);
System.out.println("Top 5 songs after shuffle - "+desertIslandPlaylist);
System.out.println("----------------------------------------------------------------------");



desertIslandPlaylist.addAll(Arrays.asList(favs));
int size = desertIslandPlaylist.size();

desertIslandPlaylist.remove("Led Zeppelin - Stairway to Heaven");
desertIslandPlaylist.remove("Sex and Apocalypse - The Final Temptation");
desertIslandPlaylist.remove("Queen - Bohemian Rhapsody");
desertIslandPlaylist.remove("AC/DC - Highway to Hell");
desertIslandPlaylist.remove("Phil Collins - Against All Odds");
desertIslandPlaylist.remove("Sting - Fields of Gold");
int Asize = desertIslandPlaylist.size();


System.out.println("Playlist after adding all the  fav songs - " + desertIslandPlaylist);
System.out.println("---------------------------");
System.out.println("The playlist size is " + size);
System.out.println("---------------------------");
System.out.println("The playlist size after removing unwanted songs is " + Asize);

  }
}

