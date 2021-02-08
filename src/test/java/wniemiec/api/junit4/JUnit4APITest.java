package wniemiec.api.junit4;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;

import org.junit.Test;

public class JUnit4APITest {

	@Test
	public void testRunStringUtilsTest() throws IOException, InterruptedException {
		Path workingDirectory = Path.of(".", "target", "test-classes").normalize().toAbsolutePath();
		Path classpath = workingDirectory.resolve(
				Path.of("wniemiec", "api", "junit4", "testfiles", "SimpleTest.class")
		);
		List<Path> classpaths = List.of(
				workingDirectory.resolve(classpath)
		);

		JUnit4API JUnit4API = new JUnit4API.Builder()
				.workingDirectory(workingDirectory)
				.classPath(classpaths)
				.classSignature("wniemiec.api.junit4.testfiles.SimpleTest")
				.displayVersion(true)
				.build();
		
		JUnit4API.run();
	}
}
