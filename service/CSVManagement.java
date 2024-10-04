package service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CSVManagement {
    //filename: dirPath + file separator +filename

    public void readCSV(String filename) throws FileNotFoundException, IOException{
        //use buffer reader
        try(FileReader fr = new FileReader(filename);){
            try(BufferedReader br = new BufferedReader(fr);){
                String line = "";
                while((line = br.readLine())!= null){
                    System.out.println(line);
                }
            }
        }

    }
    public void writeCSV(String filename){

    }

}
