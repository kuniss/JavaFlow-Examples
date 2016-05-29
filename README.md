# JavaFlow Examples
This repository collects arbitrary examples implemented in Java which follows the Flow Design paradigm and the IODA Architecture by Ralf Westphal.

All examples are implemented in Java 8 applying the new lambda notation extensively. 

Currently only one example has been implemented - [ConvertRoman](https://github.com/kuniss/JavaFlow-Examples/tree/master/ConvertRoman).

## [CovertRoman](https://github.com/kuniss/JavaFlow-Examples/tree/master/ConvertRoman)

This example implements a conversion from and to roman numerals. It implements closely the design described in Ralf Westpahl's [article "IODA Architecture by Example"](http://geekswithblogs.net/theArchitectsNapkin/archive/2015/05/02/ioda-architecture-by-example.aspx) making this implementation comparable to the C# based implementation made by him and within better comprehensible.

In general, the example implements the follwing flow chart:

![FlowChart](https://gwb.blob.core.windows.net/thearchitectsnapkin/Windows-Live-Writer/df23fce65724_C742/image_15.png)

The following shows the implementation of the [*Convert* method](ConvertRoman/src/de/grammarcraft/javaflow/examples/convertroman/operations/conversions/RomanConversions.java) and the main [*run* method](ConvertRoman/src/de/grammarcraft/javaflow/examples/convertroman/integration/head/Head.java):

![Java implementation of Convert and Run methods](http://blog.grammarcraft.de/wp-content/uploads/2016/05/JavaFlow-Body-Head-methods.jpg)

This is quite similar to Ralf's C# implementation:
![C# implementation of Convert and Run methods](https://gwb.blob.core.windows.net/thearchitectsnapkin/Windows-Live-Writer/df23fce65724_C742/image_thumb_13.png)

I plan to write a detailed [blog](http://blog.grammarcraft.de) post on this example as well as Flow Design and IODA Architectur applied to Java, in general - stay tuned and follow me. 
