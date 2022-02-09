// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.relay.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListHybridConnectionKeysResult {
    private final @Nullable String keyName;
    private final @Nullable String primaryConnectionString;
    private final @Nullable String primaryKey;
    private final @Nullable String secondaryConnectionString;
    private final @Nullable String secondaryKey;

    @OutputCustomType.Constructor({"keyName","primaryConnectionString","primaryKey","secondaryConnectionString","secondaryKey"})
    private ListHybridConnectionKeysResult(
        @Nullable String keyName,
        @Nullable String primaryConnectionString,
        @Nullable String primaryKey,
        @Nullable String secondaryConnectionString,
        @Nullable String secondaryKey) {
        this.keyName = keyName;
        this.primaryConnectionString = primaryConnectionString;
        this.primaryKey = primaryKey;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryKey = secondaryKey;
    }

    public Optional<String> getKeyName() {
        return Optional.ofNullable(this.keyName);
    }
    public Optional<String> getPrimaryConnectionString() {
        return Optional.ofNullable(this.primaryConnectionString);
    }
    public Optional<String> getPrimaryKey() {
        return Optional.ofNullable(this.primaryKey);
    }
    public Optional<String> getSecondaryConnectionString() {
        return Optional.ofNullable(this.secondaryConnectionString);
    }
    public Optional<String> getSecondaryKey() {
        return Optional.ofNullable(this.secondaryKey);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListHybridConnectionKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String keyName;
        private @Nullable String primaryConnectionString;
        private @Nullable String primaryKey;
        private @Nullable String secondaryConnectionString;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListHybridConnectionKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryKey = defaults.secondaryKey;
        }

        public Builder setKeyName(@Nullable String keyName) {
            this.keyName = keyName;
            return this;
        }

        public Builder setPrimaryConnectionString(@Nullable String primaryConnectionString) {
            this.primaryConnectionString = primaryConnectionString;
            return this;
        }

        public Builder setPrimaryKey(@Nullable String primaryKey) {
            this.primaryKey = primaryKey;
            return this;
        }

        public Builder setSecondaryConnectionString(@Nullable String secondaryConnectionString) {
            this.secondaryConnectionString = secondaryConnectionString;
            return this;
        }

        public Builder setSecondaryKey(@Nullable String secondaryKey) {
            this.secondaryKey = secondaryKey;
            return this;
        }

        public ListHybridConnectionKeysResult build() {
            return new ListHybridConnectionKeysResult(keyName, primaryConnectionString, primaryKey, secondaryConnectionString, secondaryKey);
        }
    }
}
