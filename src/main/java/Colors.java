import java.util.ArrayList;
import java.util.List;

public class Colors {
/*    Create a list of colors with the following values: White, Red, Black, Pink, Blue.
      From that list extract only the values white and black and store these values in a new list.
      Print also the size of the new list.
*/

    public static List<String> extractSpecificColors(List<String> colorList, String colorOption1, String colorOption2) {
        List<String> result = new ArrayList<>();
        for (String color : colorList) {
            if (color.equalsIgnoreCase(colorOption1) || color.equalsIgnoreCase(colorOption2)) {
                result.add(color);
            }
        }
        return result;

    }


    public static void main(String[] args) {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("red");
        colors.add("black");
        colors.add("pink");
        colors.add("blue");

        System.out.println(colors);

        List<String> filteredColors = extractSpecificColors(colors, "white", "black");
        System.out.println("Filtered colors: " + filteredColors);
        System.out.println("Size of filtered list: " + filteredColors.size());


    }
}








