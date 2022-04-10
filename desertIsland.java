import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Pon de Replay");
    desertIslandPlaylist.add("Go Down Deh");
    desertIslandPlaylist.add("I'm Still in Love'");
    desertIslandPlaylist.add("Baby Boy");
    desertIslandPlaylist.add("Temperature");
    desertIslandPlaylist.add("Essence");

    // System.out.println(desertIslandPlaylist);

    desertIslandPlaylist.remove(5);

    // System.out.println(desertIslandPlaylist.size());

    String songa = desertIslandPlaylist.get(0);
    String songb = desertIslandPlaylist.get(2);
    // System.out.println(index0);
    desertIslandPlaylist.set(0, songb);
    desertIslandPlaylist.set(2, songa);
    // System.out.println(desertIslandPlaylist);
    // System.out.println(desertIslandPlaylist.indexOf("I'm Still in Love'"));
    // System.out.println(desertIslandPlaylist.indexOf("Pon de Replay"));

    String tempA = "Pon de Replay";
    System.out.println(tempA);
    desertIslandPlaylist.set(0, tempA);
    System.out.println(desertIslandPlaylist);
    desertIslandPlaylist.set(songb, tempA);
    System.out.println(desertIslandPlaylist);



    
  }
  
}
