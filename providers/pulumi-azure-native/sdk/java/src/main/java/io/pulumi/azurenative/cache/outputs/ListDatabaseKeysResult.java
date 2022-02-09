// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ListDatabaseKeysResult {
    private final String primaryKey;
    private final String secondaryKey;

    @OutputCustomType.Constructor({"primaryKey","secondaryKey"})
    private ListDatabaseKeysResult(
        String primaryKey,
        String secondaryKey) {
        this.primaryKey = Objects.requireNonNull(primaryKey);
        this.secondaryKey = Objects.requireNonNull(secondaryKey);
    }

    public String getPrimaryKey() {
        return this.primaryKey;
    }
    public String getSecondaryKey() {
        return this.secondaryKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListDatabaseKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String primaryKey;
        private String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListDatabaseKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setPrimaryKey(String primaryKey) {
            this.primaryKey = Objects.requireNonNull(primaryKey);
            return this;
        }

        public Builder setSecondaryKey(String secondaryKey) {
            this.secondaryKey = Objects.requireNonNull(secondaryKey);
            return this;
        }

        public ListDatabaseKeysResult build() {
            return new ListDatabaseKeysResult(primaryKey, secondaryKey);
        }
    }
}
