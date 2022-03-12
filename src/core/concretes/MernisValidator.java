package core.concretes;

import core.abstracts.IdValidator;

public class MernisValidator implements IdValidator {
    @Override
    public boolean validate(String tc, String firstName, String lastName, int year) {
        System.out.println(tc+" : tc kimlik numaralı birey mevcut. mernis sorgu");
        return true;
    }
}
