# jee-first-sample

Eine sehr einfache Java-Servlet Anwendung um sich mit dem Deplyoment auf den Glassfish-Server und der Einrichtung der IDE-Vertraut zu machen.

## Starten der Applikation im WildFly Server

1. Erstellen eine WildFly-Nutzers. Hierzu das Skript add-user.sh im Verzeichnis /pfad/zu/wildfly/bin ausführen und den Anweisungen folgen.
1. Starten des Applikationsserver. Ausführen des Start-Skipts unter /pfad/zu/wildfild/bin/standalone.sh.
1. Im Brower http://localhost:9990/console/index.html aufrufen.
1. Unter Deployment -> Start -> (+) -> Upload Deployment die Datei 'project1.war' im Verzeichnis 'build' auswählen und auf OK klicken.
1. Im Browser die Seite http://localhost:8080/project1/main aufrufen und überprüfen, ob die Anwendung erfolgreich deployt wurde.


## Starten der Applikation im Glassfish Server

1. Starten des Glassfish-Server
   ausführen des Startskript unter /pfad/zu/glassfish4/glassfish/bin/startserv(.bat)
1. Aufrufen der Glassfish-admin-Console (im Browser http://localhost:4848/ aufrufen)
1. Im rechten Seitenmenü 'Applications' auswählen und dann den Button mit der Aufschrift 'Deploy...' auswählen.
1. Unter 'location' die Datei 'project1.war' im Verzeichnis 'build' auswählen und auf OK klicken.
1. Im Browser die Seite http://localhost:8080/project1/main aufrufen und überprüfen, ob die Anwendung erfolgreich deployt wurde.

## Einrichten der Anwendung in der Eclipse-EE IDE

1. Starten der IDE
1. Importieren des Projektes (Datei -> Importieren... -> Existing projects into Workspace)
1. Erzeugen eines neues Servers mit dem WildFlx-Server-Adapter. (Hierzu müssen ggf. die JBossTools installiert werden). Ein neuer Server kann im Servers-Reiter mit Rechtsklick: new -> Server erstellt werden.
Hier muss dann der Server-Adapter (WildFly 13) ausgewäht werden und das Verzeichnis angegeben werden, in dem der Server Server liegt.
1. Das Projekt auf dem server starten (Rechtsklick -> Run As -> Run on Server). Den bereits angelegten Server auswählen und "Finish" klicken.
1. Im Browser die Seite http://localhost:8080/jee-first-sample/ aufrufen und überprüfen, ob die Anwendung erfolgreich deployt wurde.