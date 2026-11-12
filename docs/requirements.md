
# Követelmények – Utazási költségkalkulátor

## Funkcionális követelmények

### FR-01 – Új utazás rögzítése
**Leírás:** Felhasználóként szeretnék új utazást rögzíteni, hogy nyilvántarthassam az utazási költségeimet.

**Elfogadási feltételek:** Adott egy felhasználó, aki megadta az utazás adatait. Amikor a Hozzáadás gombra kattint, akkor az utazás megjelenik az utazások listájában.

### FR-02 – Rögzített utazások megjelenítése
**Leírás:** Felhasználóként szeretném látni a korábban rögzített utazásaimat, hogy áttekinthessem az utazási előzményeimet.

**Elfogadási feltételek:** Adott egy felhasználó, akinek már vannak rögzített utazásai. Amikor megnyitja az alkalmazást, akkor a korábban rögzített utazások megjelennek egy listában.

### FK-05 - Adatok mentése 
**Leírás:** A memóriában lévő új utazás adatait a program fűzze hozzá (append) egy .csv kiterjesztésű fájl végéhez.

**Elfogadási feltételek:** Adott egy felhasználó, aki megadta az utazás adatait. Amikor a Hozzáadás gombra kattint, akkor az utazás elmetésre kerül egy csv fáljba.
 
### FK-06 Adatok beolvasása
**Leírás:** A program tudja soronként beolvasni a .csv fájlt, és alakítsa át azokat a memóriában kezelhető objektumokká/listává.

**Elfogadási feltételek:** Adott egy felhasználó, akinek már vannak rögzített utazásai. Amikor megnyitja az alkalmazást, akkor a korábban rögzített utazások betöltödnek az elmentett fájlból.


## Nem funkcionális követelmények

### NFR-01 – Könnyű használhatóság
**Leírás:** Az alkalmazás rendelkezzen egyszerű, átlátható és könnyen kezelhető grafikus felülettel.

**Elfogadási feltételek:** Adott egy felhasználó, aki megnyitja az alkalmazást. Amikor megtekinti a főablakot, akkor a legfontosabb funkciók jól láthatóak és könnyen érthetőek.

### NFR-02 – Hordozhatóság
**Leírás:** Az alkalmazás legyen futtatható Windows operációs rendszeren.

**Elfogadási feltételek:** Adott egy számítógép, amelyen telepítve van a Java futtatókörnyezet. Amikor a felhasználó elindítja az alkalmazást Windows rendszeren, akkor annak sikeresen el kell indulnia.

###	NK-05 - Hibakezelés
**Leírás:** A program ne fagyjon le, ha a .csv fájl még nem létezik az első induláskor, hanem automatikusan hozzon létre egy üres fájlt.

**Elfogadási feltételek:** A program nem fut hibára ha nem találja a fájlt, hanem létrehozz egyet.

### NK-06 - Karakterkodolás 
**Leírás:** A kimentett .csv fájl karakterkódolása szigorúan UTF-8 legyen, hogy a magyar ékezetes karakterek (pl. a települések nevei vagy a nevetek) egy másik gépen megnyitva is hibátlanul jelenjenek meg.

**Elfogadási feltételek:** Az adatok visszatöltésénél rendesen jelenek meg az ékezetes karakterrek.

## User Story

###	US-05 - A bevitt adatok megmaradjanak a program bezárása után is
**Leírás:** Felhasználóként szeretném, ha a rögzítésem után az adataim elmentődnének egy fájlba, hogy a program bezárása után se vesszenek el.

**Elfogadási feltételek:** Az elmentett utazások megmaradnak a program ujrainditása után is.

### US-06 - A program ujbóli elindításakor az elözmények betöltése
**Leírás:** Felhasználóként szeretném, ha listázáskor a program betöltené a korábbi útjaimat, hogy lássam az eddigi előzményeket.

**Elfogadási feltételek:** Az elmentett utazások betöltésre kerülnek a program indulásakor.



