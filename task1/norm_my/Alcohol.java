package task1.norm_my;

public abstract class Alcohol {
    Drinking drinking;
    OrganismInfluence organismInfluence;

    Alcohol(){}

    void hurtBrain() {
        System.out.println("Поздравляю, вы стали тупее!");
    }

    abstract void getComposition();

    void drinkingPerform(){
        drinking.drink();
    }

    void setDrinking(Drinking drinking) {
        this.drinking = drinking;
    }

    void organismInfluencePerform() {
        organismInfluence.influence();
    }

    void setOrganismInfluence(OrganismInfluence organismInfluence) {
        this.organismInfluence = organismInfluence;
    }
}
