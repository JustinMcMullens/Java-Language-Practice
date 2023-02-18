abstract class CarBrand 
{
    private String brandName;

    public CarBrand(String brandName) 
    {
        this.brandName = brandName;
    }

    public String getBrandName() 
    {
        return this.brandName;
    }

    public abstract void displayCarModels();
}

class BMW extends CarBrand 
{
    public BMW() 
    {
        super("BMW");
    }

    public void displayCarModels() 
    {
        System.out.println("Models: X5, X4, X3, Series 7, Series 5");
    }
}

class Volkswagen extends CarBrand 
{
    public Volkswagen() 
    {
        super("Volkswagen");
    }

    public void displayCarModels() 
    {
        System.out.println("Models: Beetle, Taos, Jette, Atlas, Arteon");
    }
}

class Chevrolet extends CarBrand 
{
    public Chevrolet() 
    {
        super("Chevrolet");
    }

    public void displayCarModels() 
    {
        System.out.println("Models: Equinox, Tahoe, Trailblazer, Corvette");
    }
}