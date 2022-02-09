// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.labservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VmStateDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final VmStateDetailsResponse Empty = new VmStateDetailsResponse();

    @InputImport(name="lastKnownPowerState", required=true)
    private final String lastKnownPowerState;

    public String getLastKnownPowerState() {
        return this.lastKnownPowerState;
    }

    @InputImport(name="powerState", required=true)
    private final String powerState;

    public String getPowerState() {
        return this.powerState;
    }

    @InputImport(name="rdpAuthority", required=true)
    private final String rdpAuthority;

    public String getRdpAuthority() {
        return this.rdpAuthority;
    }

    @InputImport(name="sshAuthority", required=true)
    private final String sshAuthority;

    public String getSshAuthority() {
        return this.sshAuthority;
    }

    public VmStateDetailsResponse(
        String lastKnownPowerState,
        String powerState,
        String rdpAuthority,
        String sshAuthority) {
        this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState, "expected parameter 'lastKnownPowerState' to be non-null");
        this.powerState = Objects.requireNonNull(powerState, "expected parameter 'powerState' to be non-null");
        this.rdpAuthority = Objects.requireNonNull(rdpAuthority, "expected parameter 'rdpAuthority' to be non-null");
        this.sshAuthority = Objects.requireNonNull(sshAuthority, "expected parameter 'sshAuthority' to be non-null");
    }

    private VmStateDetailsResponse() {
        this.lastKnownPowerState = null;
        this.powerState = null;
        this.rdpAuthority = null;
        this.sshAuthority = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmStateDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String lastKnownPowerState;
        private String powerState;
        private String rdpAuthority;
        private String sshAuthority;

        public Builder() {
    	      // Empty
        }

        public Builder(VmStateDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.lastKnownPowerState = defaults.lastKnownPowerState;
    	      this.powerState = defaults.powerState;
    	      this.rdpAuthority = defaults.rdpAuthority;
    	      this.sshAuthority = defaults.sshAuthority;
        }

        public Builder setLastKnownPowerState(String lastKnownPowerState) {
            this.lastKnownPowerState = Objects.requireNonNull(lastKnownPowerState);
            return this;
        }

        public Builder setPowerState(String powerState) {
            this.powerState = Objects.requireNonNull(powerState);
            return this;
        }

        public Builder setRdpAuthority(String rdpAuthority) {
            this.rdpAuthority = Objects.requireNonNull(rdpAuthority);
            return this;
        }

        public Builder setSshAuthority(String sshAuthority) {
            this.sshAuthority = Objects.requireNonNull(sshAuthority);
            return this;
        }

        public VmStateDetailsResponse build() {
            return new VmStateDetailsResponse(lastKnownPowerState, powerState, rdpAuthority, sshAuthority);
        }
    }
}
