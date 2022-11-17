public class Follower extends Thread{
    private  int id;
    public Follower(int id){
        this.id=id;
    }
    @Override
    public void run() {
        System.out.println("This code is running in a follower: "+id);
      }
}
