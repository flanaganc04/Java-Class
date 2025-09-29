import java.util.Scanner;

public class CharacterFrequencyTwo {

        // Variables that will hold the values of the total digits
        private int zeroSum = 0;
        private int oneSum = 0;
        private int twoSum = 0;
        private int threeSum = 0;
        private int fourSum = 0;
        private int fiveSum = 0;
        private int sixSum = 0;
        private int sevenSum = 0;
        private int eightSum = 0;
        private int nineSum = 0;

        /*  Variables to convert a raw phone number into a workable number, could add one more step to remove any '+' signs used in the number as well but I am american so...*/
        private String rawNumber;
        private String trimmedNumb;
        private String[] nohyphen;
        private String phoneNumber;
        private char[] numbers;

        /*Methods to set and alter the phone number */
        public void setRawNumber() {

            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter a phone number (it can include hyphens in between the numbers and spaces at the beginning or the end)");
            rawNumber = keyboard.nextLine();
        }

        public String getRawNumber() {
            return rawNumber;
        }

        public void trimNumb() {
            trimmedNumb = getRawNumber().trim();
        }

        public String trimmedNumb() {
            return trimmedNumb;
        }

        public void dehyphenate() {
            nohyphen = trimmedNumb().split("-");
        }

        public String[] dephyphenated() {
            return nohyphen;
        }
        
        public void setPhoneNumber() {
            phoneNumber = "";
            for(int i = 0; i < dephyphenated().length; i++) {
                phoneNumber += dephyphenated()[i];
            }
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setNumbers() { 
            numbers = getPhoneNumber().toCharArray();
        }

        public char[] getNumber() {
            return numbers;
        }

        // Quick Set all methods to set a phone number
        public void quickSet() {
            getRawNumber();
            trimNumb();
            dehyphenate();
            setPhoneNumber();
            setNumbers();
        }
          
        /*  Method to parse a number of any size and count the number of digits within, this is also technically the method that set the values for the sum private variables*/
        public void parseNumber() {
            for(int i = 0; i < numbers.length; i++){
                if (numbers[i] == '0') {
                    zeroSum = zeroSum + 1;
                }
                else if(numbers[i] == '1') {
                    oneSum += 1;
                }
                else if(numbers[i] == '2') {
                    twoSum += 1;
                }
                else if(numbers[i] == '3') {
                    threeSum += 1;
                }
                else if(numbers[i] == '4') {
                    fourSum += 1;
                }
                else if(numbers[i] == '5') {
                    fiveSum += 1;
                }
                else if(numbers[i] == '6') {
                    sixSum += 1;
                }
                else if(numbers[i] == '7') {
                    sevenSum += 1;
                }
                else if(numbers[i] == '8') {
                    eightSum += 1;
                }
                else if(numbers[i] == '9') {
                    nineSum += 1;
                }
            }
        }

        /*Mehtod to print totals */
        public void printTotals() {
            System.out.println("The sum of the Zeros in your number is " + zeroSum);
            System.out.println("The sum of the Ones in your number is " + oneSum);
            System.out.println("The sum of the Twos in your number is " + twoSum);
            System.out.println("The sum of the Threes in your number is " + threeSum);
            System.out.println("The sum of the Fours in your number is " + fourSum);
            System.out.println("The sum of the Fives in your number is " + fiveSum);
            System.out.println("The sum of the Sixes in your number is " + sixSum);
            System.out.println("The sum of the Sevens in your number is " + sevenSum);
            System.out.println("The sum of the Eights in your number is " + eightSum);
            System.out.println("The sum of the Nines in your number is " + nineSum);
            
        }


        public static void main(String[] args) {
            CharacterFrequencyTwo firstTry = new CharacterFrequencyTwo();

            firstTry.setRawNumber();

            firstTry.quickSet();

            

            firstTry.parseNumber();

            firstTry.printTotals();

            CharacterFrequencyTwo secondTry = new CharacterFrequencyTwo();

            secondTry.setRawNumber();

            secondTry.quickSet();

            

            secondTry.parseNumber();

            secondTry.printTotals();


            
        }
        
}
