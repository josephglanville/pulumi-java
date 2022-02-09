// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.SysctlConfigResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class LinuxOSConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final LinuxOSConfigResponse Empty = new LinuxOSConfigResponse();

    @InputImport(name="swapFileSizeMB")
    private final @Nullable Integer swapFileSizeMB;

    public Optional<Integer> getSwapFileSizeMB() {
        return this.swapFileSizeMB == null ? Optional.empty() : Optional.ofNullable(this.swapFileSizeMB);
    }

    @InputImport(name="sysctls")
    private final @Nullable SysctlConfigResponse sysctls;

    public Optional<SysctlConfigResponse> getSysctls() {
        return this.sysctls == null ? Optional.empty() : Optional.ofNullable(this.sysctls);
    }

    @InputImport(name="transparentHugePageDefrag")
    private final @Nullable String transparentHugePageDefrag;

    public Optional<String> getTransparentHugePageDefrag() {
        return this.transparentHugePageDefrag == null ? Optional.empty() : Optional.ofNullable(this.transparentHugePageDefrag);
    }

    @InputImport(name="transparentHugePageEnabled")
    private final @Nullable String transparentHugePageEnabled;

    public Optional<String> getTransparentHugePageEnabled() {
        return this.transparentHugePageEnabled == null ? Optional.empty() : Optional.ofNullable(this.transparentHugePageEnabled);
    }

    public LinuxOSConfigResponse(
        @Nullable Integer swapFileSizeMB,
        @Nullable SysctlConfigResponse sysctls,
        @Nullable String transparentHugePageDefrag,
        @Nullable String transparentHugePageEnabled) {
        this.swapFileSizeMB = swapFileSizeMB;
        this.sysctls = sysctls;
        this.transparentHugePageDefrag = transparentHugePageDefrag;
        this.transparentHugePageEnabled = transparentHugePageEnabled;
    }

    private LinuxOSConfigResponse() {
        this.swapFileSizeMB = null;
        this.sysctls = null;
        this.transparentHugePageDefrag = null;
        this.transparentHugePageEnabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxOSConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer swapFileSizeMB;
        private @Nullable SysctlConfigResponse sysctls;
        private @Nullable String transparentHugePageDefrag;
        private @Nullable String transparentHugePageEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxOSConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.swapFileSizeMB = defaults.swapFileSizeMB;
    	      this.sysctls = defaults.sysctls;
    	      this.transparentHugePageDefrag = defaults.transparentHugePageDefrag;
    	      this.transparentHugePageEnabled = defaults.transparentHugePageEnabled;
        }

        public Builder setSwapFileSizeMB(@Nullable Integer swapFileSizeMB) {
            this.swapFileSizeMB = swapFileSizeMB;
            return this;
        }

        public Builder setSysctls(@Nullable SysctlConfigResponse sysctls) {
            this.sysctls = sysctls;
            return this;
        }

        public Builder setTransparentHugePageDefrag(@Nullable String transparentHugePageDefrag) {
            this.transparentHugePageDefrag = transparentHugePageDefrag;
            return this;
        }

        public Builder setTransparentHugePageEnabled(@Nullable String transparentHugePageEnabled) {
            this.transparentHugePageEnabled = transparentHugePageEnabled;
            return this;
        }

        public LinuxOSConfigResponse build() {
            return new LinuxOSConfigResponse(swapFileSizeMB, sysctls, transparentHugePageDefrag, transparentHugePageEnabled);
        }
    }
}
