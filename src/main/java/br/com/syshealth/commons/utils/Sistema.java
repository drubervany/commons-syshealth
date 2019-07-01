package br.com.syshealth.commons.utils;

/**
 * The Enum Align.
 *
 * @author Danilo.Rubervany
 */
public enum Sistema {

    /** The left. */
    FORMATO_DATA("dd-MM-yyyy");

    private String formatoData;

    Sistema(String formatoData) {
        this.formatoData = formatoData;
    }

    public String getValue() {
        return formatoData;
    }
}
