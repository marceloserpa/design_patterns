package com.mserpa.templatemethod;


public class GameMain {

    public static void main(String[] args){
        YugiohCardGameTable yugiohCardGameTable = new YugiohCardGameTable();
        yugiohCardGameTable.run();

        System.out.println("# # # # # ");

        MagicCardGameTable magicCardGameTable = new MagicCardGameTable();
        magicCardGameTable.run();
    }

}
