package info.johnmurphyastro.stuff;

/**
 * Shows typical enum usage, using the enum 'PlanetEnum'
 * @author John
 */
public class TestEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PlanetEnum myFavoritePlanet = PlanetEnum.VENUS;
        if (isVenus(myFavoritePlanet)){
            System.out.println("It is Venus!");
        }
        
        PlanetEnum anotherPlanet = PlanetEnum.NEPTUNE;
        if (isVenus(anotherPlanet)){
            System.out.println("It is Venus!");
        } else {
            System.out.println("Not Venus. It is " + anotherPlanet);
        }
    }
    
    public static boolean isVenus(PlanetEnum planet){
        // Note that I could have written it like this instead:
        // return planet == PlanetEnum.VENUS;
        
        if (planet == PlanetEnum.VENUS){
            return true;
        }
        return false;
    }
    
}
