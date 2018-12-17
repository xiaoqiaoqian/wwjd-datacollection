package com.wwjd.config.hbase;

/**
 * com.qts.pulsarconfig.hbase bean
 *
 * @author adao
 * @CopyRight 万物皆导
 * @Created 2018-12-05 13:59:00
 */
public final class HbaseBean {
    /**
     * familyColumn
     */
    private String family;

    /**
     * qualifier
     */
    private String qualifier;
    /**
     * value
     */
    private String value;

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getQualifier() {
        return qualifier;
    }

    public void setQualifier(String qualifier) {
        this.qualifier = qualifier;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
