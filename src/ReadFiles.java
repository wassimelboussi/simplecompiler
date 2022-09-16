import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFiles {
    final Path path;

    public ReadFiles(Path path) {
        this.path = path;
    }

    String read(String path) throws IOException {
        return Files.readString(Path.of(path));
    }

    String readToString(String path) throws IOException {
        return Files.readString(Path.of(path)).toString();
    }
}
