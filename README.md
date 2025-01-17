Fast and simple way to parse/format/validate ISBNs with the **official ISBN ranges** definition.
The parser is optimized for speed, the [`ISBN`](https://javadoc.io/doc/net.creativecouple.validation/fast-isbn/latest/de/creativecouple/validation/isbn/ISBN.html) class for simplicity. <br/>
This library can evaluate **millions of ISBNs per second** on a single CPU core.

[![ISBN-10](https://creativecouple.de/validation/isbn/998043192X.banner.svg)](https://creativecouple.de/validation/isbn/#?998043192X)
[![ISBN-13](https://creativecouple.de/validation/isbn/9789980431929.banner.svg)](https://creativecouple.de/validation/isbn/#?9789980431929)
[![Java Version](https://img.shields.io/badge/Java-1.8%2B-orange)](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](https://opensource.org/licenses/MIT)
[![Download](https://img.shields.io/maven-central/v/net.creativecouple.validation/fast-isbn)](https://central.sonatype.com/artifact/net.creativecouple.validation/fast-isbn)
[![Javadocs](https://javadoc.io/badge2/net.creativecouple.validation/fast-isbn/javadoc.svg)](https://javadoc.io/doc/net.creativecouple.validation/fast-isbn)

# fast-isbn – world's fastest ISBN range validation
A common issue in digital commerce systems is to validate article identifiers.
In the publishing business there is the so-called ISBN standard[^6], maintained by the
International ISBN Agency.
By using their official ISBN range definitions this library offers up-to-date ISBN validation
beyond simply comparing the EAN-13 checkdigit, and adds ISO 2108[^6] conform formatting
for the extended[^7] and compact form[^8].

[<img src="https://creativecouple.de/validation/isbn/9789980431929.svg" width="500">](https://creativecouple.de/validation/isbn/#?9789980431929)

All number ranges that are not yet assigned to a local ISBN agency group[^2] or
whose publisher range[^3] is not defined will be treated as invalid.
The dashes will be inserted automatically at the correct positions for grouping the
isbn prefix[^1], agency group code[^2], publisher code[^3], title code[^4], and checkdigit[^5].

[^1]: **GS1 prefix** (formerly known as EAN/UCC prefix), first three digits of the ISBN, defined by the [Registration Authority](https://www.isbn-international.org/)
[^2]: **Registration group element**, length-varying second part of the ISBN, also known as local agency group, allocated by the [Registration Authority](https://www.isbn-international.org/)
[^3]: **Registrant element**, length-varying third part of the ISBN, also known as publisher, allocated by the Registration Group (local agency)
[^4]: **Publication element**, length-varying fourth part of the ISBN, also known as book title number, assigned by the Registrant (publisher)
[^5]: **Checkdigit**, last digit of the ISBN, calculated using the "modulus 10" algorithm
[^6]: **International Standard Book Number** (ISBN) [ISO 2108:2017](https://www.google.com/search?q=%22iso+2108%22+type%3Apdf)
[^7]: **Human readable form** of the ISBN uses the correct grouping together with the word "ISBN", example `ISBN 978-90-70002-34-3`
[^8]: **Alternative compact form** of the ISBN, for data processing purposes, example `9789070002343`

**Examples:**
- :cry: wrong grouping: 978-05-5750-469-5 or 978-0557504695 (e.g. on amazon.com)
- [![ISBN-13](https://creativecouple.de/validation/isbn/9780557504695.banner.svg)](https://creativecouple.de/validation/isbn/#?9780557504695) correct ISO 2108 grouping: 978-0-557-50469-5
- [![ISBN-10](https://creativecouple.de/validation/isbn/9980431929.banner.svg)](https://creativecouple.de/validation/isbn/#?9980431929) invalid ISBN-10 checksum: 9980-43-192-9 
- [![ISBN-10](https://creativecouple.de/validation/isbn/998043192X.banner.svg)](https://creativecouple.de/validation/isbn/#?998043192X) correct ISBN-10 checksum: 9980-43-192-X

The [ISBN domain object](https://javadoc.io/doc/net.creativecouple.validation/fast-isbn/latest/de/creativecouple/validation/isbn/ISBN.html)
wraps the ISBN string representation efficiently to be used
as identifier in your domain-driven code base.
It normalizes and corrects the given string input with respect to hyphens/dashes,
parsing both ISBN-10 and ISBN-13 numbers into the same object, the
[`ISBN`](https://javadoc.io/doc/net.creativecouple.validation/fast-isbn/latest/de/creativecouple/validation/isbn/ISBN.html). 

## Usage (latest version "1.2.8")

You only need to install [`net.creativecouple.validation:fast-isbn`](https://mvnrepository.com/artifact/net.creativecouple.validation/fast-isbn/latest)
as dependency in your Java/Kotlin/Scala project definition,

<details>
<summary>as Maven dependency in your <code>pom.xml</code>,</summary>

```xml
<dependencies>
    …
    <dependency>
        <groupId>net.creativecouple.validation</groupId>
        <artifactId>fast-isbn</artifactId>
        <version>1.2.8</version>
    </dependency>
</dependencies>
```
</details>
<details>
<summary>as Gradle dependency in your <code>build.gradle</code>,</summary>

```gradle
implementation group: 'net.creativecouple.validation', name: 'fast-isbn', version: '1.2.8'
```
</details>
<details>
<summary>or as Scala dependency in your <code>build.sbt</code>.</summary>

```scala
libraryDependencies += "net.creativecouple.validation" % "fast-isbn" % "1.2.8"
```
</details>

### Parsing

Now you can simply convert your strings into
[ISBN](https://javadoc.io/doc/net.creativecouple.validation/fast-isbn/latest/de/creativecouple/validation/isbn/ISBN.html) objects via:

```java
  ISBN isbn = ISBN.valueOf(someString);
```
This will potentially throw a `NumberFormatException` if the input string is not a valid ISBN.

You can get different string representations to be used e.g. in your databases:

```java
  ISBN isbn = ISBN.valueOf("978-0557504695"); // wrong hyphenation on amazon.com

  isbn.toString();        // standard representation = "978-0-557-50469-5"
  isbn.toCompactString(); // compact representation = "9780557504695"
  isbn.toIso2108();       // ISO-2108 representation = "ISBN 978-0-557-50469-5"
  
  isbn.getPrefix();          // EAN/UCC prefix = "978" 
  isbn.getPrefixName();      // EAN/UCC prefix's agency name = "International ISBN Agency" 
  isbn.getGroup();           // group code = "0" 
  isbn.getGroupPrefix();     // group's ISBN prefix = "978-0" 
  isbn.getGroupName();       // group's agency name = "English language" 
  isbn.getPublisher();       // publisher code = "557" 
  isbn.getPublisherPrefix(); // publisher's ISBN prefix = "978-0-557" 
  isbn.getTitle();           // title code = "50469" 
  isbn.getCheckdigit();      // checkdigit character = '5'

  isbn.toUri();              // URI("urn:isbn:9780557504695")
```

### Validating

If you only want to work with Strings instead of the ISBN object you can simply use the
[ISBNValidator](https://javadoc.io/doc/net.creativecouple.validation/fast-isbn/latest/de/creativecouple/validation/isbn/ISBNValidator.html)
to check them against the chosen rules. This is one of the 12 combinations of ISBN length (ISBN-10 / ISBN-13 / both)
and hyphenation style (any / correct / none / correct-or-none). 

```java
  ISBNValidator validator = ISBNValidator.isbn10().hyphenation(NONE);
        
  validator.isValid("978-0-557-50469-5"); // false
  validator.isValid("9780557504695"); // false
  validator.isValid("0-557-50469-4"); // false
  validator.isValid("0557504694"); // true
```

### Runtime updates

Since version 1.1.* you can call the static method

```java
ISBN.updateRangeDefinition();
```

to replace the built-in ISBN range definition with the latest version online.
For that your application must be able to make outgoing https calls
to `raw.githubusercontent.com`.

### Javadoc

Read the full Java docs online at
[javadoc.io/…/fast-isbn/latest/](https://javadoc.io/doc/net.creativecouple.validation/fast-isbn/latest/).

## Versioning

Our build pipeline regularly checks for new versions of the ISBN range definition provided by the
International ISBN Agency. When there are changes then a new version of this library will be deployed.

## Demo

You can find an online service using this validation at https://creativecouple.de/validation/isbn/ .

## Contribute

You can clone this repository locally and build as a standard maven project.
Feel free to open issues to this repository or create pull requests.

## Disclaimer

The MIT License (MIT)
Copyright (c) 2024 CreativeCouple

Permission is hereby granted, free of charge, to any person obtaining a copy of
this software and associated documentation files (the "Software"), to deal in
the Software without restriction, including without limitation the rights to
use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of
the Software, and to permit persons to whom the Software is furnished to do so,
subject to the following conditions:
 
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS
FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR
COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER
IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN
CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
