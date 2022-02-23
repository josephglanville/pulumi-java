// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Project Database Details
 * 
 */
public final class DatabaseInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatabaseInfoArgs Empty = new DatabaseInfoArgs();

    /**
     * Name of the database
     * 
     */
    @InputImport(name="sourceDatabaseName", required=true)
      private final Input<String> sourceDatabaseName;

    public Input<String> getSourceDatabaseName() {
        return this.sourceDatabaseName;
    }

    public DatabaseInfoArgs(Input<String> sourceDatabaseName) {
        this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName, "expected parameter 'sourceDatabaseName' to be non-null");
    }

    private DatabaseInfoArgs() {
        this.sourceDatabaseName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatabaseInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sourceDatabaseName;

        public Builder() {
    	      // Empty
        }

        public Builder(DatabaseInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sourceDatabaseName = defaults.sourceDatabaseName;
        }

        public Builder setSourceDatabaseName(Input<String> sourceDatabaseName) {
            this.sourceDatabaseName = Objects.requireNonNull(sourceDatabaseName);
            return this;
        }

        public Builder setSourceDatabaseName(String sourceDatabaseName) {
            this.sourceDatabaseName = Input.of(Objects.requireNonNull(sourceDatabaseName));
            return this;
        }
        public DatabaseInfoArgs build() {
            return new DatabaseInfoArgs(sourceDatabaseName);
        }
    }
}
