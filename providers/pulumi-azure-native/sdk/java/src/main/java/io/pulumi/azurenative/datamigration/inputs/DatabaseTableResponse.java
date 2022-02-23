// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


/**
 * Table properties
 * 
 */
public final class DatabaseTableResponse extends io.pulumi.resources.InvokeArgs {

    public static final DatabaseTableResponse Empty = new DatabaseTableResponse();

    /**
     * Indicates whether table is empty or not
     * 
     */
    @InputImport(name="hasRows", required=true)
      private final Boolean hasRows;

    public Boolean getHasRows() {
        return this.hasRows;
    }

    /**
     * Schema-qualified name of the table
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public DatabaseTableResponse(
        Boolean hasRows,
        String name) {
        this.hasRows = Objects.requireNonNull(hasRows, "expected parameter 'hasRows' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DatabaseTableResponse() {
        this.hasRows = null;
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseTableResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean hasRows;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseTableResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hasRows = defaults.hasRows;
    	      this.name = defaults.name;
        }

        public Builder setHasRows(Boolean hasRows) {
            this.hasRows = Objects.requireNonNull(hasRows);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public DatabaseTableResponse build() {
            return new DatabaseTableResponse(hasRows, name);
        }
    }
}
