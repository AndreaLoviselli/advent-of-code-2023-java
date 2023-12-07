package adventoofcode.dayone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
Your calculation isn't quite right. It looks like some of the digits are actually spelled out with letters:
one, two, three, four, five, six, seven, eight, and nine also count as valid "digits".

Equipped with this new information, you now need to find the real first and last digit on each line. For example:

two1nine
eightwothree
abcone2threexyz
xtwone3four
4nineeightseven2
zoneight234
7pqrstsixteen

In this example, the calibration values are 29, 83, 13, 24, 42, 14, and 76.
 Adding these together produces 281.

What is the sum of all of the calibration values?
 */
public class DayOneB {
    public static void main(String[] args) {


    String filePath = "/home/andre/Desktop/advent_of_code/advent-of-code-2023-java/Advent_Of_Code/adventOfCode/adventofcode.com_2023_day_1_input.txt";

    ArrayList<String> linesFromFile = new ArrayList<>(1000);

    /* ***************** TAKE LINES FROM FILE.TXT *********************** */

            try (   FileReader fileReader = new FileReader(filePath);
    BufferedReader bufferedReader = new BufferedReader(fileReader);
                    ){

        String line;

        while((line = bufferedReader.readLine()) != null){
            linesFromFile.add(line);
        }

    } catch (IOException e){
        e.printStackTrace();
    }
            for(String line: linesFromFile){
                System.out.println(line);
            }
    }
}
