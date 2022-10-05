abstract class Plant implements PlantCare{//interface används här så att växterna får metoden för vattning,

    private double height;
    private String name;
    public Plant(double height, String name) {
        this.height = height;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }
}
