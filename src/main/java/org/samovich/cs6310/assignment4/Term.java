package org.samovich.cs6310.assignment4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Term {
    private static final String TERM_FILE = "terms.csv";
    private Long uuid;
    private String termDesignator;

    public Term(Long uuid, String termDesignator) {
        this.uuid = uuid;
        this.termDesignator = termDesignator;
    }

    public Term() {
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public String getTermDesignator() {
        return termDesignator;
    }

    public void setTermDesignator(String termDesignator) {
        this.termDesignator = termDesignator;
    }

    public static List<Term> loadTearms() {
        try {
            FileInputStream fis = new FileInputStream(Application.BASE_PATH + TERM_FILE);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            List<Term> terms = new ArrayList<>();
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                Term term = loadTerm(array);
                terms.add(term);
            }
            return terms;
        } catch (IOException e){
            throw new UncheckedIOException(e);
        }
    }

    private static Term loadTerm(String[] array) {
        Term term = new Term();
        term.setUuid(Long.valueOf(array[0]));
        term.setTermDesignator(array[1]);
        return term;
    }
}
