//package com.example.springprojectkanat.Test;
//
//import com.example.springprojectkanat.model.Customers;
//import com.example.springprojectkanat.repo.CustomerRepository;
//import lombok.AllArgsConstructor;
//
//import java.util.Optional;
//import java.util.Scanner;
//@AllArgsConstructor
//public class TestForLevel {
//    CustomerRepository repository;
//    Customers customers;
//
//
//    //    double x = Math.random() * 100;
////    private int point = (int) x;
////
////    public int defineLevel(){
////        return point;
////    }
//
//
//
//
//
//
////    String day = "Thursday";
////
////switch (day) {
////        case "Monday":
////            System.out.println("Today is windy !");
////            break;
////        case "Thursday":
////            System.out.println("Today is sunny !");
////            break;
////        case "Wednesday":
////            System.out.println("Today is rainy!");
////            break;
////        default:
////            System.out.println("Oooops, something wrong !");
////    }
//    int count = 0;
//
//
//
//
//    public static int defineLevel(Customers customers){
//        System.out.println("My manager has recently informed me that I will ____ redundant.\nget\nbe made\nmake\nbe forced");
//        Scanner scanner1 = new Scanner(System.in);
//        String writedAnswer1 = scanner1.nextLine();
//        switch (writedAnswer1){
//            case "get":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: be made");
//                break;
//            case "be made":
//                System.out.println("Excellent");
//                count = count + 20;
//                break;
//            case "make":
//                System.out.println("Oooops, something wrong !");
//               System.out.println("Correct answer: be made");
//                break;
//            case "be forced":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: be made");
//                break;
//            default:
//            System.out.println("Oooops, something wrong !");
//            System.out.println("Correct answer: be made");
//        }
//
//        System.out.println("");
//
//        System.out.println("He was _____ upset, but he was also hungry.\nnot\nneither\nboth\nnot only");
//        Scanner scanner2 = new Scanner(System.in);
//        String writedAnswer2 = scanner2.nextLine();
//        switch (writedAnswer2){
//            case "not":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: not only");
//                break;
//            case "not only":
//                System.out.println("Excellent");
//                count = count + 20;
//                break;
//            case "both":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: not only");
//                break;
//            case "neither":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: not only");
//                break;
//            default:
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: not only");
//        }
//
//        System.out.println("");
//
//        System.out.println("When I was a child I ______ go to the country every summer.\nused\nwould\nwas used\ngot used");
//        Scanner scanner3 = new Scanner(System.in);
//        String writedAnswer3 = scanner3.nextLine();
//        switch (writedAnswer3){
//            case "used":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: would");
//                break;
//            case "would":
//                System.out.println("Excellent");
//                count = count + 20;
//                break;
//            case "was used":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: would");
//                break;
//            case "got used":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: would");
//                break;
//            default:
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: would");
//        }
//
//        System.out.println("");
//
//
//        System.out.println("I _____ to the airport tomorrow morning anyway so i can give you a lift.\ndrive\nam driving\nwill drive\nwill be driving");
//        Scanner scanner4 = new Scanner(System.in);
//        String writedAnswer4 = scanner4.nextLine();
//        switch (writedAnswer4){
//            case "drive":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: will be driving");
//                break;
//            case "will be driving":
//                System.out.println("Excellent");
//                count = count + 20;
//                break;
//            case "am driving":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: will be driving");
//                break;
//            case "will drive":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: will be driving");
//                break;
//            default:
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: will be driving");
//        }
//
//        System.out.println("");
//
//        System.out.println("I have no idea where she is. She _____ be waiting for us outside the pub.\nwill\nmust\nshould\nhas to");
//        Scanner scanner5 = new Scanner(System.in);
//        String writedAnswer5 = scanner5.nextLine();
//        switch (writedAnswer5){
//            case "will":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: should");
//                break;
//            case "should":
//                System.out.println("Excellent");
//                count = count + 20;
//                break;
//            case "must":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: should");
//                break;
//            case "has to":
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: should");
//                break;
//            default:
//                System.out.println("Oooops, something wrong !");
//                System.out.println("Correct answer: should");
//        }
//        System.out.println("");
//
//
//        Optional<Customers> customers1 = repository.findById(customers.getId());
//        Customers customersForSave = new Customers();
//        customersForSave.setResulOfTest(count);
//        return count;
//    }
//}
