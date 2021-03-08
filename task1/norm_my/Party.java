package task1.norm_my;

public class Party {
    public static void main(String[] args) {
        Alcohol mYWine = new Wine();
        mYWine.drinkingPerform();
        mYWine.getComposition();
        mYWine.organismInfluencePerform();

        Alcohol girlWine = new Wine();
        girlWine.setDrinking(new HalfGlass());
        girlWine.drinkingPerform();
        girlWine.getComposition();
        girlWine.organismInfluencePerform();
    }
}
