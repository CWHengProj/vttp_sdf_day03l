import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import service.CSVManagement;

public class App{

    public static void main(String[] args) throws IOException{
        //pass arguments
        //arg[0] "c:\\data"
        //arg[1] "myfile.txt"
        //windows file structure - c:\\data\text.txt

        String dirPath = args[0];
        String fileName = args[1];
        String dirPathFileName = dirPath + File.separator + fileName;
        System.out.println(dirPathFileName);
        //check if dir exists

        //if dir does not exist, create dir
        File directory = new File(dirPath);
        if (directory.exists()){
            System.out.println("Directory "+ directory.toString()+" had already been created");
        }
        else {
            directory.mkdir();
        }
        
        //create file inside the directory
        File file = new File(dirPathFileName);
        if (file.exists()){
            System.out.println("File " + file.toString()+" already exists.");
        }
        else{
            file.createNewFile();     
        }

        //use FileWriter
        //1. Use console to read in a stream of text (sentence)
        //2. Use FileWriter to write the content to the file
        /* Console console = System.console();
        String keyBoardInput = console.readLine("Enter a sentence: "); */

        /* FileWriter fw = new FileWriter(file, true); //if append false, overwrite the file, if true, add on
        fw.write(keyBoardInput);
        fw.flush();
        fw.close();

        //use FileReader
        FileReader fr = new FileReader(file);
        int dataRead = fr.read();
        while(dataRead != -1){
            System.out.print((char) dataRead);//cast to character
            dataRead = fr.read();
        }
        fr.close(); */
        
/*         //Use BufferedWriter to write file
        FileWriter fw = new FileWriter(dirPathFileName, true);
        BufferedWriter bw = new BufferedWriter(fw);
        bw.append(keyBoardInput);
        bw.flush();
        bw.close();

        //BufferedReader to read file contents
        try(FileReader fr = new FileReader(file);){
            try(BufferedReader br = new BufferedReader(fr);){
                String line = "";
                while((line = br.readLine())!= null){
                    System.out.println(line);
                }
            }
        } */

/*         //PrintReader
        //Use FileOutputStream
        FileOutputStream fos = new FileOutputStream(file, true);
        byte[] byteContent = keyBoardInput.getBytes();
        fos.write(byteContent);
        fos.flush();
        fos.close();

        //use FileInputStream
        FileInputStream fis = new FileInputStream(file);
        int contentRead =0;
        while ((contentRead = fis.read())!=-1){
            System.out.println((char) contentRead);
        }
        fis.close();
 */
/*         //Use FileOutputStream and DataOutputStream to write to file
        FileOutputStream fos = new FileOutputStream(file);
        DataOutputStream dos = new DataOutputStream(fos);
        byte[] contents = keyBoardInput.getBytes();
        dos.write(contents);
        dos.flush();
        dos.close();




        //Use FileInputStream and DataInputStream to read content

        FileInputStream fis = new FileInputStream(file);
        DataInputStream dis = new DataInputStream(fis);
        int fisContent = 0;
        while((fisContent= fis.read())!=-1){
            System.out.println((char) fisContent);
        }
        dis.close();
        fis.close(); */
     CSVManagement csv = new CSVManagement();
     csv.readCSV(dirPathFileName);   
    }
}