package ru.sf.practicalweek.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.sf.practicalweek.dto.ValuteCursOnDate;
import ru.sf.practicalweek.service.CentralRussianBankService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CurrencyController {

    private final CentralRussianBankService centralRussianBankService;

    @GetMapping("/getCurrencies")
    public List<ValuteCursOnDate> getValuteCursOnDate() throws Exception {
        return centralRussianBankService.getCurrenciesFromCbr();
    }
}