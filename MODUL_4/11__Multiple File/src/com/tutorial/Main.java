package com.tutorial;

import com.terminal.Console;

import static com.terminal.Console.log;

public class Main {
    public static void main(String[] args) {
        // membuat objek
        Player player1 = new Player("Ika");
        Player player2 = new Player("Damayanti");
        Player player3 = new Player("Yanti");
        player1.cetak();
        player2.cetak();
        player3.cetak();

        Console.log("Assalamu'alaikum");
    }
    
}
