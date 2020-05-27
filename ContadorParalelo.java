public class ContadorParalelo implements Runnable {

  private String nome;
  private int max;

  public ContadorParalelo(String nome, int max) {
    this.nome = nome;
    this.max = max;
  }

  public void run() {
    for(int i=0; i<max; i++){
      System.out.println(nome+" contando "+i);
    }
  }

}
