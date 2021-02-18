![](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/logo/logo.jpg?raw=true)

<h1 align='center'>JUnit 4 API</h1>
<p align='center'>Simple JUnit 4 API for running JUnit 4 tests in code</p>
<p align="center">
	<a href="https://github.com/williamniemiec/junit4-api/actions?query=workflow%3AWindows"><img src="https://img.shields.io/github/workflow/status/williamniemiec/junit4-api/Windows?label=Windows" alt=""></a>
	<a href="https://github.com/williamniemiec/junit4-api/actions?query=workflow%3AMacOS"><img src="https://img.shields.io/github/workflow/status/williamniemiec/junit4-api/MacOS?label=MacOS" alt=""></a>
	<a href="https://github.com/williamniemiec/junit4-api/actions?query=workflow%3AUbuntu"><img src="https://img.shields.io/github/workflow/status/williamniemiec/junit4-api/Ubuntu?label=Ubuntu" alt=""></a>
	<a href="https://codecov.io/gh/williamniemiec/junit4-api"><img src="https://codecov.io/gh/williamniemiec/junit4-api/branch/v1.x/graph/badge.svg?token=R2SFS4SP86" alt="Coverage status"></a>
	<a href="http://java.oracle.com"><img src="https://img.shields.io/badge/java-8+-4c7e9f.svg" alt="Java compatibility"></a>
	<a href="https://github.com/williamniemiec/junit4-api/releases"><img src="https://img.shields.io/github/v/release/williamniemiec/junit4-api" alt="Release"></a>
	<a href="https://github.com/williamniemiec/junit4-api/blob/master/LICENCE"><img src="https://img.shields.io/github/license/williamniemiec/junit4-api" alt="Licence"></a>
</p>
<hr />

## ❇ Introduction
Simple API for running JUnit 4 tests in a simplified way in code.

## ❓ How to use
In order to use this API, you need to provide the following information:
* Working directory
* Test class path
* Test class signature

It is necessary to build JUnit 4 API. Build it as follows:
<pre>
JUnit4API api = new JUnit4API.Builder()
	.workingDirectory(BASE_DIRECTORY)
	.classPath(LIST_OF_COMPILED_FILES)
	.classSignature(STRING_WITH_TEST_CLASS_SIGNATURE)
	.displayVersion(true)	// Optional (default is false)
	.build();
</pre>

After that, run it as follows:
<pre>
api.run();
</pre>

#### Example
1) Create variables with required information (working directory, classpaths and class signature)

<pre>
Path workingDirectory = Path.of(".", "bin").toAbsolutePath().normalize();
Path stringUtilsClassPath = workingDirectory.resolve(
		Path.of("api", "util", "StringUtilsTest.class")
);
List&lt;Path> classpaths = List.of(
		workingDirectory.resolve(stringUtilsClassPath)
);
</pre>

2) In your code, type:
<pre>
JUnit4API api = new JUnit4API.Builder()
	.workingDirectory(workingDirectory)
	.classPath(classpaths)
	.classSignature(classSignature)
	.build();
</pre>

3) Call `run()` method
<pre>
api.run();
</pre>

[Open this example](https://github.com/williamniemiec/junit4-api/blob/master/tests/api/junit4/JUnit4RunnerTest.java).


## 🔌 Installation
#### Maven
[See how to install here](https://github.com/williamniemiec/junit4-api/packages/613128#-installation)

#### Eclipse IDE
With your project opened, add [`junit4-api.jar`](https://github.com/williamniemiec/junit4-api/releases/) into project build path.

![step1](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/how-to-use/step1.png?raw=true)
![step2](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/how-to-use/step2.png?raw=true)
![step3](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/how-to-use/step3.png?raw=true)
![step4](https://raw.githubusercontent.com/williamniemiec/junit4-api/master/docs/img/how-to-use/step4.png?raw=true)


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
