import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateLines {
        public static void main(String[] args) throws IOException {
            String input;
            int count = 0;
            StringBuffer sb = new StringBuffer();
            //Instantiating the Scanner class
            Scanner sc = new Scanner(new File("C:/1/0.txt")); //INPUT FILE
            //Instantiating the FileWriter class
            FileWriter writer = new FileWriter("C:/1/00.txt"); //OUTPUT FILE
            //Instantiating the Set class
            Set<String> set = new HashSet<>();
            while (sc.hasNextLine()) {
                input = sc.nextLine();
                if (set.add(input)) {
                    writer.append(input).append("\n");
                } else {
                    count++;
                    sb.append(input).append("\n");
                }
            }
            writer.flush();
            System.out.println("Кол-во удаленных дублей: " + count);
            System.out.println(sb);
        }
    }