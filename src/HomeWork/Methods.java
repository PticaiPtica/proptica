package HomeWork;

public class Methods {
    /**
     *the method takes a single integer
     *  and returns its square
     * @param value
     * @return value * value
     */
    public static int square(int value) {
        return value * value;
    }

    /**
     * a method that takes two String type parameters — first name and last name — and outputs
     * the full name in the format:
     * "Full name: First name Last First name"
     * @param FirstName
     * @param LastName
     * @return FirstName + " " + LastName
     */
    public static String printFullName(String FirstName, String LastName) {
        return FirstName + " " + LastName;
    }

    /**
     * A method that takes an array of strings and returns
     * a new array consisting of two elements.
     * @author Ptica
     * @param ValuesArray
     * @return Strings[] minMax {minimum , maximum }
     */
    public static String[] cornerValuesArray(String... ValuesArray) {

        int max = ValuesArray[1].length();
        int min = ValuesArray[0].length();
        String[] ValuesArrayMinMax = new String[2];
        if (max < min) {
            for (String s : ValuesArray) {

                if (s.length() > max) {
                    ValuesArrayMinMax[1] = s;
                    max = s.length();
                } else if (s.length() <= min) {
                    ValuesArrayMinMax[0] = s;
                    min = s.length();
                }
            }
        } else if (max > min) {
            max = ValuesArray[0].length();
            min = ValuesArray[1].length();
            for (String s : ValuesArray) {

                if (s.length() >= max) {
                    ValuesArrayMinMax[1] = s;
                    max = s.length();
                } else if (s.length() < min) {
                    ValuesArrayMinMax[0] = s;
                    min = s.length();
                }
            }
        }
        return ValuesArrayMinMax;
    }

    /**
     * A method that takes an array of int and returns
     * a new array consisting of two elements.
     * @author Ptica
     * @param ValuesArray
     * @return int[] minMax {minimum , maximum }
     */
    public static int[] cornerValuesArray(int... ValuesArray) {
        int max = ValuesArray[1];
        int min = ValuesArray[0];
        int[] ValuesArrayMinMax = new int[2];
        if (max < min) {
            for (int s : ValuesArray) {
                if (s > max) {
                    ValuesArrayMinMax[1] = s;
                    max = s;
                } else if (s <= min) {
                    ValuesArrayMinMax[0] = s;
                    min = s;
                }
            }
        } else if (max > min) {
            max = ValuesArray[0];
            min = ValuesArray[1];
            for (int s : ValuesArray) {
                if (s >= max) {
                    ValuesArrayMinMax[1] = s;
                    max = s;
                } else if (s < min) {
                    ValuesArrayMinMax[0] = s;
                    min = s;
                }
            }
        }
        return ValuesArrayMinMax;
    }

    /**
     * A method that takes an array of char and returns
     * a new array consisting of two elements.
     * @author Ptica
     * @param ValuesArray
     * @return char [] minMax {minimum , maximum }
     */
    public static char[] cornerValuesArray(char... ValuesArray) {
        char ValuesArrayMax = ValuesArray[1];
        char ValuesArrayMin = ValuesArray[0];
        char[] ValuesArrayMinMax = new char[2];
        if (ValuesArrayMax < ValuesArrayMin) {
            for (char s : ValuesArray) {
                if (s > ValuesArrayMax) {
                    ValuesArrayMinMax[1] = s;
                    ValuesArrayMax = s;
                } else if (s <= ValuesArrayMin) {
                    ValuesArrayMinMax[0] = s;
                    ValuesArrayMin = s;
                }
            }
        } else if (ValuesArrayMax > ValuesArrayMin) {
            ValuesArrayMax = ValuesArray[0];
            ValuesArrayMin = ValuesArray[1];
            for (char s : ValuesArray) {
                if (s >= ValuesArrayMax) {
                    ValuesArrayMinMax[1] = s;
                    ValuesArrayMax = s;
                } else if (s < ValuesArrayMin) {
                    ValuesArrayMinMax[0] = s;
                    ValuesArrayMin = s;
                }
            }
        }
        return ValuesArrayMinMax;

    }


}






