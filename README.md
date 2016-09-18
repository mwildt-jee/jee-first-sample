# jee-first-sample

Eine sehr einfache Java-Servlet Anwendung um sich mit dem Deplyoment auf den Glassfish-Server und der Einrichtung der IDE-Vertraut zu machen.


## Starten der Applikation im Glassfish Server

1. Starten des Glassfish-Server
   ausführen des Startskript unter /pfad/zu/glassfish4/glassfish/bin/startserv(.bat)

2. Aufrufen der Glassfish-admin-Console (im Browser http://localhost:4848/ aufrufen)

3. Im rechten Seitenmenü 'Applications' auswählen und dann den Button mit der Aufschrift 'Deploy...' auswählen.

4. Unter 'location' die Datei 'project1.war# im Verzeichnis 'build' auswählen und auf OK klicken.

5. Im Browser die Seite http://localhost:8080/project1/main aufrufen und überprüfen, ob die Anwendung erfolgreich deployt wurde.

## Einrichten der Anwendung in der Eclipse-EE IDE

1. Starten der IDE

2. Importieren des Projektes (Datei -> Importieren... -> Existing projects into Workspace)

3. Erzeugen eines neues Servers mit dem Glassfish-Server-Adapter. (Hierzu müssen ggf. die Glassfish-Tools als Eclipse-Plugin [https://marketplace.eclipse.org/content/glassfish-tools] installiert werden). Ein neuer Server kann im Servers-Reiter mit Rechtsklick: new -> Server erstellt werden.
Hier muss dann der Server-Adapter (Glassfish 4) ausgewäht werden und das Verzeichnis angegeben werden, in dem der Glassfish Server liegt.

4. Das Projekt auf dem Glassfish-server starten (Rechtsklick -> Run As -> Run on Server). Den bereits angelegten Glassfish-Server auswählen und "Finish" klicken.

5. Im Browser die Seite http://localhost:8080/project1/main aufrufen und überprüfen, ob die Anwendung erfolgreich deployt wurde.
