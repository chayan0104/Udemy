package A_ExceptionHandling;

import java.io.*;

// file reading and exception handling example
public class Test {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\mecha\\IdeaProjects\\Udemy\\src\\myfile.txt");

//BufferedReader bufferReader = null; //assigning outside parameter
//FileReader fileReader = null;

        //try catch
        try(FileReader fileReader = new FileReader(file); //try will automatically close those files.
        BufferedReader bufferReader = new BufferedReader(fileReader);) {

//fileReader = new FileReader(file);
//bufferReader = new BufferedReader(fileReader);// reads as line

            String line = bufferReader.readLine();

            while(line != null){
                System.out.println(line);
                line = bufferReader.readLine();

            }

        } catch (FileNotFoundException e) {
            System.out.println("file not found");
        } catch (IOException e){
            System.out.println("Problem reading the file" + file.getName());

        }
        /*finally {
            try{
                if(bufferReader != null){
                    bufferReader.close();
                }
                if(fileReader != null){
                    fileReader.close();
                }

            }catch (IOException e){
                System.out.println("unable to close "+ file.getName()+ e);
            }
        }
        */
    }
}
