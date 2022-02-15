// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cassandra;

import io.pulumi.awsnative.cassandra.inputs.KeyspaceTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class KeyspaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KeyspaceArgs Empty = new KeyspaceArgs();

    @InputImport(name="keyspaceName")
    private final @Nullable Input<String> keyspaceName;

    public Input<String> getKeyspaceName() {
        return this.keyspaceName == null ? Input.empty() : this.keyspaceName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<List<KeyspaceTagArgs>> tags;

    public Input<List<KeyspaceTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public KeyspaceArgs(
        @Nullable Input<String> keyspaceName,
        @Nullable Input<List<KeyspaceTagArgs>> tags) {
        this.keyspaceName = keyspaceName;
        this.tags = tags;
    }

    private KeyspaceArgs() {
        this.keyspaceName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyspaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> keyspaceName;
        private @Nullable Input<List<KeyspaceTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyspaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyspaceName = defaults.keyspaceName;
    	      this.tags = defaults.tags;
        }

        public Builder setKeyspaceName(@Nullable Input<String> keyspaceName) {
            this.keyspaceName = keyspaceName;
            return this;
        }

        public Builder setKeyspaceName(@Nullable String keyspaceName) {
            this.keyspaceName = Input.ofNullable(keyspaceName);
            return this;
        }

        public Builder setTags(@Nullable Input<List<KeyspaceTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<KeyspaceTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public KeyspaceArgs build() {
            return new KeyspaceArgs(keyspaceName, tags);
        }
    }
}