public class PracticeProblem {

	public static void main(String args[]) {
        // Test data
        String[] names = {"Charlie", "alice", "Bob", "diana"};
        int[] ages = {25, 30, 20, 28};
        
        System.out.println("Original:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + ages[i]);
        }
        
        // Test sorting by name
        selectionSortName(names, ages);
        System.out.println("\nSorted by name:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " - " + ages[i]);
        }
        
        // Reset and test sorting by age
        String[] names2 = {"Charlie", "alice", "Bob", "diana"};
        int[] ages2 = {25, 30, 20, 28};
        
        selectionSortAge(names2, ages2);
        System.out.println("\nSorted by age:");
        for (int i = 0; i < names2.length; i++) {
            System.out.println(names2[i] + " - " + ages2[i]);
        }
    }
    
    // Sort by names (alphabetically)
    public static void selectionSortName(String[] names, int[] ages) {
        for (int i = 0; i < names.length - 1; i++) {
            int minIndex = i; // Assume current position has the smallest name
            
            // Find the actual smallest name from remaining elements
            for (int j = i + 1; j < names.length; j++) {
                if (names[j].compareToIgnoreCase(names[minIndex]) < 0) {
                    minIndex = j; // Found a smaller name
                }
            }
            
            // Swap names
            String tempName = names[i];
            names[i] = names[minIndex];
            names[minIndex] = tempName;
            
            // Swap ages (keep parallel)
            int tempAge = ages[i];
            ages[i] = ages[minIndex];
            ages[minIndex] = tempAge;
        }
    }
    
    // Sort by ages (numerically)
    public static void selectionSortAge(String[] names, int[] ages) {
        for (int i = 0; i < ages.length - 1; i++) {
            int minIndex = i; // Assume current position has the smallest age
            
            // Find the actual smallest age from remaining elements
            for (int j = i + 1; j < ages.length; j++) {
                if (ages[j] < ages[minIndex]) {
                    minIndex = j; // Found a smaller age
                }
            }
            
            // Swap ages
            int tempAge = ages[i];
            ages[i] = ages[minIndex];
            ages[minIndex] = tempAge;
            
            // Swap names (keep parallel)
            String tempName = names[i];
            names[i] = names[minIndex];
            names[minIndex] = tempName;
        }
    }
}
	
