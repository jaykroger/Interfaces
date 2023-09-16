import javax.swing.*;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

import static java.nio.file.StandardOpenOption.CREATE;

public class ShortLister {
    public static void main(String[] args)
    {
        JFileChooser chooser = new JFileChooser();

        try {

            // use the toolkit to get the current working directory of the IDE
            // Not sure if the toolkit is thread safe...

            File workingDirectory = new File(System.getProperty("user.dir"));

            // Typically, we want the user to pick the file, so we use a file chooser
            // Because the chooser is part of Swing it should be thread safe.

            chooser.setCurrentDirectory(workingDirectory);

            // Using the chooser adds some complexity to the code
            // We have to code the complete program within the conditional return of
            // the FileChooser because the user can close it without picking a file

            if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
            {
                File selectedFile = chooser.getSelectedFile();

                // Initializes a new ShortWordFilter
                Filter wordFilter = new ShortWordFilter();
                Scanner scanner = new Scanner(selectedFile);

                // Creates ArrayList to store all words that fit the accept = true parameters of ShortWordFilter
                ArrayList<String> shortWords = new ArrayList<>();

                // Reads each word in the selected file and adds them to shortWords ArrayList if length < 5
                while (scanner.hasNext())
                {
                  String word = scanner.next();
                  if (wordFilter.accept(word))
                  {
                      shortWords.add(word);
                  }
                }

                // Call to collectAll method declared below to display all items in shortWords ArrayList

                collectAll(shortWords);

            }
        } catch (FileNotFoundException e)
        {
            System.out.println("File not found!!!");
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

   // collectAll method to print out all entries in specified Array
    // Used above
    public static void collectAll(ArrayList< String > array)
    {
        for (String obj : array) {
            System.out.println(obj);
        }
    }
}
