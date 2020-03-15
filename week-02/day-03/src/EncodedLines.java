import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class EncodedLines {

  public static void main(String[] args) {
    // Create a method that decrypts encoded-lines.
    try {
      int shiftAscii = -1;
      Path path = Paths.get("./textFiles/encoded-lines.txt");
      List<String> encodedLines = Files.readAllLines(path);
      List<String> decodedLines = new ArrayList<>();
      for (String encodedLine : encodedLines) {
        String decodedLine = "";
        for (int i = 0; i < encodedLine.length(); i++) {
         if ( encodedLine.charAt(i)!=' ') {
           decodedLine += decodeChar(encodedLine.charAt(i), shiftAscii);
         } else {
           decodedLine+=' ';
         }
        }
        decodedLines.add(decodedLine);
      }
      Files.write(Paths.get("./textFiles/decoded-lines.txt"),decodedLines);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static char decodeChar(char charToEncode, int shiftAscii) {
    return (char) ((int) (charToEncode) + shiftAscii);
  }

}