public class Leader extends Thread{
    private int id;
    private static Follower [] dancers;
    public Leader(int id, Follower [] dancers){
        this.id=id;
        this.dancers= dancers;
    }
    @Override
    public void run() {
        System.out.println("This code is running in a Leader: "+ id);
      }
}