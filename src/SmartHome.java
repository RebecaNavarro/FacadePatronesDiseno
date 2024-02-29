public class SmartHome {

    //1. Declare as attribute all class dependecies
    Lighting lighting;
    MusicSystem musicSystem;
    ClimateControl climateControl;

    //2. Send dependecies in the constructor
    public SmartHome (Lighting lighting,
                      MusicSystem musicSystem,
                      ClimateControl climateControl){
        this.lighting = lighting;
        this.musicSystem = musicSystem;
        this. climateControl = climateControl;
    }

    //3. declare functions
    public void startEveningRoutine(){
        lighting.on();
        musicSystem.playMusic();
        climateControl.setTemperature(22);
    }

    public void endEveningRoutine(){
        lighting.of();
        musicSystem.stopMusic();
    }

}
