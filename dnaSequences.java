//DNA sequence
public class DNA {
 
  public static void main(String[] args) {
 
    //  -. .-.   .-. .-.   .
    //    \   \ /   \   \ / 
    //   / \   \   / \   \  
    //  ~   `-~ `-`   `-~ `-

    String dna1 = "ATGCGATACGCTTGA";
    String dna2 = "ATGCGATACGTGA";
    String dna3 = "ATTAATATGTACTGA";
    String dna = dna3;
    System.out.println("lenth of DNA is " + dna.length());

    int start = dna.indexOf("ATG");
    System.out.println("Start of sequence: " + start);

    int stop = dna.indexOf("TGA");
    System.out.println("End of sequence: " + stop);

    if((start!=-1 && stop!=-1) && (dna.length()%3 == 0)) {
      System.out.println("Condition 1 and 2 are satisfied.");
      String protein = dna.substring(start+3, stop);
      System.out.println("Protein: " + protein);
    } else {
      System.out.println("No protein");
    }
  }
 
}
