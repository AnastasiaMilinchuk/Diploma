package app.controllers.search;

import app.services.PlaceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by click on 5/8/2016.
 */
@Controller
public class PlacesSearchController {
    @Autowired
    PlaceService placeService;

    @RequestMapping(value = "myPlaces", method = RequestMethod.GET)
    public String loadUserPlaces(Model model){
        model.addAttribute("places", placeService.getPlacesByUser(SecurityContextHolder
                .getContext()
                .getAuthentication()
                .getName()
                )
        );
        return "usersPlaces";
    }
}
