abstract class Plant implements PlantCare{//interface används här så att växterna får metoden för vattning, gör den även abstract för att bara plantor av specifika typer ska skapas inte generiska

    private double height;//Här används privat för variablerna så att de inte kan ändras eller ses utanför klassen
    private String name;
    public Plant(double height, String name) {
        this.height = height;
        this.name = name;
    }
    abstract double waterRequired();
    public String getName() {//Här används public så att metoden kan anropas utanför KLassen
        return name;
    }

    public double getHeight() {
        return height;
    }
}
