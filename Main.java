  
class Main {
  public static void main(String[] args) {
    Thread[] contadores = new Thread[10];
    for(int i=0; i<10; i++) {
      ContadorParalelo contador = new ContadorParalelo("Thread_"+i, 10);
      contadores[i] = new Thread(contador);
    }

    for(int i=0; i<10; i++){
      contadores[i].start();
      System.out.println("Fim da execução da Thread_"+i);
    }
  }
}
