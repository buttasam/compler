# Compler - Programátorská příručka

### Java - základní pojmy

Java je multiplatformní, objektově orientovaný programovací jazyk. Přenositelnost je zajištěna tím, že zdrojový kód (*\*.java*) je kompilován do bajtkódu (*\*.class*).
Na konkrétní platformě běží virtuální stroj, který interpretuje bajtkód do strojového kódu specifického pro danou platformu.

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

1) Projekt si naklonujeme do aktuálního adresáře:

`git clone https://github.com/buttasam/compler.git`

2) V IntelliJ IDEA zvolíme  File | New | Project from Existing Sources


3) V okně wizadru vybereme Gradle a klikneme na Next

4) V okně Import Project zvolíme možnosti podle obrázku
![](images/import_idea.jpg)

Gradle home pro nás není podstatný, protože používáme Gradle Wrapper. Tedy binárku (JAR file) Gradlu máme přímo v projektu.
Gradle JVM je cesta k JDK. Použijeme nejnovější stabilní verzi.

5) IDEA bude chvíli projekt nahrávat. Poté se nám v levém Project panelu objeví struktura projektu.

6) Doporučený postup je použít Gradle panel vpravo (viz obrázek). Projekt spustíme dvojím kliknutím na task bootRun ve složce task/application.
   Z terminálu lze projekt spustit příkazem:
`./gradlew bootRun`

![](images/gradle_idea.png)

7) Dole v záložce Run bychom měli vidět výpis logu.
   Výpis konzole má dva módy - grafický a textový. Žádoucí je textový mód, na který se přepneme ikonkou v pravo nahoře. (viz obrázek)

![](images/run_idea.jpg)