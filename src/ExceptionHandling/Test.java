package ExceptionHandling;

import java.io.*;

// file reading and exception handling example
public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\mecha\\IdeaProjects\\Udemy\\src\\myfile.txt");
        BufferedReader bufferReader = null; //assigning outside parameter

        //try catch
        try {
            FileReader fileReader = new FileReader(file);
            bufferReader = new BufferedReader(fileReader);// reads as line

            String line = bufferReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferReader.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e){
            System.out.println("Problem reading the file" + file.getName());

        }finally {
            try{
                bufferReader.close();
            }catch (IOException e){
                System.out.println("unable to close "+ file.getName()+ e);
            }
        }


    }
}
