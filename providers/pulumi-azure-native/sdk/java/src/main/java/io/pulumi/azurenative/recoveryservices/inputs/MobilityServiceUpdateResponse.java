// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The Mobility Service update details.
 * 
 */
public final class MobilityServiceUpdateResponse extends io.pulumi.resources.InvokeArgs {

    public static final MobilityServiceUpdateResponse Empty = new MobilityServiceUpdateResponse();

    /**
     * The OS type.
     * 
     */
    @InputImport(name="osType")
      private final @Nullable String osType;

    public Optional<String> getOsType() {
        return this.osType == null ? Optional.empty() : Optional.ofNullable(this.osType);
    }

    /**
     * The reboot status of the update - whether it is required or not.
     * 
     */
    @InputImport(name="rebootStatus")
      private final @Nullable String rebootStatus;

    public Optional<String> getRebootStatus() {
        return this.rebootStatus == null ? Optional.empty() : Optional.ofNullable(this.rebootStatus);
    }

    /**
     * The version of the latest update.
     * 
     */
    @InputImport(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public MobilityServiceUpdateResponse(
        @Nullable String osType,
        @Nullable String rebootStatus,
        @Nullable String version) {
        this.osType = osType;
        this.rebootStatus = rebootStatus;
        this.version = version;
    }

    private MobilityServiceUpdateResponse() {
        this.osType = null;
        this.rebootStatus = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MobilityServiceUpdateResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String osType;
        private @Nullable String rebootStatus;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(MobilityServiceUpdateResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.osType = defaults.osType;
    	      this.rebootStatus = defaults.rebootStatus;
    	      this.version = defaults.version;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = osType;
            return this;
        }

        public Builder setRebootStatus(@Nullable String rebootStatus) {
            this.rebootStatus = rebootStatus;
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }
        public MobilityServiceUpdateResponse build() {
            return new MobilityServiceUpdateResponse(osType, rebootStatus, version);
        }
    }
}
