# Compler - Programátorská příručka

### Java - základní pojmy

Java je multiplatformní, objektově orientovaný programovací jazyk. Přenositelnost je zajištěna tím, že zdrojový kód (*.java) je kompilován do bajtkódu (*.class).
Na konkrétní platformě běží virtuální stroj, který interpretuje bajtkód do strojového ḱódu specifického pro danou platformu.

**JVM** (Java Virtual Machine) - interpret bajtkódu
**JRE** (Java Runtime Environment) - obsahuje JVM a další soubory nutné ke spuštění java aplikace (knihovny)
**JDK** (Java Development Kit) - obsahuje JRE a nástroje potřebné pro vývoj (kompilátor)


### Gradle
#### Automatizované operace
Nástroj díky kterémů můžeme automatizovat operace nad projektem. Podobně jako Git je Gradle snadno ovladatelný z příkazové řádky.

Například:
**Buildování** - kompilace + sestavení JAR/WAR souboru

`gradle assemble` - buildování
`gradle build` - před buildováním spustí testy

**Testování** - spuštění testů (například jednotkových)

`gradle test` - spuštění všech testů

**Cleanování** - odstranění zkompilovaných souborů

`gradle clean`

**Javadoc** - vygenerování dokumentace

`gradle javadoc`

####Správa závislostí


#### Tasky a pluginy


### Zprovoznění projektu v IntelliJ IDEA

![Alt text](images/gradle_idea.png)


