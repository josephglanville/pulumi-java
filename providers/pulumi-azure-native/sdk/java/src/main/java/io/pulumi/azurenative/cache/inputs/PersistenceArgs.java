// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.azurenative.cache.enums.AofFrequency;
import io.pulumi.azurenative.cache.enums.RdbFrequency;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Persistence-related configuration for the RedisEnterprise database
 * 
 */
public final class PersistenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final PersistenceArgs Empty = new PersistenceArgs();

    /**
     * Sets whether AOF is enabled.
     * 
     */
    @InputImport(name="aofEnabled")
      private final @Nullable Input<Boolean> aofEnabled;

    public Input<Boolean> getAofEnabled() {
        return this.aofEnabled == null ? Input.empty() : this.aofEnabled;
    }

    /**
     * Sets the frequency at which data is written to disk.
     * 
     */
    @InputImport(name="aofFrequency")
      private final @Nullable Input<Either<String,AofFrequency>> aofFrequency;

    public Input<Either<String,AofFrequency>> getAofFrequency() {
        return this.aofFrequency == null ? Input.empty() : this.aofFrequency;
    }

    /**
     * Sets whether RDB is enabled.
     * 
     */
    @InputImport(name="rdbEnabled")
      private final @Nullable Input<Boolean> rdbEnabled;

    public Input<Boolean> getRdbEnabled() {
        return this.rdbEnabled == null ? Input.empty() : this.rdbEnabled;
    }

    /**
     * Sets the frequency at which a snapshot of the database is created.
     * 
     */
    @InputImport(name="rdbFrequency")
      private final @Nullable Input<Either<String,RdbFrequency>> rdbFrequency;

    public Input<Either<String,RdbFrequency>> getRdbFrequency() {
        return this.rdbFrequency == null ? Input.empty() : this.rdbFrequency;
    }

    public PersistenceArgs(
        @Nullable Input<Boolean> aofEnabled,
        @Nullable Input<Either<String,AofFrequency>> aofFrequency,
        @Nullable Input<Boolean> rdbEnabled,
        @Nullable Input<Either<String,RdbFrequency>> rdbFrequency) {
        this.aofEnabled = aofEnabled;
        this.aofFrequency = aofFrequency;
        this.rdbEnabled = rdbEnabled;
        this.rdbFrequency = rdbFrequency;
    }

    private PersistenceArgs() {
        this.aofEnabled = Input.empty();
        this.aofFrequency = Input.empty();
        this.rdbEnabled = Input.empty();
        this.rdbFrequency = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PersistenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> aofEnabled;
        private @Nullable Input<Either<String,AofFrequency>> aofFrequency;
        private @Nullable Input<Boolean> rdbEnabled;
        private @Nullable Input<Either<String,RdbFrequency>> rdbFrequency;

        public Builder() {
    	      // Empty
        }

        public Builder(PersistenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aofEnabled = defaults.aofEnabled;
    	      this.aofFrequency = defaults.aofFrequency;
    	      this.rdbEnabled = defaults.rdbEnabled;
    	      this.rdbFrequency = defaults.rdbFrequency;
        }

        public Builder setAofEnabled(@Nullable Input<Boolean> aofEnabled) {
            this.aofEnabled = aofEnabled;
            return this;
        }

        public Builder setAofEnabled(@Nullable Boolean aofEnabled) {
            this.aofEnabled = Input.ofNullable(aofEnabled);
            return this;
        }

        public Builder setAofFrequency(@Nullable Input<Either<String,AofFrequency>> aofFrequency) {
            this.aofFrequency = aofFrequency;
            return this;
        }

        public Builder setAofFrequency(@Nullable Either<String,AofFrequency> aofFrequency) {
            this.aofFrequency = Input.ofNullable(aofFrequency);
            return this;
        }

        public Builder setRdbEnabled(@Nullable Input<Boolean> rdbEnabled) {
            this.rdbEnabled = rdbEnabled;
            return this;
        }

        public Builder setRdbEnabled(@Nullable Boolean rdbEnabled) {
            this.rdbEnabled = Input.ofNullable(rdbEnabled);
            return this;
        }

        public Builder setRdbFrequency(@Nullable Input<Either<String,RdbFrequency>> rdbFrequency) {
            this.rdbFrequency = rdbFrequency;
            return this;
        }

        public Builder setRdbFrequency(@Nullable Either<String,RdbFrequency> rdbFrequency) {
            this.rdbFrequency = Input.ofNullable(rdbFrequency);
            return this;
        }
        public PersistenceArgs build() {
            return new PersistenceArgs(aofEnabled, aofFrequency, rdbEnabled, rdbFrequency);
        }
    }
}
