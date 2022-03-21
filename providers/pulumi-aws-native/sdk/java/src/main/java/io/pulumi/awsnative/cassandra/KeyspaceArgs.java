// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra;

import io.pulumi.awsnative.cassandra.inputs.KeyspaceTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyspaceArgs Empty = new KeyspaceArgs();

    /**
     * Name for Cassandra keyspace
     * 
     */
    @Import(name="keyspaceName")
      private final @Nullable Output<String> keyspaceName;

    public Output<String> getKeyspaceName() {
        return this.keyspaceName == null ? Output.empty() : this.keyspaceName;
    }

    @Import(name="tags")
      private final @Nullable Output<List<KeyspaceTagArgs>> tags;

    public Output<List<KeyspaceTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public KeyspaceArgs(
        @Nullable Output<String> keyspaceName,
        @Nullable Output<List<KeyspaceTagArgs>> tags) {
        this.keyspaceName = keyspaceName;
        this.tags = tags;
    }

    private KeyspaceArgs() {
        this.keyspaceName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> keyspaceName;
        private @Nullable Output<List<KeyspaceTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyspaceName = defaults.keyspaceName;
    	      this.tags = defaults.tags;
        }

        public Builder keyspaceName(@Nullable Output<String> keyspaceName) {
            this.keyspaceName = keyspaceName;
            return this;
        }
        public Builder keyspaceName(@Nullable String keyspaceName) {
            this.keyspaceName = Output.ofNullable(keyspaceName);
            return this;
        }
        public Builder tags(@Nullable Output<List<KeyspaceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<KeyspaceTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(KeyspaceTagArgs... tags) {
            return tags(List.of(tags));
        }        public KeyspaceArgs build() {
            return new KeyspaceArgs(keyspaceName, tags);
        }
    }
}
