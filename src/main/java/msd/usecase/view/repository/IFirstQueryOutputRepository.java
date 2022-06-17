package msd.usecase.view.repository;

import msd.usecase.view.model.FirstQueryOutput;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by bhagat on 5/21/19.
 */
public interface IFirstQueryOutputRepository {
    List<FirstQueryOutput> findAll();
}
