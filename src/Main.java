import services.FileInfo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        FileInfo fileInfo = new FileInfo();
        System.out.println("============= Writer Program ===============");
        System.out.println("Do you want write file?(Y/N or y/n):");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();
        if(answer.equalsIgnoreCase("y")){
            System.out.print("Please input path file: ");
            String path = sc.nextLine();
            System.out.println("Please input content file: ");
            System.out.print("Content input here: ");
            String content = sc.nextLine();
            fileInfo.writeFile(path,content);
        }else if(answer.equalsIgnoreCase("n")){
            System.out.println("Thanks you!");
        }else {
            System.out.println("Invalid input error!");
        }

        System.out.println("Do you want read file?(Y/N or y/n):");
        String answer1 = sc.nextLine();
        if(answer1.equalsIgnoreCase("y")){
            System.out.print("Please input path file: ");
            String path = sc.nextLine();
            fileInfo.readFile(path);
        }else if(answer1.equalsIgnoreCase("n")){
            System.out.println("Thanks you!");
        }else {
            System.out.println("Invalid input error!");
        }
    }
}
