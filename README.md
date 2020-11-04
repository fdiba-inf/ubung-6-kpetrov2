[![Work in Repl.it](https://classroom.github.com/assets/work-in-replit-14baed9a392b3a25080506f3b7b6d57f295ec2978f6f33ec97e36a161684cbe9.svg)](https://classroom.github.com/online_ide?assignment_repo_id=3569820&assignment_repo_type=AssignmentRepo)
# Übung 6
Quellcode der Vorlesung: https://github.com/fdiba-inf/vorlesung
## Repl.it öffnen
Bevor Sie die Taste _"Work in Repl.it"_ klicken, öffnen Sie https://repl.it/auth/github/get, um sicherzustellen, dass Sie in repl.it angemeldet sind.
## Aufgabe 1. Komplexität in O-Notation
Zu welchen Komplexitätsklassen gehören die folgenden Anweisungen in Abhängigkeit von n?
``` 
for (int i = 1; i < n; i = i * 2) {
    System.out.println(i);
}
``` 
``` 
for (int i = 1; i < n; i++) {
    System.out.println(i);
}
``` 
``` 
for (int i = 1; i < n; i++) {
    for(int j = 1; j < n; j = j * 2) {
        System.out.println(i + j);
    }
}
``` 
``` 
for (int i = 1; i < Math.pow(2, n); i++) {
    System.out.println(i);
}
``` 
``` 
for (int i = 1; i < n; i++) {
    for(int j = 1; j < n; j++) {
        System.out.println(i + j);
    }
}
``` 
``` 
for (int i = 1; i < 1000; i++) {
    System.out.println(n);
}
``` 
## Aufgabe 2. Palindrom
Ändern Sie die Klasse _Palindrome_ im Paket _exercise6_. 
Der Benutzer soll eine Zahl eingeben.
Zuerst wird überprüft, ob die Zahl großer Null ist (benutzen Sie das Schlüsselwort _assert_).
Dann wird bestimmt, ob die Zahl Palindrom ist (wenn rückwärts gelesen, erscheint dieselbe Zahl z.B. 1221, 242).
Ausgabe:
``` 
Palindrome: <true/false>
``` 
## Aufgabe 3. Passwortüberprüfung
Ändern Sie die Klasse _PasswordCheck_ im Paket _exercise6_. 
Sie soll die Korrektheit eines Passworts überprüfen. 
Der Benutzer soll ein Password eingeben, bis es korrekt ist:
* ist mindestens acht Zeichen lang
* besteht nur aus Buchstaben und Ziffern (_Character.isLetterOrDigit(symbol)_)
* enthält mindestens zwei Ziffern (_Character.isDigit(symbol)_)

Die folgende Nachricht wird am Ende in der Konsole ausgegeben:
``` 
Password valid!
``` 
## Achtung! Achtung! Achtung!
Wenn Sie alle Aufgaben gemacht haben, sollen Sie die Lösungen in _GitHub_ hochladen. 
Wenn "Version Control" nicht verfügbar ist, geben Sie die folgenden Befehle in die Konsole ein:
``` 
git pull
git add .
git commit -m "Some message"
git push
``` 
