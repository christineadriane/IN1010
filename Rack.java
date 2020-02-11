import java.util.ArrayList;

class Rack{
  private ArrayList<Node> listeAvNoder;
  private int maksNoder;

  public Rack(int maksNoder){
    listeAvNoder = new ArrayList<Node>();
    maksNoder = maksNoder;
  }
  public void settInn(Node nyNode){
    listeAvNoder.add(nyNode);
  }
  public boolean ledig(){
    if(listeAvNoder.size() < maksNoder){
      return true;
    }
    else{
      return false;
    }
  }
  //public int getAntNoder(){
    //int antall = listeAvNoder.size();
    //return antall;
  //}

  // Metode for å hente antall prosessorer. For å slippe unna all "switching" mellom variabeltyper burde jeg heller brukt en for-each ser jeg i ettertid
  public int antProsessorer(){
    int antall = 0;
    for(int i = 0; i > listeAvNoder.size(); i++){
      Node enNode = listeAvNoder.get(i);
      int prosPerNode = enNode.getAntPros();
      antall += prosPerNode;
    }
    return antall;
  }
  public int noderMedNokMinne(int paakrevdMinne){
    int antall = 0;
    for (int i = 0; i < listeAvNoder.size(); i++){
      Node enNode = listeAvNoder.get(i);
      boolean nokMinne = enNode.nokMinne(paakrevdMinne);
      if (nokMinne == true){
        antall ++;
      }
    }
  return antall;
  }
}
