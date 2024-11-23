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
     * @param firstname
     * @param lastName
     * @return firstname + " " + lastName
     */
    public static String printFullName(String firstname, String lastName) {
        return firstname + " " + lastName;
    }

    /**
     * A method that takes an array of strings and returns
     * a new array consisting of two elements.
     * @author Ptica
     * @param valuesArray
     * @return Strings[] minMax {minimum , maximum }
     */
    public static String[] cornerValuesArray(String... valuesArray) {
        if (valuesArray.length == 0) {
            return null;
        }
        String[] valuesArrayMinMax = new String[2];
        int max = 0;
        int min = 0;
        for (int i = 0; i < valuesArray.length; i++) {
            if (valuesArray[i] != null) {
                min = valuesArray[i].length();
                for (int j = i + 1; j < valuesArray.length; j++) {
                    if (valuesArray[j] != null) {
                        max = valuesArray[j].length();
                    }
                }
                break;
            }
        }
        for (String s : valuesArray) {
            if (s == null) {
                continue;
            }
            if (s.length() >= max) {
                valuesArrayMinMax[1] = s;
                max = s.length();
            } else if (s.length() <= min) {
                valuesArrayMinMax[0] = s;
                min = s.length();
            }
        }

        return valuesArrayMinMax;

    }

    /**
     * A method that takes an array of int and returns
     * a new array consisting of two elements.
     * @author Ptica
     * @return int[] minMax {minimum , maximum }
     */
    public static int[] cornerValuesArray(int... valuesArray) {
        if (valuesArray.length == 0) {
            return null;
        }
        int max = valuesArray[0];
        int min = valuesArray[0];
        int[] valuesArrayMinMax = new int[2];
        for (int s : valuesArray) {
            if (s > max) {
                valuesArrayMinMax[1] = s;
                max = s;
            } else if (s <= min) {
                valuesArrayMinMax[0] = s;
                min = s;
            }
        }
        return valuesArrayMinMax;
    }


    /**
     * A method that takes an array of char and returns
     * a new array consisting of two elements.
     * @author Ptica
     * @param valuesArray
     * @return char [] minMax {minimum , maximum }
     */
    public static char[] cornerValuesArray(char... valuesArray) {
        if (valuesArray.length == 0) {
            return null;
        }
        char[] valuesArrayMinMax = new char[2];
        char ValuesArrayMax = valuesArray[0];
        char ValuesArrayMin = valuesArray[0];

        for (char sC : valuesArray) {
            if (sC > ValuesArrayMax) {
                valuesArrayMinMax[1] = sC;
                ValuesArrayMax = sC;
            } else if (sC <= ValuesArrayMin) {
                valuesArrayMinMax[0] = sC;
                ValuesArrayMin = sC;
            }
        }


        return valuesArrayMinMax;

    }

    public static int facktorial(int factor) {
        if (factor == 1) {
            return 1;
        } else {
            return factor * facktorial(factor - 1);

        }
    }
}


