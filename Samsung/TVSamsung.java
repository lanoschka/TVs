package Paradygmaty.Podsumowanie.telewizory.Samsung;

import Paradygmaty.Podsumowanie.telewizory.TV;

public abstract class TVSamsung implements TV {

    private boolean statusON = false;

    private int chanelNumber = 1;
    private int inches;


    protected TVSamsung(int inches){
        this.inches = inches;
    }
    @Override
    public void turnON() {
        statusON = true;
        System.out.println("Samsung TV");
        display();
    }

    @Override
    public void turnOFF() {
        System.out.println("blackness");
        //turning off screen animation
        statusON = false;

    }

    @Override
    public void powerAction() {
        if(statusON){
            turnOFF();
        }else {
            turnON();
        }
    }

    @Override
    public void chanelSwitch(int number) {
        if(statusON){
            chanelNumber = number;
        }
    }

    private void display(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(statusON){

                    try {
                        System.out.println("display: " + chanelNumber);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }

                }
            }
        }).start();
    }
}
