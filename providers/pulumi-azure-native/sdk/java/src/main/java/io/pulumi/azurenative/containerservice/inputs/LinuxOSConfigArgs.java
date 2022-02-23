// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.SysctlConfigArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * OS configurations of Linux agent nodes.
 * 
 */
public final class LinuxOSConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinuxOSConfigArgs Empty = new LinuxOSConfigArgs();

    /**
     * SwapFileSizeMB specifies size in MB of a swap file will be created on each node.
     * 
     */
    @InputImport(name="swapFileSizeMB")
      private final @Nullable Input<Integer> swapFileSizeMB;

    public Input<Integer> getSwapFileSizeMB() {
        return this.swapFileSizeMB == null ? Input.empty() : this.swapFileSizeMB;
    }

    /**
     * Sysctl settings for Linux agent nodes.
     * 
     */
    @InputImport(name="sysctls")
      private final @Nullable Input<SysctlConfigArgs> sysctls;

    public Input<SysctlConfigArgs> getSysctls() {
        return this.sysctls == null ? Input.empty() : this.sysctls;
    }

    /**
     * Transparent Huge Page defrag configuration.
     * 
     */
    @InputImport(name="transparentHugePageDefrag")
      private final @Nullable Input<String> transparentHugePageDefrag;

    public Input<String> getTransparentHugePageDefrag() {
        return this.transparentHugePageDefrag == null ? Input.empty() : this.transparentHugePageDefrag;
    }

    /**
     * Transparent Huge Page enabled configuration.
     * 
     */
    @InputImport(name="transparentHugePageEnabled")
      private final @Nullable Input<String> transparentHugePageEnabled;

    public Input<String> getTransparentHugePageEnabled() {
        return this.transparentHugePageEnabled == null ? Input.empty() : this.transparentHugePageEnabled;
    }

    public LinuxOSConfigArgs(
        @Nullable Input<Integer> swapFileSizeMB,
        @Nullable Input<SysctlConfigArgs> sysctls,
        @Nullable Input<String> transparentHugePageDefrag,
        @Nullable Input<String> transparentHugePageEnabled) {
        this.swapFileSizeMB = swapFileSizeMB;
        this.sysctls = sysctls;
        this.transparentHugePageDefrag = transparentHugePageDefrag;
        this.transparentHugePageEnabled = transparentHugePageEnabled;
    }

    private LinuxOSConfigArgs() {
        this.swapFileSizeMB = Input.empty();
        this.sysctls = Input.empty();
        this.transparentHugePageDefrag = Input.empty();
        this.transparentHugePageEnabled = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinuxOSConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> swapFileSizeMB;
        private @Nullable Input<SysctlConfigArgs> sysctls;
        private @Nullable Input<String> transparentHugePageDefrag;
        private @Nullable Input<String> transparentHugePageEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(LinuxOSConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.swapFileSizeMB = defaults.swapFileSizeMB;
    	      this.sysctls = defaults.sysctls;
    	      this.transparentHugePageDefrag = defaults.transparentHugePageDefrag;
    	      this.transparentHugePageEnabled = defaults.transparentHugePageEnabled;
        }

        public Builder setSwapFileSizeMB(@Nullable Input<Integer> swapFileSizeMB) {
            this.swapFileSizeMB = swapFileSizeMB;
            return this;
        }

        public Builder setSwapFileSizeMB(@Nullable Integer swapFileSizeMB) {
            this.swapFileSizeMB = Input.ofNullable(swapFileSizeMB);
            return this;
        }

        public Builder setSysctls(@Nullable Input<SysctlConfigArgs> sysctls) {
            this.sysctls = sysctls;
            return this;
        }

        public Builder setSysctls(@Nullable SysctlConfigArgs sysctls) {
            this.sysctls = Input.ofNullable(sysctls);
            return this;
        }

        public Builder setTransparentHugePageDefrag(@Nullable Input<String> transparentHugePageDefrag) {
            this.transparentHugePageDefrag = transparentHugePageDefrag;
            return this;
        }

        public Builder setTransparentHugePageDefrag(@Nullable String transparentHugePageDefrag) {
            this.transparentHugePageDefrag = Input.ofNullable(transparentHugePageDefrag);
            return this;
        }

        public Builder setTransparentHugePageEnabled(@Nullable Input<String> transparentHugePageEnabled) {
            this.transparentHugePageEnabled = transparentHugePageEnabled;
            return this;
        }

        public Builder setTransparentHugePageEnabled(@Nullable String transparentHugePageEnabled) {
            this.transparentHugePageEnabled = Input.ofNullable(transparentHugePageEnabled);
            return this;
        }
        public LinuxOSConfigArgs build() {
            return new LinuxOSConfigArgs(swapFileSizeMB, sysctls, transparentHugePageDefrag, transparentHugePageEnabled);
        }
    }
}
