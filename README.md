# ISBN Validation

A common issue in digital commerce systems is to validate article identifiers.
In the publishing business there is the so-called ISBN standard, maintained by the
[International ISBN Agency](https://www.isbn-international.org/).
By using its official ISBN range definitions this library offers up-to-date ISBN validation
beyond simply comparing the EAN-13 checkdigit.

All number ranges that are not yet assigned to a local ISBN agency or
which have no group range defined will be treated as invalid.
The dashes will be inserted automatically at the correct positions for grouping the
agency prefix, group code, publisher code, and title code.

Example:
- ❌ wrong grouping: 978-05-5750-469-5 or 978-0557504695 (on amazon.com)
- ✅ correct grouping: 978-0-557-50469-5

The `ISBN` domain object wraps the ISBN string representation efficiently to be used
as identifier in your domain-driven code base.
It normalizes the given string input with respect to dashes and whitespace,
parsing both ISBN-10 and ISBN-13 numbers into the same object, the `ISBN`. 

## Usage

Once you add the dependency to your project definition,
you can simply convert your strings into `ISBN` objects via:

```java
  ISBN isbn = ISBN.valueOf(someString)
```

This will potentially throw a `NumberFormatException` if the input string is not a valid ISBN.

You can get different string representations to be used e.g. in your databases:

```java
  ISBN isbn = ISBN.valueOf("978-0557504695"); // wrong hyphenation on amazon.com

  isbn.toString();        // standard representation = "978-0-557-50469-5"
  isbn.toCompactString(); // compact representation = "9780557504695"
  
  isbn.getPrefix();          // EAN/UCC prefix = "978" 
  isbn.getAgencyName();      // EAN/UCC prefix's agency name = "International ISBN Agency" 
  isbn.getGroup();           // group code = "0" 
  isbn.getGroupPrefix();     // group's ISBN prefix = "978-0" 
  isbn.getGroupName();       // group's agency name = "English language" 
  isbn.getPublisher();       // publisher code = "557" 
  isbn.getPublisherPrefix(); // publisher's ISBN prefix = "978-0-557" 
  isbn.getTitle();           // title code = "50469" 
  isbn.getCheckdigit();      // checkdigit character = '5' 
```

## Local development

You can clone this repository locally and build as a standard maven project. 

### Generate a new ISBN range definition

1. Download the ISBN ranges as XML file from: https://www.isbn-international.org/range_file_generation.
1. Name the downloaded file `RangeMessage.xml` and put it into the local directory `generate`.
1. From within `generate` directory, run the shell command:
`java GenerateIsbnRanges.java < RangeMessage.xml > ../src/main/java/de/creativecouple/validation/isbn/ISBNRanges.java`
1. From the project directory run `mvn clean test`

The formatter plugin will auto-format all source files during the maven run.
So you are able to easily spot the differences since the previous version.
