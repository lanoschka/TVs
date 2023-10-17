package Paradygmaty.Podsumowanie.telewizory.Philips;

public class TelewizorPhilipsAmbilight  extends TelewizorPhilips{
    protected TelewizorPhilipsAmbilight(String id, int cale) {
        super(id, cale);
    }

    @Override
    public void wlacz() {
        super.wlacz();
        ambilight();
    }

    @Override
    public void wylacz() {
        super.wylacz();
    }
    private void ambilight(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (statusWlaczony){
                    try {
                        System.out.println("wyswietlaj kolorki z tyłu");
                        Thread.sleep(1000);
                    } catch (InterruptedException e){
                        e.printStackTrace();
                    }

                }
            }
        }).start();

    }
}
