# JUnit 4 API -  Contributing Guide

- [Issues](#issues)
- [Pull Request - Guide](#pull-request-guide)
- [Setting up development environment](#development-setup)
- [Code style guide](#code-style)
- [Documentation standard](#doc-standard)
-  [Jar generation](#jar-generation)
- [Creating branches](#new-branch)
- [Creating tags](#new-tag)


## <a name="issues"></a> Issues

- If there is a problem or question while editing the project, create an [issue](https://github.com/williamniemiec/junit4-api/pulls) detailing the problem or question.


## <a name="pull-request-guide"></a> Pull Request - Guide

### Branch
- If the changes made do not change the structure of the application or the way to use any functionality, use the current branch; otherwise, [creates a new branch](#new-branch) in the following format:

> If the current branch is `N.x`, the new branch should be called `(N + 1).x` (without parentheses), where N is a number

<b>Attention:</b> Do not make any changes using the `master` branch, as it will be the result of the merge with the latest version released.

### Tag
- Always create a tag before creating a pull request  
- Only create the tag at the end of your changes 
- only one tag per pull request must be created  
- Choose a different tag from the current tag. If the current tag is X.Y.Z, where X, Y and Z are numbers, [create a new tag](#new-tag) using the following criteria:  
  - If the changes made are minor, that is, small modifications that do not change the way of using a feature or even for bug fixes, create the tag `X.Y.(Z + 1)` (without parentheses) 
  - If new features are added, create the `X.(Y + 1).0` tag (without parentheses)
  - If the way of using one or more features is changed, or even if a feature is deleted, create a new branch with the name `(X + 1).x` and create a new tag with the name `(X + 1).0.0` (without parentheses) 
 
<b>Attention:</b> Tag creation should be `Annotated Tags` type.


- Released versions should be placed in the `dist/X.Y` directory, where X and Y are the released version numbers  
- Try whenever possible to add tests on each added feature. If a feature is edited, make sure the tests related to it continue to work.  
- Before adding a new functionality, it is recommended to create an issue describing the new functionality and a justification of why it would be useful to the application.

If the contribution is to correct a bug, the commit should be: `bug fix # xyzw`, where #xyzw is the issue id that quotes the bug. If not, the commit should be `bug fix <DESCRIPTION>`, where \<DESCRIPTION\> is a brief description of the bug that has been fixed.

### <a name="pull-request-submit"></a> Pull request submit
After making changes to the project, create a pull request with the project you have modified. Try to add a detailed description of what you changed from the original project. Avoid changing the structure of the project as much as possible to avoid breaking code. 

 <b> Attention: </b> Before making the pull request, make sure that:  
 * Generate the version jar in the following format: `junit4-api-X.Y.Z.jar`, where X, Y and Z are the numbers corresponding to the tag that will contain the changes made;
 * Update `pom.xml` with new version;
 * Document the changes according to the [documentation standard mentioned above](#doc-standard);
 * Create a new [release](https://github.com/williamniemiec/junit4-api/releases) with changelog.

## <a name="development-setup"></a> Setting up development environment

To work on the project, any IDE with support for JUnit 4 can be used (to execute the project tests).

## <a name="code-style"></a>Code style guide
The project uses the [code style recommended by Oracle](https://www.oracle.com/java/technologies/javase/codeconventions-contents.html), with one exception: structures `if-then-else`, `try-catch-finally` and the like should not have a closed curly bracket (`}`) to the left of the keyword.

### Example
#### Good
<pre>
if (x == 2) {
	return "two";
}
else if (x == 3) {
	return "three"
}
</pre>

#### Bad
<pre>
if (x == 2) {
	return "two";
} else if (x == 3) {
	return "three"
}
</pre>


## <a name="doc-standard"></a>Documentation standard
All classes, public methods and some variables use [javadoc](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html) to explain its functionality.


### <a name="doc-standard-class-enum"></a>Classes, inner classes and enumerations
Classes should use the following pattern:

<pre>
/**
 * Class description.
 * 
 * @author		YourName &lt; your_email@email.com &gt;
 * @version		X.Y.Z
 * @since		A.B.C
 */
</pre>

Where X, Y and Z are numbers relative to the version of the application in which the class was last modified and A, B and C identify the version of the application in which the class was created. The annotation is separated from the content with 2 tabs.  In addition, internally, the class should be divided into sections, which are identified with the following pattern:

<pre>
//-------------------------------------------------------------------------
//    [section_name]
//-------------------------------------------------------------------------
</pre>

Where [section_name] can be:
* Attributes
* Constructor(s)
* Methods
* Getters
* Getters & Setters
* Setters
* Initialization block
* Tests
* Test hooks
* Serialization and deserialization methods
* Enumerations
* Inner classes


### <a name="doc-standard-methods"></a> Methods
Public methods must be documented using javadoc.

<b>Attention: </b> Documentations using javadoc must have the tag name followed by two tabs followed by its value, with the exception of the `@implSpec`, `@apiNote` and `@implNote` tags, which contain only one tab. This is done in order to maintain uniform presentation of documentation

## <a name="jar-generation"></a>Jar generation
In order to generate the JAR file do the following:

1) On the file `pom.xml`, update:

* project.version
* project.properties.version.major (if necessary)

2) Generate JAR file

* Console
> `mvn package`

* Eclipse
1) Left-click on the file `pom.xml` and select `pom.xml` -> `Run As` -> `Maven build...`
2) In the `Goals` field, type: `package`
3) Click on `Run`
4) Make sure that the JAR file has been generated in the directory `dist/V.X/<FILENAME>`, where V = `project.properties.version.major` and \<FILENAME\> is:
`executionflow-X.Y.Z.jar`
where X, Y, Z are the version numbers of the application corresponding to `project.version`.



## Appendix

### <a name="new-branch"></a> Creating branches
Create a new branch:

<pre>
git checkout -b branch_name
</pre>

Add to the remote repository:

<pre>
git push -u origin branch_name
</pre>

#### Example
<pre>
git checkout -b v1.x
git push -u origin v1.x
</pre>

See more [here](https://git-scm.com/book/en/v2/Git-Branching-Basic-Branching-and-Merging).

### <a name="new-tag"></a> Creating tags
<pre>
git tag -a tag_name -m description
</pre>

Add to the remote repository:

<pre>
git push -u origin tag_name
</pre>

#### Example
<pre>
git tag -a v1.0.1 -m "Performance improvement"
git push -u origin v1.0.1
</pre>

See more [here](https://git-scm.com/book/en/v2/Git-Basics-Tagging).
