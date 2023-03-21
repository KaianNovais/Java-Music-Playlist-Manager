import java.util.ArrayList;

class Playlist {
  
  public static void main(String[] args) {
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    //adicionar mais de cinco músicas
    desertIslandPlaylist.add("Te agradeço");
    desertIslandPlaylist.add("Deus tem o melhor pra mim");
    desertIslandPlaylist.add("Uma nova história");
    desertIslandPlaylist.add("Jó");
    desertIslandPlaylist.add("Nunca foi sorte");
    desertIslandPlaylist.add("Te adorar");

    //mostrar a lista
    System.out.println(desertIslandPlaylist);

    //mostrar o tamanho
    System.out.println(desertIslandPlaylist.size());

    //remove uma música, no caso a primeira
    desertIslandPlaylist.remove(0);

    //mostra a nova lista com o item removido
    System.out.println(desertIslandPlaylist);

    //mostra novamente o tamanho
    System.out.println(desertIslandPlaylist.size());

    //coletar os indices das músicas que desejo trocar
    int indexA = 0;
    int indexB = 3;

    //armazeno a música da posicao 0 em uma String
    String temp = desertIslandPlaylist.get(indexA);

    //processo para mudar a música da posicao 4 para ser a 1
    //o indice 0 é alterado e passa recer o valor da música do indexB
    desertIslandPlaylist.set(0, desertIslandPlaylist.get(indexB));
    //o indexB recebe a música que está em temp
    desertIslandPlaylist.set(indexB, temp);
    //mostro a música
    System.out.println(desertIslandPlaylist);
  }
  
}