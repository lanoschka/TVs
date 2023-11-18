package Paradygmaty.Podsumowanie.telewizory;

public class PilotNoName implements Pilot{

    private TV TV;

    @Override
    public void pressRed() {
        TV.powerAction();
    }

    @Override
    public void pressOne() {
        TV.chanelSwitch(1);
    }

    @Override
    public void pressTwo() {
        TV.chanelSwitch(2);
    }

    @Override
    public void pressThree() {
        TV.chanelSwitch(3);
    }

    @Override
    public void pairTV(TV TV) {
        this.TV = TV;
    }
}
