// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.workspaces;

import io.pulumi.awsnative.workspaces.inputs.ConnectionAliasTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConnectionAliasArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectionAliasArgs Empty = new ConnectionAliasArgs();

    @Import(name="connectionString", required=true)
      private final Output<String> connectionString;

    public Output<String> getConnectionString() {
        return this.connectionString;
    }

    @Import(name="tags")
      private final @Nullable Output<List<ConnectionAliasTagArgs>> tags;

    public Output<List<ConnectionAliasTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ConnectionAliasArgs(
        Output<String> connectionString,
        @Nullable Output<List<ConnectionAliasTagArgs>> tags) {
        this.connectionString = Objects.requireNonNull(connectionString, "expected parameter 'connectionString' to be non-null");
        this.tags = tags;
    }

    private ConnectionAliasArgs() {
        this.connectionString = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionAliasArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> connectionString;
        private @Nullable Output<List<ConnectionAliasTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionAliasArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionString = defaults.connectionString;
    	      this.tags = defaults.tags;
        }

        public Builder connectionString(Output<String> connectionString) {
            this.connectionString = Objects.requireNonNull(connectionString);
            return this;
        }
        public Builder connectionString(String connectionString) {
            this.connectionString = Output.of(Objects.requireNonNull(connectionString));
            return this;
        }
        public Builder tags(@Nullable Output<List<ConnectionAliasTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ConnectionAliasTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ConnectionAliasTagArgs... tags) {
            return tags(List.of(tags));
        }        public ConnectionAliasArgs build() {
            return new ConnectionAliasArgs(connectionString, tags);
        }
    }
}
