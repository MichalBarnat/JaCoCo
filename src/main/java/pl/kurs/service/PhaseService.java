package pl.kurs.service;

public class PhaseService {

    // napisz metode która porownuje dwa stringi pod wzgledem dlugosci
    // sa 4 opcje:
    // 1 jest dluzszy, 2 jest dluzszy, sa takie same ale dluzsze niz 5, sa takie same

    public String compareStrings(String s1, String s2) {
        if(s1.length() > s2.length()) {
            return "First is longer!";
        } else if(s2.length() > s1.length()) {
            return "Second is longer!";
        } else {
            if(s1.length() > 5) {
                return "The same and longer that 5";
            } else {
                return "The same!";
            }
        }
    }



}
