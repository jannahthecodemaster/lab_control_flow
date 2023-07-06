public class WeatherCheck {

    public static void main(String[] args) {
        int temperature = 50;
        boolean currentlyRaining = true;

        if(temperature>= 100 && currentlyRaining) {
            System.out.println("It is hot and wet: wear light clothing but carry an umbrella");
        } else if (temperature < 100 && currentlyRaining) {
            System.out.println("It is cold and raining: wrap up warm with a waterproof coat and gloves");
        } else if (temperature >= 100 && !currentlyRaining) {
            System.out.println("It is hot and not raining: wear light clothing");
        } else if (temperature < 100 && !currentlyRaining) {
            System.out.println("It is cold and not raining: wrap up warm");
        }
    }

}
