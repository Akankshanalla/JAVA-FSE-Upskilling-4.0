interface Playable {
    void play();
}
class Guitar implements Playable {
    public void play(){
        System.out.println("Playing guitar");
    }
}
class Piano implements Playable {
    public void play(){
        System.out.println("Playing piano");
    }
}
public class MusicTest {
    public static void main(String[] a){
        Playable g=new Guitar();
        Playable p=new Piano();
        g.play();
        p.play();
    }
}