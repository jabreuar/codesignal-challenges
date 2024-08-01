package exercises;

public class ElementsProduct {
    public int adjacentElementsProduct(int[] inputArray) {
        int highestProduct = Integer.MIN_VALUE;
        for (int i = 0; i < inputArray.length - 1; i++) {
            int product = inputArray[i] * inputArray[i + 1];
            if(product > highestProduct) {
                highestProduct = product;
            }
        }
        return highestProduct;
    }
}
