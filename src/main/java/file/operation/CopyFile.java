package file.operation;

import java.io.*;
import java.lang.reflect.Method;

/**
 * Created by deepak.kumar on 2/21/16.
 */
public class CopyFile {

    public CopyFile(){
    }

    public boolean copy(String sourceFileName, String destinationFileName)
    {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(sourceFileName));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(destinationFileName));
            String data = null;
            while((data = bufferedReader.readLine()) != null){
                bufferedWriter.write(data);
                bufferedWriter.write("\n");
            }
            if(bufferedReader != null){
                bufferedReader.close();
            }
            if(bufferedWriter != null){
                bufferedWriter.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String copyFileClassName = "file.operation.CopyFile";
        Class<?> aClass = Class.forName(copyFileClassName);
        Method[] methods = aClass.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
    }
}
