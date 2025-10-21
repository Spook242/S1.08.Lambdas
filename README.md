# SPRINT 1. TASCA 08 LAMBDAS

# TECNOLOGIES UTILITZADES
Expresions lambda y method references. El projecte funciona per consola, sense dependències externes, utilitzant únicament les llibreries estàndard del JDK 25.

# REQUISISTS
Llenguatge: Java (versió 17 o superior).
Entorn de desenvolupament recomanat: IntelliJ IDEA

# JDK requerit:
Java SE Development Kit 17 o posterior.

# Sistema operatiu compatible:
Windows, macOS o Linux amb suport per a la JVM.

# Dependències externes:
Cap. El projecte utilitza exclusivament les llibreries estàndard del JDK.

# Execució:
Compilar i executar la classe principal Main.java des de l’entorn o línia de comandes.

No requereix connexió a internet ni cap base de dades externa.

# INSTAL·LACIÓ
Per instal·lar i executar el projecte en un entorn local, cal seguir els passos següents: 
Instal·lació del JDK: Descarrega i instal·la el Java SE Development Kit (JDK) versió 17 o superior des de la pàgina oficial d’Oracle o des d’OpenJDK.

# Descàrrega del projecte:
Descarrega l’arxiu del projecte complet (fitxers .java) o clona el repositori si es troba allotjat en un sistema de control de versions (com GitHub).

Desa els fitxers dins d’una carpeta local del teu ordinador.

# Configuració de l’entorn de desenvolupament:
Obre el projecte amb un IDE compatible amb Java, com IntelliJ IDEA.

Assegura’t que l’IDE estigui configurat per utilitzar el JDK 17 o superior.

# Compilació del projecte:
Compila totes les classes del projecte (Main.java, Product.java, Sale.java, etc.) des de l’IDE o bé mitjançant la línia de comandes: javac *.java


# Execució del programa:
Un cop compilat, executa la classe principal del projecte (Main.java): java Main

El programa s’executarà per consola i permetrà realitzar les operacions previstes (gestió de productes, vendes, etc.).

# DESPLEGAMENT
Preparació de l’entorn del servidor:
Assegura’t que el servidor disposi d’una versió de Java Runtime Environment (JRE) o Java Development Kit (JDK) igual o superior a la versió 17.

Comprova que les variables d’entorn JAVA_HOME i PATH estiguin configurades correctament.

# Transferència dels fitxers del projecte:
Copia al servidor tots els fitxers .class o el paquet .jar (si s’ha generat) corresponents al projecte.

Desa’ls dins d’un directori accessible per a l’execució (per exemple: /opt/projecteJava/ o C:\projecteJava\).

# Execució del projecte al servidor:
Si es disposa dels fitxers compilats, executa la classe principal amb l’ordre: java Main

Si s’ha empaquetat com un fitxer .jar, executa: java -jar NomDelProjecte.jar

# Gestió del procés d’execució:
En servidors Linux, es recomana executar el programa en segon pla o mitjançant un servei del sistema (systemd o nohup) per garantir la seva persistència.
En entorns Windows, es pot utilitzar el Task Scheduler o un fitxer .bat per automatitzar-ne l’execució.

# NIVELL 1 EXERCICI 1

A partir d’una llista de Strings, escriu un mètode que retorna una llista de totes les cadenes que contenen la lletra ‘o’. Imprimeix el resultat.

# NIVELL 1 EXERCICI 2
Has de fer el mateix que en el punt anterior, però ara, el mètode ha de retornar una llista amb els Strings que a més de contenir la lletra ‘o’ també tenen més de 5 lletres.
Imprimeix el resultat.

# NIVELL 1 EXERCICI 3
Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements de la llista amb una lambda.

# NIVELL 1 EXERCICI 4
Fer la mateixa impressió del punt anterior, però mitjançant method reference. 

# NIVELL 1 EXERCICI 5
Crea una Functional Interface amb un mètode anomenat getPiValue() que ha de retornar un double. Des del main() de la classe principal, instància la interfície i assigna-li
el valor 3.1415. Invoca el mètode getPiValue() i imprimeix el resultat.

# NIVELL 1 EXERCICI 6
Crea una llista amb nombres i cadenes de text i ordena la llista amb les cadenes de més curta a més llarga.

# NIVELL 1 EXERCICI 7
Amb la llista de l’exercici anterior, ara ordena-la al revés, de cadena més llarga a més curta.

# NIVELL 1 EXERCICI 8
Crea una Functional Interface que contingui un mètode anomenat reverse(). Aquest mètode ha de rebre i ha de retornar un String. En el main() de la classe principal, injecta
a la interfície creada mitjançant una lambda, el cos del mètode, de manera que torni la mateixa cadena que rep com a paràmetre però al revés. Invoca la instància de la
interfície passant-li una cadena i comprova si el resultat és correcte.
