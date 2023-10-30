package javaBasics.enumeration;

public class MainInsideEnumInsideClass {
    enum Planets{EARTH, VENUS, MARS, JUPITER, SATURN; // (;) is compulsory here

        public static void main(String[] args) {
            String planets = "MARS";
            Planets newPlanet = Planets.valueOf(planets);
            System.out.println(newPlanet);  // MARS ( of type Planets )

//            System.out.println(Planets.valueOf("MERCURY")); // IllegalArgumentException

            for(Planets value : Planets.values()){
                System.out.println(value);
            }
        }
    }


}
