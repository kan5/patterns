package task1.norm_my;

public class Wine extends Alcohol {

    Wine(){
        this.drinking = new Brudershaft();
        this.organismInfluence = new Sleeping();
    }
    @Override
    void getComposition() {
        System.out.println("Виноград, вкус бочки, 1% искуственного сахара.");
    }
}
