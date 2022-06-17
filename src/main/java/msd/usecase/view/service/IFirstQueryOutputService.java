package msd.usecase.view.service;

/**
 * Created by bhagat on 5/20/19.
 */

import msd.usecase.view.model.FirstQueryOutput;

import java.util.List;
public interface IFirstQueryOutputService {
    List<FirstQueryOutput> findAll();
}
