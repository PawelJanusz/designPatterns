package a_creational.factory.first_example.unit;

public class BlueFactory extends Factory{

    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(23, 0, 8);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(90, 0, 23);
            default:
            throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type){
            case HELICOPTER:
                return new Helicopter(65, 0, 22);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
