package enums;

public enum TypeAnimals {
    dog("Cachorro"),
    cat("Gato");
    private String animal;
    TypeAnimals(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }
}
