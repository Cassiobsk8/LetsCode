package Tecnicas.Projeto;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandler
{
    public static String[] readFile(String filePath)
    {
        List<String> content = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath)))
        {
            String line;
            while ((line = br.readLine()) != null)
            {
                content.add(line);
            }
        } catch (IOException e)
        {
            System.out.println("File not found");
        }
        return content.toArray(String[]::new);
    }

    public static void writeFile(String filePath, String[] content, String header)
    {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath)))
        {
            bw.write(header);
            for (String line : content)
            {
                bw.newLine();
                bw.write(line);
            }
        } catch (IOException e)
        {
            System.out.println("Can't write file");
        }
    }
}
