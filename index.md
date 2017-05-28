## Strona projektu na przedmiot Programowanie systemów mobilnych


Autorzy:  
Grzegorz Giera 186390  
Paweł Grzyb 186522

Aplikacja wykonana w ramach projektu zaliczeniowego to Kalkulator Podatkowy.  \
Użytkownik może obliczyć jaką kwote musi odprowadzić w formie podatku od darowizny, spadku czy wypłaty w zależności od rodzju umowy.  
Kraje dla których można oblicz podatki to:
  - Polska
  - Irlandia
  - Anglia

Projekt składa się z dwóch członów: Aplikacji mobilnej wykonanej w Android Studio oraz z bazy danych online stworzonej przy użyciu Google Firebase. 

Aplikacja:   
Większość utworzonych klas odpowiada za przenoszenie użytkownika do różnych aktywności. Klasy których nazwa zaczyna się od słowa Oblicz... odpowiadają za dokonywanie obliczeń.  
Obliczenia dokonywane są na zasadzie pobrania z bazy danych odpowiedniego wzoru, podstawienia odpowienich zmiennych oraz wyświetleniu wyników. Dla umów o prace wyniki wyświetlane są miesięcznie, rocznie i tygodniowo. Do interpretacji wzorów została wykorzystana biblioteka BeanShell.   
Pole do wprowadzania wartości zostało zabezpieczone tak aby użytkownik wprowadzając wartość nie mógł wprowadzić wartosci innego typu niż double. 

Google Firebase:
Baza danych przechowuje wszekie wzory obliczeniowe. Dostęp do bazy danych może być przyznany tylko bezpośrednio (tzn. konkretnemu użytkownikowi google). Firebase pozwala jednak wygenerować plik JSON na podstawie bazy danych. Link do tego pliku jest poniżej:

[Firebase JSON](https://pastebin.com/1Gvh22m1)


