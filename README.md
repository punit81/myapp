This is a program to test efficiency ofString,StringBuffer and StringBuilder Concatenation operation(i.e over 24 concatenations) and calculate their execution timings.

Steps to run this project.

1.Clone this project.
2.Open command prompt
3.Go inside Maventesting folder
4.run following commands:
$> mvn compile
$> mvn package
$> java -cp target/Maventesting-1.0-SNAPSHOT.jar com.punit.MavenTesting.App

Your output will be something like this:

This is a program to test efficiency ofString,StringBuffer and StringBuilder Concatenation operation(i.e over 24 concatenations)
This is the sample string for concatenation:Hello
Time taken by String to concatenate 24 times is:1721212ms
Time taken by StringBuffer to concatenate 24 times is:748815ms
Time taken by StringBuilder to concatenate 24 times is:577437ms
$>

