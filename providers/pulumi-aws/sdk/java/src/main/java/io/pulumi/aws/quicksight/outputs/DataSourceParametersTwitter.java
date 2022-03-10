// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataSourceParametersTwitter {
    /**
     * The maximum number of rows to query.
     * 
     */
    private final Integer maxRows;
    /**
     * The Twitter query to retrieve the data.
     * 
     */
    private final String query;

    @OutputCustomType.Constructor
    private DataSourceParametersTwitter(
        @OutputCustomType.Parameter("maxRows") Integer maxRows,
        @OutputCustomType.Parameter("query") String query) {
        this.maxRows = maxRows;
        this.query = query;
    }

    /**
     * The maximum number of rows to query.
     * 
    */
    public Integer getMaxRows() {
        return this.maxRows;
    }
    /**
     * The Twitter query to retrieve the data.
     * 
    */
    public String getQuery() {
        return this.query;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersTwitter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer maxRows;
        private String query;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersTwitter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxRows = defaults.maxRows;
    	      this.query = defaults.query;
        }

        public Builder setMaxRows(Integer maxRows) {
            this.maxRows = Objects.requireNonNull(maxRows);
            return this;
        }

        public Builder setQuery(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public DataSourceParametersTwitter build() {
            return new DataSourceParametersTwitter(maxRows, query);
        }
    }
}
