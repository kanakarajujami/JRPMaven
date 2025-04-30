package com.nt.controller;



import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WishMessageController {

    @GetMapping("/div")
    public ResponseEntity<String> division(){

        log.info("===beginning of division() method===");
        try{
            log.info("performing arithmetic operation ");
            int div=100/0;
            log.info("arithmetic operation is completed");
            return new ResponseEntity<String>("divsion value:"+div,HttpStatus.ACCEPTED);
        }catch(Exception e){
            e.printStackTrace();
            log.info("problem in arithmetic operation:"+e.getMessage());


           return new ResponseEntity<String>("problem:"+e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
