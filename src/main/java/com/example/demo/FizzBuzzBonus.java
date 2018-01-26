package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FizzBuzzBonus {

    @RequestMapping("/bonus")
    public String fizzbuzzi(){
        String finalResult="";
        int ct7=0, ct17=0, ct23=0;

        for(int i = 1 ; i <=100; i++){
            System.out.println(i);
            if ( i % 3  == 0 ){
                finalResult+= "fizz";}
            if (i % 5 == 0 ){
                finalResult+= ("buzz");}
            if ( i % 3== 0 && i % 5 == 0){
                finalResult+= "fizzbuzz";
            }
            if ( i % 7 == 0 )
                ct7++;
            if ( i % 7 == 0 )
                ct17++;
            if ( i % 7 == 0 )
                ct23++;

        }


        return finalResult + "  "+String.valueOf(ct7)+ "  "+String.valueOf(ct17)+ "  "+String.valueOf(ct23);

    }


}