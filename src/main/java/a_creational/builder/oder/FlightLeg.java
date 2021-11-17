package a_creational.builder.oder;

public class FlightLeg {

    private String from;
    private String to;
    private boolean delayed;
    private double prize;

    public FlightLeg(FlightLegBuilder flightLegBuilder){
        this.from = flightLegBuilder.from;
        this.to = flightLegBuilder.to;
        this.delayed = flightLegBuilder.delayed;
        this.prize = flightLegBuilder.prize;
    }

    public void setDelayed(boolean delayed) {
        this.delayed = delayed;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    public String toString() {
        return "FlightLeg{" +
                "from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", delayed=" + delayed +
                ", prize=" + prize +
                '}';
    }


    public static class FlightLegBuilder{
        private String from;
        private String to;
        private boolean delayed;
        private double prize;

        public FlightLegBuilder from(String from){
            this.from = from;
            return this;
        }

        public FlightLegBuilder to(String to){
            this.to = to;
            return this;
        }

        public FlightLegBuilder delayed(boolean delayed){
            this.delayed = delayed;
            return this;
        }

        public FlightLegBuilder prize(double prize){
            this.prize = prize;
            return this;
        }

        public FlightLeg build(){
            if (this.prize == 0)
                throw new IllegalArgumentException("Brak wymaganego pola: prize");

            return new FlightLeg(this);
        }

    }
}
