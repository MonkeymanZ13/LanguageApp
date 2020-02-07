package com.example.languages;

import java.util.ArrayList;

public class Vocab {

    public final ArrayList<Word> phrases = new ArrayList<>();
    public final ArrayList<Word> numbers = new ArrayList<>();
    public final ArrayList<String> languageStrings = new ArrayList<>();

    public Vocab() {
        languageStrings.add("Italian");
        languageStrings.add("German");
        languageStrings.add("Czech");
        languageStrings.add("Dutch");
        languageStrings.add("French");

        phrases.add(new Word("Hello (formal)", "Buongiorno", "Guten tag",
                "Dobrý den", "Hallo", "Bonjour", R.raw.hello_formal_italian,
                R.raw.hello_formal_german, R.raw.hello_formal_czech, R.raw.hello_formal_dutch, R.raw.hello_formal_french));

        phrases.add(new Word("Good evening", "Buona sera", "Guten abend",
                "Dobrý večer", "Goedenavond", "Bonsoir", R.raw.good_evening_italian,
                R.raw.good_evening_german, R.raw.good_evening_czech, R.raw.good_evening_dutch, R.raw.good_evening_french));

        phrases.add(new Word("Goodbye (formal)", "Arrivederci", "Auf wiedersehen",
                "Na shledanou", "Dag", "Au revoir", R.raw.goodbye_formal_italian,
                R.raw.goodbye_formal_german, R.raw.goodbye_formal_czech, R.raw.goodbye_formal_dutch, R.raw.goodbye_formal_french));

        phrases.add(new Word("Please", "Per favore", "Bitte",
                "Prosím", "Alstublieft", "S'il vous plaît", R.raw.please_italian,
                R.raw.please_german, R.raw.please_czech, R.raw.please_dutch,R.raw.please_french));

        phrases.add(new Word("Thank you", "Grazie", "Danke",
                "Děkuji vám", "Dank je", "Merci", R.raw.thank_you_italian,
                R.raw.thank_you_german, R.raw.thank_you_czech, R.raw.thank_you_dutch,R.raw.thank_you_french));

        phrases.add(new Word("Hello (informal)", "Ciao", "Hallo",
                "Ahoj", "Hoi", "Salut", R.raw.hello_informal_italian,
                R.raw.hello_informal_german, R.raw.hello_informal_czech,R.raw.hello_informal_dutch,R.raw.hello_informal_french));

        phrases.add(new Word("Bye (informal)", "Ciao", "Tschüss",
                "Ahoj", "Doei", "Salut", R.raw.bye_informal_italian,
                R.raw.bye_informal_german, R.raw.bye_informal_czech,R.raw.bye_informal_dutch,R.raw.bye_informal_french));

        phrases.add(new Word("Yes", "Sì", "Ja",
                "Ano", "Ja", "Oui", R.raw.yes_italian,
                R.raw.yes_german, R.raw.yes_czech,R.raw.yes_dutch,R.raw.yes_french));

        phrases.add(new Word("No", "No", "Nein",
                "Ne", "Nee", "Non", R.raw.no_italian,
                R.raw.no_german, R.raw.no_czech,R.raw.no_dutch, R.raw.no_french));

        phrases.add(new Word("Do you speak English?", "Parla inglese?",
                "Sprechen Sie Englisch?", "Mluvíte anglicky?", "Spreekt u Engels?",
                "Parlez-vous anglais?", R.raw.speak_english_italian, R.raw.speak_english_german,
                R.raw.speak_english_czech, R.raw.speak_english_dutch, R.raw.speak_english_french));

        phrases.add(new Word("Merry Christmas", "Buon natale", "Frohe weihnachten",
                "Veselé vánoce", "Vrolijk kerstfeest", "Joyeux noël",
                R.raw.merry_christmas_italian, R.raw.merry_christmas_german, R.raw.merry_christmas_czech,
                R.raw.merry_christmas_dutch, R.raw.merry_christmas_french));

        phrases.add(new Word("Happy new year", "Felice anno nuovo",
                "Frohes neues jahr","Šťastný nový rok", "Gelukkig nieuwjaar",
                "Bonne année", R.raw.happy_new_year_italian, R.raw.happy_new_year_german,
                R.raw.happy_new_year_czech,R.raw.happy_new_year_dutch,R.raw.happy_new_year_french));

        phrases.add(new Word("We don't speak ", "Non parliamo italiano",
                "Wir sprechen kein deutsch","Nemluvíme česky",
                "Wij spreken geen nederlands","On ne parle pas français",
                R.raw.no_speak_italian, R.raw.no_speak_german,
                R.raw.no_speak_czech,R.raw.no_speak_dutch,R.raw.no_speak_french));



        numbers.add(new Word("One", "Uno", "Eins", "Jeden",
                "Een", "Un", R.raw.one_italian, R.raw.one_german, R.raw.one_czech,
                R.raw.one_dutch, R.raw.one_french));

        numbers.add(new Word("Two", "Due", "Zwei", "Dva",
                "Twee", "Deux", R.raw.two_italian, R.raw.two_german, R.raw.two_czech,
                R.raw.two_dutch, R.raw.two_french));

        numbers.add(new Word("Three", "Tre", "Drei", "Tři",
                "Drie", "Trois", R.raw.three_italian, R.raw.three_german, R.raw.three_czech,
                R.raw.three_dutch, R.raw.three_french));

        numbers.add(new Word("Four", "Quattro", "Vier", "Čtyři",
                "Vier", "Quatre", R.raw.four_italian, R.raw.four_german, R.raw.four_czech,
                R.raw.four_dutch, R.raw.four_french));

        numbers.add(new Word("Five", "Cinque", "Fünf", "Pět",
                "Vijf", "Cinq", R.raw.five_italian, R.raw.five_german, R.raw.five_czech,
                R.raw.five_dutch, R.raw.five_french));

        numbers.add(new Word("Six", "Sei", "Sechs", "Šest",
                "Zes", "Six", R.raw.six_italian, R.raw.six_german, R.raw.six_czech,
                R.raw.six_dutch, R.raw.six_french));

        numbers.add(new Word("Seven", "Sette", "Sieben", "Sedm",
                "Zeven", "Sept", R.raw.seven_italian, R.raw.seven_german, R.raw.seven_czech,
                R.raw.seven_dutch, R.raw.seven_french));

        numbers.add(new Word("Eight", "Otto", "Acht", "Osm",
                "Acht", "Huit", R.raw.eight_italian, R.raw.eight_german, R.raw.eight_czech,
                R.raw.eight_dutch, R.raw.eight_french));

        numbers.add(new Word("Nine", "Nove", "Neun", "Devět",
                "Negen", "Neuf", R.raw.nine_italian, R.raw.nine_german, R.raw.nine_czech,
                R.raw.nine_dutch, R.raw.nine_french));

        numbers.add(new Word("Ten", "Dieci", "Zehn", "Deset",
                "Tien", "Dix", R.raw.ten_italian, R.raw.ten_german, R.raw.ten_czech,
                R.raw.ten_dutch, R.raw.ten_french));

        numbers.add(new Word("Eleven", "Undici", "Elf", "Jedenáct",
                "Elf", "Onze", R.raw.eleven_italian, R.raw.eleven_german, R.raw.eleven_czech,
                R.raw.eleven_dutch, R.raw.eleven_french));

        numbers.add(new Word("Twelve", "Dodici", "Zwölf", "Dvanáct",
                "Twaalf", "Douze", R.raw.twelve_italian, R.raw.twelve_german, R.raw.twelve_czech,
                R.raw.twelve_dutch, R.raw.twelve_french));

        numbers.add(new Word("Thirteen", "Tredici", "Dreizehn",
                "Třináct","Dertien", "Treize", R.raw.thirteen_italian,
                R.raw.thirteen_german, R.raw.thirteen_czech, R.raw.thirteen_dutch, R.raw.thirteen_french));

        numbers.add(new Word("Fourteen", "Quattordici", "Vierzehn",
                "Čtrnáct","Veertien", "Quatorze", R.raw.fourteen_italian,
                R.raw.fourteen_german, R.raw.fourteen_czech, R.raw.fourteen_dutch, R.raw.fourteen_french));

        numbers.add(new Word("Fifteen", "Quindici", "Fünfzehn",
                "Patnáct","Vijftien", "Quinze", R.raw.fifteen_italian,
                R.raw.fifteen_german, R.raw.fifteen_czech, R.raw.fifteen_dutch, R.raw.fifteen_french));

        numbers.add(new Word("Sixteen", "Sedici", "Sechszehn",
                "Šestnáct","Zestien", "Seize", R.raw.sixteen_italian,
                R.raw.sixteen_german, R.raw.sixteen_czech, R.raw.sixteen_dutch, R.raw.sixteen_french));

        numbers.add(new Word("Seventeen", "Diciassette", "Siebzehn",
                "Sedmnáct","Zeventien", "Dix-sept", R.raw.seventeen_italian,
                R.raw.seventeen_german, R.raw.seventeen_czech, R.raw.seventeen_dutch, R.raw.seventeen_french));

        numbers.add(new Word("Eighteen", "Diciotto", "Achtzehn",
                "Osmnáct","Achttien", "Dix-huit", R.raw.eighteen_italian,
                R.raw.eighteen_german, R.raw.eighteen_czech, R.raw.eighteen_dutch, R.raw.eighteen_french));

        numbers.add(new Word("Nineteen", "Diciannove", "Neunzehn",
                "Devatenáct","Negentien", "Dix-neuf", R.raw.nineteen_italian,
                R.raw.nineteen_german, R.raw.nineteen_czech, R.raw.nineteen_dutch, R.raw.nineteen_french));

        numbers.add(new Word("Twenty", "Venti", "Zwanzig", "Dvacet",
                "Twintig", "Vingt", R.raw.twenty_italian, R.raw.twenty_german, R.raw.twenty_czech,
                R.raw.twenty_dutch, R.raw.twenty_french));
    }

}
