public enum Destination {
    EDINBURG("EDI"),
    GLASGOW("GLA"),
    ZAGREB("ZGB"),
    NEWYORK("JFK"),
    TOKYO("NRT"),
    OSIJEK("OSI"),
    HARARE("HAR"),
    MIAMI("MIA");

    private final String airportCode;

    Destination(String airportCode){
        this.airportCode = airportCode;
    }

    public String getAirportCode() {
        return airportCode;
    }
}
