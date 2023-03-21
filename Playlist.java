import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();
    desertIslandPlaylist.add("Te agradeço");
    desertIslandPlaylist.add("Deus tem o melhor pra mim");
    desertIslandPlaylist.add("Uma nova história");
    desertIslandPlaylist.add("Jó");
    desertIslandPlaylist.add("Nunca foi sorte");
    desertIslandPlaylist.add("Te adorar");
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove(0);
    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    int indexA = 0;
    int indexB = 3;
    String temp = desertIslandPlaylist.get(indexA);
    desertIslandPlaylist.set(0, desertIslandPlaylist.get(indexB));
    desertIslandPlaylist.set(indexB, temp);
    System.out.println(desertIslandPlaylist);
  }
  
}