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
JUnit4Runner junit4Runner = new JUnit4Runner.Builder()
			.workingDirectory(workingDirectory)
			.classPath(classpaths)
			.classSignature(classSignature)
			.build();
</pre>

3) Call `run()` method
<pre>
junit4Runner.run();
</pre>

[Open this example](https://github.com/williamniemiec/junit4-api/blob/master/tests/api/junit4/JUnit4RunnerTest.java).


## 🔌 Installation
#### Maven
1. Add to your `pom.xml` before `<build>` tag, replacing `RELEASE_VERSION` with the desired version:
	```
	<dependency>
		<groupId>wniemiec.api</groupId>
		<artifactId>jdb</artifactId>
		<version>RELEASE_VERSION</version>
	</dependency>
	```

2. Go to `~/.m2/settings.xml` file ([see more](https://maven.apache.org/settings.html)) and add the following: 

	2.1. Inside `<profiles>/<profile>/<repositories>`:
	```
	<repository>
	    <id>github-wniemiec-junit4-api</id>
	    <name>GitHub williamniemiec Apache Maven Packages</name>
	    <url>https://maven.pkg.github.com/williamniemiec/junit4-api</url>
	</repository>
	```

	2.2. Inside `<servers>`:
	```
	<server>
	    <id>github-wniemiec-junit4-api</id>
	    <username>williamniemiec</username>
	    <password>PKG-KEY</password>
	</server>
	```

##### Example:
```
<?xml version="1.0" encoding="UTF-8" ?>
<settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
          xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">
    <activeProfiles>
        <activeProfile>github</activeProfile>
    </activeProfiles>

    <profiles>
        <profile>
            <id>github</id>
            <repositories>
                <repository>
                    <id>github-wniemiec-junit4-api</id>
                    <name>GitHub williamniemiec Apache Maven Packages</name>
                    <url>https://maven.pkg.github.com/williamniemiec/junit4-api</url>
                </repository>
            </repositories>
        </profile>
    </profiles>

    <servers>
        <server>
            <id>github-wniemiec-junit4-api</id>
            <username>williamniemiec</username>
            <password>PKG-KEY</password>
        </server>
    </servers>
</settings>
```

3. Replace `PKG-KEY` with `7_0b160a3090c6d2be691f66b21dff138b3b687b0` **without underscore (`_`)**

4. Finally, run the following command:
> mvn install

**NOTE:** If `settings.xml` file does not exist, create one and use the same content as in the example above.

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
