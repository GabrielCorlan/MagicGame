import characters.Character;

import javax.naming.spi.DirectoryManager;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class PlayersInfo {

    private static final String directoryName = "C:\\Info\\";
    private static final String playersInfoFileName = "C:\\Info\\PlayersInfo.txt";

    //private static Path playersInfoDirectoryPath = Paths.get(directoryName);

    private static final File playersInfoFile = new File(playersInfoFileName);
    private static final File playersInfoDirectory = new File(directoryName);


    public static void initialize(ArrayList<Character> characters) throws IOException {

//        if(!Files.exists(playersInfoDirectoryPath)){
//            Files.createDirectory(playersInfoDirectoryPath);
//        }

        if (!playersInfoDirectory.exists()){
            playersInfoDirectory.mkdir();
        }

        if (!playersInfoFile.exists()) {
            playersInfoFile.createNewFile();

            FileWriter fileWriter = new FileWriter(playersInfoFileName);
            for (Character ch : characters) {
                fileWriter.write(String.format("%s, %d, %d\n", ch.getName(), ch.getScores(), ch.getLevel()));
            }
            fileWriter.close();
        }
    }
}
