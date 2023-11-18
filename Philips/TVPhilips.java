package Paradygmaty.Podsumowanie.telewizory.Philips;

import Paradygmaty.Podsumowanie.telewizory.TV;

public abstract class TVPhilips implements TV {
    private String id;

    protected boolean statusON = false;
    private int currentChanel = 3;
    private int inches;

    protected TVPhilips(String id, int inches){
        this.id = id;
        this.inches = inches;
    }

    public String getId() {
        return id;
    }

    public int getInches() {
        return inches;
    }

    @Override
    public void turnON() {
        statusON = true;
        emitSignalToTheScreen();
        System.out.println("hello!");

    }

    @Override
    public void turnOFF() {
        statusON = false;
        System.out.println("black screen");
    }

    @Override
    public void powerAction() {
        if(statusON){
            turnOFF();
        }else{
            turnON();
        }
    }

    @Override
    public void chanelSwitch(int number) {
        if(statusON){
            currentChanel = number;
        }
    }
    private void emitSignalToTheScreen(){
        new Thread(new Runnable() {
            @Override
            public void run() {
                while(statusON) {
                    try {
                        System.out.println("Program: " + currentChanel);
                        Thread.sleep(3000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
        }).start();
    }
}
