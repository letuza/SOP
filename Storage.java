public class Storage {
  private String[] data = new String[100];
  private int count = 0;

  public synchronized void addData(String info){
    data[count] = info;
    count++;
  }

  public String[] getData(){
    return data;
  }
}
