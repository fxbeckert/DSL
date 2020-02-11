# DSL

## Utilisation du générateur : 

### Ouvrir l'éditeur

Après avoir lancé Gemoc, clic droit sur fr.ut2j.m1ice.fsm.editor -> run as -> eclipse application. Un nouvel éditeur Gemoc va s'ouvrir.

### Création d'un projet

Une fois sur l'éditeur, créér un nouveau projet. A l'intérieur de ce projet, créér un nouveau fichier avec l'extension du DSL (.mydsl).
Dans ce nouveau fichier, spécifier le fsm à générer. Une fois sauvegardé (ctrl+S), des nouveaux fichiers seront générés dans un nouveau dossier src-gen. 

### Test du générateur

Afin de tester le fonctionnement, à l'intérieur du dossier src-gen, lancer la commande "javac *.java" afin de compiler les fichiers, puis "java FSM" pour les éxecuter.
