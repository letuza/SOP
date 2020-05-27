  
public class MainStorage {
  public static void main(String[] args) throws InterruptedException {
    Storage storage = new Storage();
    Thread[] threads = new Thread[10];
    for(int i=0; i<10; i++) {
      IncrementaStorage is = new IncrementaStorage(storage, "Thread_"+i);
      threads[i] = new Thread(is);
    }

    for(int i=0; i<10; i++){
      threads[i].start();
    }

    Thread.sleep(1000);

    for(String string: storage.getData()){
      System.out.println(string);
    }
  }
}
