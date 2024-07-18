import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FilesManagement {
    static void createDirectory(String path, StringBuilder log) {
        File dir = new File(path);
        if (!dir.exists()) {
            if (dir.mkdir()) {
                log.append("Directory '").append(path).append("' created successfully.\n");
            } else {
                log.append("Failed to create directory '").append(path).append("'.\n");
            }
        } else {
            log.append("Directory '").append(path).append("' already exists.\n");
        }
    }

    static void createFile(String path, StringBuilder log) {
        File file = new File(path);
        try {
            if (file.createNewFile()) {
                log.append("File '").append(path).append("' created successfully.\n");
            } else {
                log.append("Failed to create file '").append(path).append("'.\n");
            }
        } catch (IOException e) {
            log.append("Error creating file '").append(path).append("': ").append(e.getMessage()).append("\n");
        }
    }

    static void writeLogToFile(String path, StringBuilder log) {
        try (FileWriter writer = new FileWriter(path)) {
            writer.write(log.toString());
        } catch (IOException e) {
            log.append("Error writing to file '").append(path).append("': ").append(e.getMessage()).append("\n");
        }
    }
}
