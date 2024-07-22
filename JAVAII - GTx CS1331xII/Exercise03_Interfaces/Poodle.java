package Exercise03_Interfaces;

public class Poodle extends Dog {
    private String favoriteShampoo;
    private String favoriteConditioner;

    public Poodle(String name, double size, String favoriteShampoo, String favoriteConditioner) {
        super(name, size);
        this.favoriteShampoo = favoriteShampoo;
        this.favoriteConditioner = favoriteConditioner;
    }

    public void Groom() {
        System.out.println(favoriteShampoo + " rinse " + favoriteConditioner + " wait 10 mins " + " dry and massage");
    }
}
