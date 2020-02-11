class Main{
  public static void main (String[] args){

    // Oppretter en ny dataklynge ved navn Abel. Dataklyngen har plass til 12 noder i racket
    Dataklynge abel = new Dataklynge(12);

    // Bruker metoden settInnNode for å sette inn 650 noder med 64GB minne og en prosessor
    for (int i = 0; i <= 650; i++){
      abel.settInnNode(new Node(64,1));
    }

    // Bruker metoden settInnNode for å sette inn 16 noder med 1024GB minne og to prosessorer
    for (int i = 0; i <=16; i++){
      abel.settInnNode(new Node(1024,2));
    }

    // Printer ut noder med ulikt type minne, totalt antall prosessorer og racks
    System.out.println("Noder med minst 32 GB: " + abel.totaltNoderNokMinne(32));
    System.out.println("Noder med minst 64 GB: " + abel.totaltNoderNokMinne(64));
    System.out.println("Noder med minst 128 GB: " + abel.totaltNoderNokMinne(128));
    System.out.println("Antall prosessorer: " + abel.totaltAntPros());
    System.out.println("Antall racks: " + abel.antRacks());
  }
}
