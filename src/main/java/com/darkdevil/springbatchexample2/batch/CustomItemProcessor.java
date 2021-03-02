package com.darkdevil.springbatchexample2.batch;

import com.darkdevil.springbatchexample2.model.Tutorial;
import org.springframework.batch.item.ItemProcessor;

// Implementing the ItemProcessor interface
public class CustomItemProcessor implements ItemProcessor<Tutorial, Tutorial> {

    @Override
    public Tutorial process(Tutorial item) throws Exception {
        System.out.println("Processing..." + item);
        return item;
    }
}