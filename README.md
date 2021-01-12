
![](https://github.com/williamniemiec/ExecutionFlow/blob/master/docs/img/logo/logo.jpg?raw=true)

<h1 align='center'>JUnit 4 API</h1>

<p align='center'>Framework to run junit 4 tests via code in a simple way</p>

<hr />

## 🔵 Introduction
...

## ❓ How to use
In order to use this API, you need to provide the following information:
* 2
* 2 
* 2

#### Eclipse IDE
1) With your project opened, add [`junit4-api.jar`](link) into project build path.
![buildpath1-open]()
![buildpath2-select]()

2) Create variables with required information (working directory, classpaths and class signature)
<pre>
	// Example
	Path workingDirectory = Path.of(".", "bin").toAbsolutePath().normalize();
	Path stringUtilsClassPath = workingDirectory.resolve(
			Path.of("api", "util", "StringUtilsTest.class")
	);
	List<Path> classpaths = List.of(
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

[Open this example](LINK).


## 🚩 Changelog
Details about each version are documented in the [releases section](https://github.com/williamniemiec/junit4-api/releases).

## 📁 Files
### /
|        Name 	|Type|Description|
|----------------|-------------------------------|-----------------------------|
|dist |`Directory`|Released versions|
|docs |`Directory`|Documentation files|
|lib   |`Directory`|Libraries the project uses   |
|src     |`Directory`| Source files |
|tests|`Directory`|Tests of the source files|

