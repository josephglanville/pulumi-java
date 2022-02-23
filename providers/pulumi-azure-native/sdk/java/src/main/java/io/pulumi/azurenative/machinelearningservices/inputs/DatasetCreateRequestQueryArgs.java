// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DatasetCreateRequestQueryArgs extends io.pulumi.resources.ResourceArgs {

    public static final DatasetCreateRequestQueryArgs Empty = new DatasetCreateRequestQueryArgs();

    /**
     * The SQL/PostgreSQL/MySQL datastore name.
     * 
     */
    @InputImport(name="datastoreName")
      private final @Nullable Input<String> datastoreName;

    public Input<String> getDatastoreName() {
        return this.datastoreName == null ? Input.empty() : this.datastoreName;
    }

    /**
     * SQL Quey.
     * 
     */
    @InputImport(name="query")
      private final @Nullable Input<String> query;

    public Input<String> getQuery() {
        return this.query == null ? Input.empty() : this.query;
    }

    public DatasetCreateRequestQueryArgs(
        @Nullable Input<String> datastoreName,
        @Nullable Input<String> query) {
        this.datastoreName = datastoreName;
        this.query = query;
    }

    private DatasetCreateRequestQueryArgs() {
        this.datastoreName = Input.empty();
        this.query = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetCreateRequestQueryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> datastoreName;
        private @Nullable Input<String> query;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetCreateRequestQueryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datastoreName = defaults.datastoreName;
    	      this.query = defaults.query;
        }

        public Builder setDatastoreName(@Nullable Input<String> datastoreName) {
            this.datastoreName = datastoreName;
            return this;
        }

        public Builder setDatastoreName(@Nullable String datastoreName) {
            this.datastoreName = Input.ofNullable(datastoreName);
            return this;
        }

        public Builder setQuery(@Nullable Input<String> query) {
            this.query = query;
            return this;
        }

        public Builder setQuery(@Nullable String query) {
            this.query = Input.ofNullable(query);
            return this;
        }
        public DatasetCreateRequestQueryArgs build() {
            return new DatasetCreateRequestQueryArgs(datastoreName, query);
        }
    }
}
