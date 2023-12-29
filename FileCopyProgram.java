import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class FileCopyProgram {
    public static void main(String[] args) {
        String sourceFilePath = "D:\\codegym\\copy-text-file\\source\\file.txt";
        String targetFilePath = "D:\\codegym\\copy-text-file\\target\\file.txt";

        try (Reader reader = new FileReader(sourceFilePath);
            Writer writer = new FileWriter(targetFilePath)) {

            int character;
            int characterCount = 0;
            while ((character = reader.read()) != -1) {
                writer.write(character);
                characterCount ++;
            }
            System.out.println("Đã sao chép tệp thành công. Số ký tự: " + characterCount);
        }catch (FileNotFoundException e) {
            System.out.println("Không tìm thấy tập tin nguồn: " + e.getMessage());
        }catch (IOException e) {
            System.out.println("Đã xảy ra lỗi trong quá trình sao chép tập tin: " +e.getMessage());
        }
    }
}
