// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHostResult {
    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID.
     * 
     */
    private final @Nullable String autoPlacement;
    /**
     * Id of the host created.
     * 
     */
    private final @Nullable String hostId;
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default.
     * 
     */
    private final @Nullable String hostRecovery;

    @CustomType.Constructor
    private GetHostResult(
        @CustomType.Parameter("autoPlacement") @Nullable String autoPlacement,
        @CustomType.Parameter("hostId") @Nullable String hostId,
        @CustomType.Parameter("hostRecovery") @Nullable String hostRecovery) {
        this.autoPlacement = autoPlacement;
        this.hostId = hostId;
        this.hostRecovery = hostRecovery;
    }

    /**
     * Indicates whether the host accepts any untargeted instance launches that match its instance type configuration, or if it only accepts Host tenancy instance launches that specify its unique host ID.
     * 
    */
    public Optional<String> getAutoPlacement() {
        return Optional.ofNullable(this.autoPlacement);
    }
    /**
     * Id of the host created.
     * 
    */
    public Optional<String> getHostId() {
        return Optional.ofNullable(this.hostId);
    }
    /**
     * Indicates whether to enable or disable host recovery for the Dedicated Host. Host recovery is disabled by default.
     * 
    */
    public Optional<String> getHostRecovery() {
        return Optional.ofNullable(this.hostRecovery);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHostResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String autoPlacement;
        private @Nullable String hostId;
        private @Nullable String hostRecovery;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHostResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoPlacement = defaults.autoPlacement;
    	      this.hostId = defaults.hostId;
    	      this.hostRecovery = defaults.hostRecovery;
        }

        public Builder autoPlacement(@Nullable String autoPlacement) {
            this.autoPlacement = autoPlacement;
            return this;
        }
        public Builder hostId(@Nullable String hostId) {
            this.hostId = hostId;
            return this;
        }
        public Builder hostRecovery(@Nullable String hostRecovery) {
            this.hostRecovery = hostRecovery;
            return this;
        }        public GetHostResult build() {
            return new GetHostResult(autoPlacement, hostId, hostRecovery);
        }
    }
}
