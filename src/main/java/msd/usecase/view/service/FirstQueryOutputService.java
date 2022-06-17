package msd.usecase.view.service;

/**
 * Created by bhagat on 5/20/19.
 */

import java.util.List;

import msd.usecase.view.model.FirstQueryOutput;
import msd.usecase.view.repository.FirstQueryOutputRepository;
import msd.usecase.view.repository.IFirstQueryOutputRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
public class FirstQueryOutputService implements IFirstQueryOutputService{

    @Autowired
    private IFirstQueryOutputRepository repository;

    @Override
    public List<FirstQueryOutput> findAll() {

        return (List<FirstQueryOutput>) repository.findAll();
    }

}

