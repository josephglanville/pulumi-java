// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerbi.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListWorkspaceCollectionAccessKeysResult {
    private final @Nullable String key1;
    private final @Nullable String key2;

    @OutputCustomType.Constructor({"key1","key2"})
    private ListWorkspaceCollectionAccessKeysResult(
        @Nullable String key1,
        @Nullable String key2) {
        this.key1 = key1;
        this.key2 = key2;
    }

    public Optional<String> getKey1() {
        return Optional.ofNullable(this.key1);
    }
    public Optional<String> getKey2() {
        return Optional.ofNullable(this.key2);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListWorkspaceCollectionAccessKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key1;
        private @Nullable String key2;

        public Builder() {
    	      // Empty
        }

        public Builder(ListWorkspaceCollectionAccessKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key1 = defaults.key1;
    	      this.key2 = defaults.key2;
        }

        public Builder setKey1(@Nullable String key1) {
            this.key1 = key1;
            return this;
        }

        public Builder setKey2(@Nullable String key2) {
            this.key2 = key2;
            return this;
        }

        public ListWorkspaceCollectionAccessKeysResult build() {
            return new ListWorkspaceCollectionAccessKeysResult(key1, key2);
        }
    }
}