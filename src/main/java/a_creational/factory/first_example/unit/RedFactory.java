package a_creational.factory.first_example.unit;

public class RedFactory extends Factory{


    @Override
    public InfantryUnit createInfantryUnit(UnitType type) {
        switch (type) {
            case RIFLEMAN:
                return new Rifleman(19, 0, 6);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public MechanizedUnit createMechanizedUnit(UnitType type) {
        switch (type){
            case TANK:
                return new Tank(87, 0, 29);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }

    @Override
    public AirUnit createAirUnit(UnitType type) {
        switch (type){
            case HELICOPTER:
                return new Helicopter(54, 0, 26);
            default:
                throw new UnsupportedOperationException("Nieznany typ");
        }
    }
}
