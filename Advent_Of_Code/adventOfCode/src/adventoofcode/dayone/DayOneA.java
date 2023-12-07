package adventoofcode.dayone;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/*
The newly-improved calibration document consists of lines of text;
each line originally contained a specific calibration value that the Elves now need to recover.
On each line, the calibration value can be found by combining the first digit and the last digit (in that order)
to form a single two-digit number.

For example:

1abc2
pqr3stu8vwx
a1b2c3d4e5f
treb7uchet

In this example, the calibration values of these four lines are 12, 38, 15, and 77. Adding these together produces 142.

Consider your entire calibration document. What is the sum of all of the calibration values?
 */
public class DayOneA {

    public static void main(String[] args) {

        String filePath = "/home/andre/Desktop/Advent_Of_Code/adventOfCode/adventofcode.com_2023_day_1_input.txt";

        ArrayList<String> linesFromFile = new ArrayList<>(1000);
        ArrayList<Integer> numbersFromLines = new ArrayList<>(1000);
        ArrayList<Integer> twoDigitsNumbers = new ArrayList<>(1000);

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

        /* ***************** TAKE ALL NUMBERS FROM LINES *********************** */

        for (String line : linesFromFile) {
            StringBuilder number = new StringBuilder();

            for (int i = 0; i < line.length(); i++) {

                if (Character.isDigit(line.charAt(i))) {
                    number.append(line.charAt(i));
                }
            }
            numbersFromLines.add(Integer.parseInt(number.toString()));
            }

        /* ***************** EXTRACT TWO DIGITS NUMBERS *********************** */

        for(int num: numbersFromLines){
            char[] fromNum = String.valueOf(num).toCharArray();
            char[] twoDigitChar = new char[2];
            twoDigitChar[0] = fromNum[0];
            twoDigitChar[1] = fromNum[fromNum.length - 1];
            twoDigitsNumbers.add(Integer.parseInt(String.valueOf(twoDigitChar)));
        }
        int sum = 0;

        for(int num: twoDigitsNumbers){
            sum += num;
        }

        System.out.println(sum);


    }

}



