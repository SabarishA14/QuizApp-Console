package com.sab;

import java.util.Scanner;

public class QuestionService {

    Questions[] que = new Questions[5];

    public QuestionService(){
        que[0] = new Questions(1,"What is capital of Japan?","A. Beijing","B. Delhi","C.Tokyo","D. New York","Tokyo");
        que[1] = new Questions(2,"Which planet is known as the Red Planet?","A. Mercury","B. Venus","C. Earth","D. Mars","Mars");
        que[2] = new Questions(3,"Who wrote Romeo and Juliet?","A. William Shakesphere","B. Charles Dickins","C. Leo","D. Mark Twain","William Shakesphere");
        que[3] = new Questions(4,"How many days are there in a leap year?","A. 333","B. 365","C. 366","D. 265","366");
        que[4] = new Questions(5,"What is the largest land animal?","A. Rat","B. Lion","C. Elephant","D. Hippo","Elephant" );
    }

    Scanner sc = new Scanner(System.in);

    public void playQuiz(){

        int score = 0;

        int i = 0;
        for(Questions q : que){
            System.out.print(q.getqId() + ": ");
            System.out.println(q.getQuestions());
            System.out.print("    "+q.getOpt1());
            System.out.println("    "+q.getOpt2());
            System.out.print("    "+q.getOpt3());
            System.out.println("    "+q.getOpt4());

            String anns = sc.nextLine();

            if(anns.equals(q.getAns())){
                score++;
            }

            System.out.println("WELL DONE !!!");

            System.out.println("Your score is: "+score+"/5");


        }

    }
}
