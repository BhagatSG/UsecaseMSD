package msd.usecase.view.controller;

/**
 * Created by bhagat on 5/21/19.
 */
import java.util.List;

import msd.usecase.view.model.FirstQueryOutput;
import msd.usecase.view.model.SecondQueryOutput;
import msd.usecase.view.service.IFirstQueryOutputService;
import msd.usecase.view.service.ISecondQueryOutputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    @Autowired
    private IFirstQueryOutputService firstQueryOutputService;

    @Autowired
    private ISecondQueryOutputService secondQueryOutputService;

    @GetMapping("/showfirstQueryOutputs")
    public String findfirstQueryOutputs(Model model) {

        List<FirstQueryOutput> firstQueryOutputs = (List<FirstQueryOutput>) firstQueryOutputService.findAll();

        model.addAttribute("firstQueryOutputs", firstQueryOutputs);

        return "showfirstQueryOutputs";
    }

    @GetMapping("/showsecondQueryOutputs")
    public String findsecondQueryOutputs(Model model) {

        List<SecondQueryOutput> secondQueryOutputs = (List<SecondQueryOutput>) secondQueryOutputService.findAll();

        model.addAttribute("secondQueryOutputs", secondQueryOutputs);

        return "showsecondQueryOutputs";
    }
}
