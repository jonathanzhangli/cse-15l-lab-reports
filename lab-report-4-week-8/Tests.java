import static org.junit.Assert.*;
import org.junit.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

// Compile: javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar Tests.java
// Run: java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore Tests

public class Tests {
    @Test
    public void snippet1Test() throws Exception {
        Path fileName = Path.of("test-file-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("`google.com");
        assertEquals(expected, links);
    }

    @Test
    public void snippet2Test() throws Exception {
        Path fileName = Path.of("test-file-2.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("a.com");
        expected.add("a.com(())");
        expected.add("example.com");
        assertEquals(expected, links);
    }

    @Test
    public void snippet3Test() throws Exception {
        Path fileName = Path.of("test-file-3.md");
        String content = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(content);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("https://sites.google.com/eng.ucsd.edu/cse-15l-spring-2022/schedule");
        assertEquals(expected, links);
    }

}