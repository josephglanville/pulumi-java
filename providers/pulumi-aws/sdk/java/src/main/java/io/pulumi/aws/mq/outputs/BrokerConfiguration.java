// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.mq.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class BrokerConfiguration {
    /**
     * The Configuration ID.
     * 
     */
    private final @Nullable String id;
    /**
     * Revision of the Configuration.
     * 
     */
    private final @Nullable Integer revision;

    @CustomType.Constructor
    private BrokerConfiguration(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("revision") @Nullable Integer revision) {
        this.id = id;
        this.revision = revision;
    }

    /**
     * The Configuration ID.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * Revision of the Configuration.
     * 
    */
    public Optional<Integer> getRevision() {
        return Optional.ofNullable(this.revision);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BrokerConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable Integer revision;

        public Builder() {
    	      // Empty
        }

        public Builder(BrokerConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.revision = defaults.revision;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder revision(@Nullable Integer revision) {
            this.revision = revision;
            return this;
        }        public BrokerConfiguration build() {
            return new BrokerConfiguration(id, revision);
        }
    }
}