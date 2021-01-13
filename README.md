
![](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/logo/logo.jpg?raw=true)

<h1 align='center'>JUnit 4 API</h1>

<p align='center'>Simple JUnit 4 API for running JUnit 4 tests in code</p>

<hr />

## ❇ Introduction
Simple API for running JUnit 4 tests in a simplified way in code.

## ❓ How to use
In order to use this API, you need to provide the following information:
* Working directory
* Test class path
* Test class signature

It is necessary to build JUnit 4 runner. Build it as follows:
<pre>
JUnit4Runner junit4Runner = new JUnit4Runner.Builder()
		.workingDirectory(BASE_DIRECTORY)
		.classPath(LIST_OF_COMPILED_FILES)
		.classSignature(STRING_WITH_TEST_CLASS_SIGNATURE)
		.displayVersion(true)	// Optional (default is false)
		.build();
</pre>

After that, run it as follows:
<pre>
junit4Runner.run();
</pre>

#### Eclipse IDE
1) With your project opened, add [`junit4-api.jar`](https://github.com/williamniemiec/junit4-api/releases/) into project build path.
![step1](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/how-to-use/step1.png?raw=true)
![step2](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/how-to-use/step2.png?raw=true)
![step3](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/how-to-use/step3.png?raw=true)
![step4](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/how-to-use/step4.png?raw=true)

2) Create variables with required information (working directory, classpaths and class signature)

#### Example
<pre>
Path workingDirectory = Path.of(".", "bin").toAbsolutePath().normalize();
Path stringUtilsClassPath = workingDirectory.resolve(
		Path.of("api", "util", "StringUtilsTest.class")
);
List&lt;Path> classpaths = List.of(
		workingDirectory.resolve(stringUtilsClassPath)
);
</pre>

3) In your code, type:
<pre>
JUnit4Runner junit4Runner = new JUnit4Runner.Builder()
			.workingDirectory(workingDirectory)
			.classPath(classpaths)
			.classSignature(classSignature)
			.build();
</pre>

4) Call `run()` method
<pre>
junit4Runner.run();
</pre>

[Open this example](https://github.com/williamniemiec/junit4-api/blob/master/tests/api/junit4/JUnit4RunnerTest.java).


## 🚩 Changelog
Details about each version are documented in the [releases section](https://github.com/williamniemiec/junit4-api/releases).

## 🤝 Contribute
See the documentation on how you can contribute to the project [here](https://github.com/williamniemiec/junit4-api/blob/master/CONTRIBUTING.md).

## 📁 Files
### /
|        Name 	|Type|Description|
|----------------|-------------------------------|-----------------------------|
|dist |`Directory`|Released versions|
|docs |`Directory`|Documentation files|
|lib   |`Directory`|Libraries the project uses   |
|src     |`Directory`| Source files |
|tests|`Directory`|Tests of the source files|
