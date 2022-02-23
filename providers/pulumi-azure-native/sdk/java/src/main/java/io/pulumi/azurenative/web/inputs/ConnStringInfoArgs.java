// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.enums.ConnectionStringType;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Database connection string information.
 * 
 */
public final class ConnStringInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnStringInfoArgs Empty = new ConnStringInfoArgs();

    /**
     * Connection string value.
     * 
     */
    @InputImport(name="connectionString")
      private final @Nullable Input<String> connectionString;

    public Input<String> getConnectionString() {
        return this.connectionString == null ? Input.empty() : this.connectionString;
    }

    /**
     * Name of connection string.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Type of database.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<ConnectionStringType> type;

    public Input<ConnectionStringType> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ConnStringInfoArgs(
        @Nullable Input<String> connectionString,
        @Nullable Input<String> name,
        @Nullable Input<ConnectionStringType> type) {
        this.connectionString = connectionString;
        this.name = name;
        this.type = type;
    }

    private ConnStringInfoArgs() {
        this.connectionString = Input.empty();
        this.name = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnStringInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> connectionString;
        private @Nullable Input<String> name;
        private @Nullable Input<ConnectionStringType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnStringInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder setConnectionString(@Nullable Input<String> connectionString) {
            this.connectionString = connectionString;
            return this;
        }

        public Builder setConnectionString(@Nullable String connectionString) {
            this.connectionString = Input.ofNullable(connectionString);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setType(@Nullable Input<ConnectionStringType> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable ConnectionStringType type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public ConnStringInfoArgs build() {
            return new ConnStringInfoArgs(connectionString, name, type);
        }
    }
}
