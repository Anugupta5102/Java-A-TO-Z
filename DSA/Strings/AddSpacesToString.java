package DSA.Strings;
public class AddSpacesToString {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder result = new StringBuilder();
        int spaceIndex = 0; // Pointer for spaces array
        int n = spaces.length;

        for (int i = 0; i < s.length(); i++) {
            // If the current index matches the space index, add a space
            if (spaceIndex < n && i == spaces[spaceIndex]) {
                result.append(" ");
                spaceIndex++;
            }
            // Append the current character
            result.append(s.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "EnjoyYourCoffee";
        int[] spaces = {5, 9};
        String modifiedString = addSpaces(s, spaces);
        System.out.println(modifiedString); // Output: "Enjoy Your Coffee"
    }
}
