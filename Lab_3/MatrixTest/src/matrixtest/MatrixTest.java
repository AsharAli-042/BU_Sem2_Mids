package matrixtest;
import java.util.Scanner;

public class MatrixTest {


        // Method to take input for a 3x3 matrix
    public static void inputMatrix(int[][] matrix, String name) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for " + name + " (3x3 matrix):");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter element [" + (i+1) + "][" + (j+1) + "]: ");
                matrix[i][j] = input.nextInt();
            }
        }
        System.out.println();
    }

    // Method to multiply two 3x3 matrices
    public static int[][] multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3]; // Resultant matrix after multiplication
        
        // Perform matrix multiplication
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return result;
    }

    // Method to square a matrix: (Matrix^2)
    public static int[][] squareMatrix(int[][] matrix) {
        return multiplyMatrices(matrix, matrix);
    }

    // Method to raise a matrix to a power
    public static int[][] powerMatrix(int[][] matrix, int power) {
        int[][] result = matrix;
        
        // Multiply the matrix with itself 'power' times
        for (int i = 1; i < power; i++) {
            result = multiplyMatrices(result, matrix);
        }
        return result;
    }

    // Method to add two 3x3 matrices
    public static int[][] addMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        
        // Perform matrix addition
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        return result;
    }

    // Method to subtract a scalar from each element of the matrix
    public static int[][] subtractScalar(int[][] matrix, int scalar) {
        int[][] result = new int[3][3];
        
        // Subtract scalar value from each element of the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix[i][j] - scalar;
            }
        }
        return result;
    }

    // Method to subtract two matrices
    public static int[][] subtractMatrices(int[][] matrix1, int[][] matrix2) {
        int[][] result = new int[3][3];
        
        // Perform matrix subtraction
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                result[i][j] = matrix1[i][j] - matrix2[i][j];
            }
        }
        return result;
    }

    // Method to print a matrix
    public static void printMatrix(int[][] matrix, String name) {
        System.out.println(name + ":");
        
        // Print each element of the matrix
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Declare two 3x3 matrices Mat_1 and Mat_2
        int[][] Mat_1 = new int[3][3];
        int[][] Mat_2 = new int[3][3];

        // Take input for Mat_1 and Mat_2
        inputMatrix(Mat_1, "Mat_1");
        inputMatrix(Mat_2, "Mat_2");

        // Equation 1: (Mat_1^3) + (Mat_2^2)
        int[][] Mat_1_cube = powerMatrix(Mat_1, 3); // Mat_1^3
        int[][] Mat_2_square = squareMatrix(Mat_2); // Mat_2^2
        int[][] result1 = addMatrices(Mat_1_cube, Mat_2_square); // (Mat_1^3) + (Mat_2^2)
        printMatrix(result1, "(Mat_1^3) + (Mat_2^2)");

        // Equation 2: (Mat_2 - 3)^2
        int[][] Mat_2_minus_3 = subtractScalar(Mat_2, 3); // Mat_2 - 3
        int[][] result2 = squareMatrix(Mat_2_minus_3); // (Mat_2 - 3)^2
        printMatrix(result2, "(Mat_2 - 3)^2");

        // Equation 3: (Mat_2^5) - (Mat_1 - 2)
        int[][] Mat_2_pow5 = powerMatrix(Mat_2, 5); // Mat_2^5
        int[][] Mat_1_minus_2 = subtractScalar(Mat_1, 2); // Mat_1 - 2
        int[][] result3 = subtractMatrices(Mat_2_pow5, Mat_1_minus_2); // (Mat_2^5) - (Mat_1 - 2)
        printMatrix(result3, "(Mat_2^5) - (Mat_1 - 2)");
    
    }   
}
