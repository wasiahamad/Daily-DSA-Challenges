class Day87_AddBinary {
    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0; 

        while (i >= 0 || j >= 0) {
            int sum = carry; 
            
            // Add bit from string a if available
            if (i >= 0) {
                sum += a.charAt(i) - '0';  
                i--;
            }

            // Add bit from string b if available
            if (j >= 0) {
                sum += b.charAt(j) - '0'; 
                j--;
            }

            // Append the current bit (sum % 2) to the result
            result.append(sum % 2);
            
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }

    public static void main(String[] args) {
        Day87_AddBinary solution = new Day87_AddBinary();
        String a = "1010";
        String b = "1101";
        System.out.println("Sum of " + a + " and " + b + " is: " + solution.addBinary(a, b)); // Output: 10111
    }
}