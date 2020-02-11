import java.util.ArrayList;
import java.util.Scanner;

class Dataklynge{
  private ArrayList<Rack> listeAvRacks;
  private int maksNoderPerRack;

  public Dataklynge(int nPerRack){
    listeAvRacks = new ArrayList<Rack>();
    maksNoderPerRack = nPerRack;
  }

  public void settInnNode(Node node){
    for (int i = 0; i < listeAvRacks.size(); i++){
      Rack enRack = listeAvRacks.get(i);
      if(enRack.ledig()){
        enRack.settInn(node);
      }
      else{
        Rack rack = new Rack();
        listeAvRacks.add(rack);
        rack.settInn(node);
      }
    }
  }

  public int totaltAntPros(){
    int prosessorer = 0;
    for (int i = 0; i < listeAvRacks.size(); i++){
      Rack enRack = listeAvRacks.get(i);
      int totPros = enRack.antProsessorer();
      prosessorer += totPros;
    }
  return prosessorer;
  }

  public int totaltNoderNokMinne(int paakrevdMinne){
    int noder = 0;
    for (int i = 0; i < listeAvRacks.size(); i++){
      Rack enRack = listeAvRacks.get(i);
      int totaltNokMinne = enRack.noderMedNokMinne(paakrevdMinne);
      noder += totaltNokMinne;
      }
    return noder;
  }
  public int antRacks(){
    return listeAvRacks.size();
  }
}
