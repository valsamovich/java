package org.samovich.cs6310.assignment4;

/**
 * @author Valery Samovich
 * @see
 */
public class Term {

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
}
