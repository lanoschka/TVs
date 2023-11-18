package Paradygmaty.Podsumowanie.telewizory.Philips;

public class TVPhilipsAmbilight extends TVPhilips {
    protected TVPhilipsAmbilight(String id, int cale) {
        super(id, cale);
    }

    @Override
    public void turnON() {
        super.turnON();
        ambilight();
    }

    @Override
    public void turnOFF() {
        super.turnOFF();
    }
    private void ambilight(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusON){
                    try {
                        System.out.println("display lights in the background");
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
            }
        }).start();

    }
}
