// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.signalrservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ListSignalRKeysResult {
    private final @Nullable String primaryConnectionString;
    private final @Nullable String primaryKey;
    private final @Nullable String secondaryConnectionString;
    private final @Nullable String secondaryKey;

    @OutputCustomType.Constructor({"primaryConnectionString","primaryKey","secondaryConnectionString","secondaryKey"})
    private ListSignalRKeysResult(
        @Nullable String primaryConnectionString,
        @Nullable String primaryKey,
        @Nullable String secondaryConnectionString,
        @Nullable String secondaryKey) {
        this.primaryConnectionString = primaryConnectionString;
        this.primaryKey = primaryKey;
        this.secondaryConnectionString = secondaryConnectionString;
        this.secondaryKey = secondaryKey;
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

    public static Builder builder(ListSignalRKeysResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String primaryConnectionString;
        private @Nullable String primaryKey;
        private @Nullable String secondaryConnectionString;
        private @Nullable String secondaryKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ListSignalRKeysResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.primaryConnectionString = defaults.primaryConnectionString;
    	      this.primaryKey = defaults.primaryKey;
    	      this.secondaryConnectionString = defaults.secondaryConnectionString;
    	      this.secondaryKey = defaults.secondaryKey;
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

        public ListSignalRKeysResult build() {
            return new ListSignalRKeysResult(primaryConnectionString, primaryKey, secondaryConnectionString, secondaryKey);
        }
    }
}