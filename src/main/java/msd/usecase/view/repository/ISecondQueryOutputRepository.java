package msd.usecase.view.repository;

import msd.usecase.view.model.SecondQueryOutput;

import java.util.List;

/**
 * Created by bhagat on 5/21/19.
 */
public interface ISecondQueryOutputRepository {
    List<SecondQueryOutput> findAll();
}
