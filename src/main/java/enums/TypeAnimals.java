package enums;

public enum TypeAnimals {
    dog("Cachorro"),
    cat("Gato");
    private String animal;
    private int value;
    TypeAnimals(String animal) {
        this.animal = animal;
        this.value = ordinal();

    }
    TypeAnimals(int value) {
        this.value = value;
        this.animal = values()[value].toString();

    }

    public static String fromOrdinal(int index) {
        for (TypeAnimals type : TypeAnimals.values()) {
            if (type.ordinal() == index) {
                String raca = type.name();
                return raca ;
            }
        }
        throw new IllegalArgumentException("Índice não encontrado: " + index);
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }


    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public static void main(String[] args) {
        TypeAnimals animal = TypeAnimals.values()[0];
        System.out.println(animal);
    }
}
