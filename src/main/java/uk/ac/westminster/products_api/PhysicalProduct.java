package uk.ac.westminster.products_api;

public class PhysicalProduct extends Product{
    private double weightKg;
    private String dimension;

    public PhysicalProduct(){
    }
    public PhysicalProduct(Long id, String name, double price, double weightKg, String dimension) {
        super(id, name, price);
        this.weightKg = weightKg;
        this.dimension = dimension;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public String getDimension() {
        return dimension;
    }
}
