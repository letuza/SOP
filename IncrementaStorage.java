  public class IncrementaStorage implements Runnable {
  private Storage storage;
  private String nome;

  public IncrementaStorage(Storage storage, String nome) {
    this.storage = storage;
    this.nome = nome;
  }

  public void run() {
    for(int i=1; i<=10; i++){
      storage.addData(nome + " adicionando pela "+ i+ " vez");
    }
  }
}
