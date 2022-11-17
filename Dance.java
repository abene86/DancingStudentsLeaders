import java.util.*;
public class Dance {
    public static void main(String[] args) {
        int numberLeaders, numberFollowers;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Leaders: ");
        numberLeaders = input.nextInt();
        System.out.print("Enter the number of Followers: ");
        numberFollowers = input.nextInt();
        Follower [] listFollowers  = createListFollowers(numberFollowers);
        Leader[] listLeaders = createListLeaders(numberLeaders, listFollowers);
        input.close();

    }
    public static Follower[] createListFollowers(int numberFollowersNeeded){
        Follower[] listFollowers = new Follower[numberFollowersNeeded];
        int index=0;
        while(index < numberFollowersNeeded){
            listFollowers[index] = new Follower(index);
            listFollowers[index].start();
            index++;
        }
        return listFollowers;
    }
    public static Leader[] createListLeaders(int numberLeaders, Follower[] listFollowers){
        Leader[] listLeaders = new Leader[numberLeaders];
        int index=0;
        while(index < numberLeaders){
            listLeaders[index] = new Leader(index, listFollowers);
            listLeaders[index].start();
            index++;
        }
        return listLeaders;
    }
}
