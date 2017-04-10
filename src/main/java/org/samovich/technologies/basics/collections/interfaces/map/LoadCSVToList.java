package org.samovich.technologies.basics.collections.interfaces.map;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  Valery Samovich
 * @see
 */
public class LoadCSVToList {
    static final String PATH = "/Users/samov004/GitHub/java/src/main/resources/org/samovich/technologies/basics/collections/map/";
    static final String LANGUAGES = "languages.csv";
    static final String DESCRIPTIONS = "descriptions.csv";

    public static void main(String[] args) {
        System.out.println(loadLanguages().size());
        System.out.println(loadDescriptions().size());
    }

    /**
     * Load descriptions to the object.
     * @return
     */
    public static List<Language> loadLanguages() {
        try {
            FileInputStream fis = new FileInputStream(PATH + "/" + LANGUAGES);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            List<Language> languages = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                Language language = new Language();
                language.setId(Integer.valueOf(array[0]));
                language.setName(array[1]);
                languages.add(language);
            }
            return languages;

        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    /**
     * Load languages to the object.
     * @return
     */
    public static List<Description> loadDescriptions() {
        try {
            FileInputStream fis = new FileInputStream(PATH + "/" + DESCRIPTIONS);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            List<Description> descriptions = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                Description description = new Description();
                description.setId(Integer.valueOf(array[0]));
                description.setDescription(array[1]);
                descriptions.add(description);
            }
            return descriptions;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    // parse list to map (map)
    // apply descriptions (reduce)
}
