// Oppretter en public class Node
public class Node{
  // Oppretter og deklarerer private variabler til bruk inne i klassen
  private int minne;
  private int antallProssessorer;

  // Oppretter konstruktør og linker variablene til signaturen
  public Node(int m, int antPros){
    minne = m;
    antallProssessorer = antPros;
  }

  // returnerer antall prosesser i noden
  public int getAntPros(){
    return antallProssessorer;
  }

  // sjekker om noden har nok minne og returnerer en boolean
  public boolean nokMinne(int paakrevdMinne){
    if (minne >= paakrevdMinne){
      return true;
    }
    else{
      return false;
    }
  }
}
