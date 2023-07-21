package geotechnicalapp.geotech.web.sample;

import geotechnicalapp.geotech.web.sample.model.SampleModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Sanjeet Baidya
 */
@Controller
@RequestMapping(path = "/")
public class SampleController {
    @GetMapping("/")
    public String sampleHome(ModelMap mode) {
        mode.addAttribute("welcomeMessage", "Welcome Home");
        mode.addAttribute("sample", new SampleModel());
        return "home";
    }


}
