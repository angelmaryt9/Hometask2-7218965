package carproject;

class Engine {
    private String type;

    public Engine(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}

class CombustionEngine extends Engine {
    public CombustionEngine() {
        super("Combustion Engine");
    }
}

class ElectricEngine extends Engine {
    public ElectricEngine() {
        super("Electric Engine");
    }
}

class HybridEngine extends Engine {
    public HybridEngine() {
        super("Hybrid Engine");
    }
}

class Manufacture {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

abstract class Vehicle {
    private Manufacture manufacture;
    private Engine engine;

    public Vehicle(Manufacture manufacture, Engine engine) {
        this.manufacture = manufacture;
        this.engine = engine;
    }

    public abstract void ShowCharacteristics();

    public Manufacture getManufacture() {
        return manufacture;
    }

    public Engine getEngine() {
        return engine;
    }
}

class ICEV extends Vehicle {
    public ICEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: ICEV");
        System.out.println("Manufacture: " + getManufacture().getName());
        System.out.println("Engine Type: " + getEngine().getType());
       
    }
}

class BEV extends Vehicle {
    public BEV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: BEV");
        System.out.println("Manufacture: " + getManufacture().getName());
        System.out.println("Engine Type: " + getEngine().getType());
        
    }
}

class HybridV extends Vehicle {
    public HybridV(Manufacture manufacture, Engine engine) {
        super(manufacture, engine);
    }

    @Override
    public void ShowCharacteristics() {
        System.out.println("Vehicle Type: HybridV");
        System.out.println("Manufacture: " + getManufacture().getName());
        System.out.println("Engine Type: " + getEngine().getType());
       
    }
}

public class Carmanagement {
    public static void main(String[] args) {
       
        Manufacture toyota = new Manufacture();
        toyota.setName("Toyota");
        Manufacture tesla = new Manufacture();
        tesla.setName("Tesla");

    
        CombustionEngine combustionEngine = new CombustionEngine();
        ElectricEngine electricEngine = new ElectricEngine();
        HybridEngine hybridEngine = new HybridEngine();

      
        Vehicle[] vehicles = {
            new ICEV(toyota, combustionEngine),
            new BEV(tesla, electricEngine),
            new HybridV(toyota, hybridEngine)
        };

        
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
        }
    }
}

