package com.darkdevil.springbatchexample2.main;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) throws Exception {

        String[] springConfig  =  { "jobConfig.xml", "Context.xml" };

        // Creating the application context object
        ApplicationContext context = new ClassPathXmlApplicationContext(springConfig);

        // Creating the job launcher
        JobLauncher jobLauncher = (JobLauncher) context.getBean("jobLauncher");

        // Creating the job
        Job job = (Job) context.getBean("helloWorldJob");

        // Executing the JOB
        JobExecution execution = jobLauncher.run(job, new JobParameters());
        System.out.println("Exit Status : " + execution.getStatus());





//        try {
//            File myObj = new File("jobConfig.xml");
//            if (myObj.createNewFile()) {
//                System.out.println("File created: " + myObj.getName());
//            } else {
//                System.out.println("File already exists.");
//            }
//        } catch (IOException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }




//        try {
//            File myObj = new File("jobConfig.xml");
//
//            Scanner myReader = new Scanner(myObj);
//            while (myReader.hasNextLine()) {
//                String data = myReader.nextLine();
//                System.out.println(data);
//            }
//            myReader.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("An error occurred.");
//            e.printStackTrace();
//        }
    }
}