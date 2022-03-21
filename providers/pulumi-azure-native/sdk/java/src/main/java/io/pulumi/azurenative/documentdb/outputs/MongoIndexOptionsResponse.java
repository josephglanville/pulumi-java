// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.documentdb.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MongoIndexOptionsResponse {
    /**
     * Expire after seconds
     * 
     */
    private final @Nullable Integer expireAfterSeconds;
    /**
     * Is unique or not
     * 
     */
    private final @Nullable Boolean unique;

    @CustomType.Constructor
    private MongoIndexOptionsResponse(
        @CustomType.Parameter("expireAfterSeconds") @Nullable Integer expireAfterSeconds,
        @CustomType.Parameter("unique") @Nullable Boolean unique) {
        this.expireAfterSeconds = expireAfterSeconds;
        this.unique = unique;
    }

    /**
     * Expire after seconds
     * 
    */
    public Optional<Integer> getExpireAfterSeconds() {
        return Optional.ofNullable(this.expireAfterSeconds);
    }
    /**
     * Is unique or not
     * 
    */
    public Optional<Boolean> getUnique() {
        return Optional.ofNullable(this.unique);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MongoIndexOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer expireAfterSeconds;
        private @Nullable Boolean unique;

        public Builder() {
    	      // Empty
        }

        public Builder(MongoIndexOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expireAfterSeconds = defaults.expireAfterSeconds;
    	      this.unique = defaults.unique;
        }

        public Builder expireAfterSeconds(@Nullable Integer expireAfterSeconds) {
            this.expireAfterSeconds = expireAfterSeconds;
            return this;
        }
        public Builder unique(@Nullable Boolean unique) {
            this.unique = unique;
            return this;
        }        public MongoIndexOptionsResponse build() {
            return new MongoIndexOptionsResponse(expireAfterSeconds, unique);
        }
    }
}
