package msd.usecase.view.service;

/**
 * Created by bhagat on 5/20/19.
 */

import msd.usecase.view.model.SecondQueryOutput;
import msd.usecase.view.repository.ISecondQueryOutputRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SecondQueryOutputService implements ISecondQueryOutputService{

    @Autowired
    private ISecondQueryOutputRepository repository;

    @Override
    public List<SecondQueryOutput> findAll() {

        return (List<SecondQueryOutput>) repository.findAll();
    }

}

