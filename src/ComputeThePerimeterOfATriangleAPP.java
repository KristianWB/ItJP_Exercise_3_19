import java.util.Scanner;

public class ComputeThePerimeterOfATriangleAPP {
    public static void main(String[] args)   {
        Scanner input = new Scanner(System.in);

        System.out.print(
                "Please enter the edges of the triangle in succession\n"
        );

        System.out.print(
                "edge AB: "
        );
        double edgeAB = input.nextDouble();
        System.out.print(
                "edge BC: "
        );
        double edgeBC = input.nextDouble();
        System.out.print(
                "edge CA: "
        );
        double edgeCA = input.nextDouble();

        double sumABBC = edgeAB + edgeBC;
        double sumBCCA = edgeBC + edgeCA;
        double sumCAAB = edgeCA + edgeAB;

        if (sumABBC > edgeCA && sumBCCA > edgeAB && sumCAAB > edgeBC)
            System.out.print(
                    "The perimeter of the triangle is: " + (edgeAB + edgeBC + edgeCA)
            );
        else
            System.out.print(
                    "The input is invalid"
            );
    }
}
