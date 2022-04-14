package com.company;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try(FileWriter writer = new FileWriter("song")){
            writer.write("Nothing else metters\n" +
                    "Metallica\n" +
                    "So close,no matter how far\n" +
                    "Couldn't be much more from the heart\n" +
                    "Forever trusting who we are\n" +
                    "And nothing else matters\n" +
                    "Never opened myself this way\n" +
                    "Life is ours,we live it our way\n" +
                    "All these words I don't just say\n" +
                    "And nothing else matters");


        }catch (IOException e){
            System.out.println("ff");
        }
        Song song = new Song();
        try(FileReader reader = new FileReader("song")){
            Scanner scanner = new Scanner(reader);

            song.setTitle(scanner.nextLine());
            song.setAuthor(scanner.nextLine());

            StringBuilder text = new StringBuilder();
            while (scanner.hasNext()){
                text.append(scanner.nextLine()).append("\n");

            }
            song.setText(text.toString());
//            song.setAuthor(text.toString());
//            song.setTitle(text.toString());
//            System.out.println(song.getTitle());
        }
        catch (IOException e ){
            System.out.println("dd");
        }


        System.out.println(song.getText());

    }
}
