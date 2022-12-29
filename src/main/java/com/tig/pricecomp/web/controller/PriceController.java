package com.tig.pricecomp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Locale;
import java.util.Optional;

@Controller
public class PriceController {

    @GetMapping("/prices")
    public ModelAndView prices(final HttpServletRequest request, final ModelMap model, @RequestParam("messageKey") final Optional<String> messageKey) {

        /* Locale locale = request.getLocale();
        messageKey.ifPresent( key -> {
                    String message = messages.getMessage(key, null, locale);
                    model.addAttribute("message", message);
                }
        ); */

        return new ModelAndView("prices", model);
    }





}
