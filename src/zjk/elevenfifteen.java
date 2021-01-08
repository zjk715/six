package zjk;

import java.util.Scanner;
import java.util.ArrayList;


public class elevenfifteen
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of the points: ");
        int number = input.nextInt();

        ArrayList<Point2D> points = enterPoints(number);
        double area = getArea(points);  
        System.out.println(area);
    }

    public static ArrayList<Point2D> enterPoints(int number)
    {
        Scanner input = new Scanner(System.in);
        ArrayList<Point2D> points = new ArrayList<>();
        System.out.print("Enter the coordinates of points: ");
        for (int i = 0; i < number; i++)
        {
            points.add(new Point2D((input.nextDouble()), (input.nextDouble())));
        }

        return points;
    }

