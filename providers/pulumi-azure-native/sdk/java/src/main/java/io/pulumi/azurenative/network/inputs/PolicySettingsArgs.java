// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.WebApplicationFirewallEnabledState;
import io.pulumi.azurenative.network.enums.WebApplicationFirewallMode;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines contents of a web application firewall global configuration.
 * 
 */
public final class PolicySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicySettingsArgs Empty = new PolicySettingsArgs();

    /**
     * Maximum file upload size in Mb for WAF.
     * 
     */
    @InputImport(name="fileUploadLimitInMb")
      private final @Nullable Input<Integer> fileUploadLimitInMb;

    public Input<Integer> getFileUploadLimitInMb() {
        return this.fileUploadLimitInMb == null ? Input.empty() : this.fileUploadLimitInMb;
    }

    /**
     * Maximum request body size in Kb for WAF.
     * 
     */
    @InputImport(name="maxRequestBodySizeInKb")
      private final @Nullable Input<Integer> maxRequestBodySizeInKb;

    public Input<Integer> getMaxRequestBodySizeInKb() {
        return this.maxRequestBodySizeInKb == null ? Input.empty() : this.maxRequestBodySizeInKb;
    }

    /**
     * The mode of the policy.
     * 
     */
    @InputImport(name="mode")
      private final @Nullable Input<Either<String,WebApplicationFirewallMode>> mode;

    public Input<Either<String,WebApplicationFirewallMode>> getMode() {
        return this.mode == null ? Input.empty() : this.mode;
    }

    /**
     * Whether to allow WAF to check request Body.
     * 
     */
    @InputImport(name="requestBodyCheck")
      private final @Nullable Input<Boolean> requestBodyCheck;

    public Input<Boolean> getRequestBodyCheck() {
        return this.requestBodyCheck == null ? Input.empty() : this.requestBodyCheck;
    }

    /**
     * The state of the policy.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<Either<String,WebApplicationFirewallEnabledState>> state;

    public Input<Either<String,WebApplicationFirewallEnabledState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    public PolicySettingsArgs(
        @Nullable Input<Integer> fileUploadLimitInMb,
        @Nullable Input<Integer> maxRequestBodySizeInKb,
        @Nullable Input<Either<String,WebApplicationFirewallMode>> mode,
        @Nullable Input<Boolean> requestBodyCheck,
        @Nullable Input<Either<String,WebApplicationFirewallEnabledState>> state) {
        this.fileUploadLimitInMb = fileUploadLimitInMb;
        this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
        this.mode = mode;
        this.requestBodyCheck = requestBodyCheck;
        this.state = state;
    }

    private PolicySettingsArgs() {
        this.fileUploadLimitInMb = Input.empty();
        this.maxRequestBodySizeInKb = Input.empty();
        this.mode = Input.empty();
        this.requestBodyCheck = Input.empty();
        this.state = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> fileUploadLimitInMb;
        private @Nullable Input<Integer> maxRequestBodySizeInKb;
        private @Nullable Input<Either<String,WebApplicationFirewallMode>> mode;
        private @Nullable Input<Boolean> requestBodyCheck;
        private @Nullable Input<Either<String,WebApplicationFirewallEnabledState>> state;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fileUploadLimitInMb = defaults.fileUploadLimitInMb;
    	      this.maxRequestBodySizeInKb = defaults.maxRequestBodySizeInKb;
    	      this.mode = defaults.mode;
    	      this.requestBodyCheck = defaults.requestBodyCheck;
    	      this.state = defaults.state;
        }

        public Builder setFileUploadLimitInMb(@Nullable Input<Integer> fileUploadLimitInMb) {
            this.fileUploadLimitInMb = fileUploadLimitInMb;
            return this;
        }

        public Builder setFileUploadLimitInMb(@Nullable Integer fileUploadLimitInMb) {
            this.fileUploadLimitInMb = Input.ofNullable(fileUploadLimitInMb);
            return this;
        }

        public Builder setMaxRequestBodySizeInKb(@Nullable Input<Integer> maxRequestBodySizeInKb) {
            this.maxRequestBodySizeInKb = maxRequestBodySizeInKb;
            return this;
        }

        public Builder setMaxRequestBodySizeInKb(@Nullable Integer maxRequestBodySizeInKb) {
            this.maxRequestBodySizeInKb = Input.ofNullable(maxRequestBodySizeInKb);
            return this;
        }

        public Builder setMode(@Nullable Input<Either<String,WebApplicationFirewallMode>> mode) {
            this.mode = mode;
            return this;
        }

        public Builder setMode(@Nullable Either<String,WebApplicationFirewallMode> mode) {
            this.mode = Input.ofNullable(mode);
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable Input<Boolean> requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable Boolean requestBodyCheck) {
            this.requestBodyCheck = Input.ofNullable(requestBodyCheck);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,WebApplicationFirewallEnabledState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,WebApplicationFirewallEnabledState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }
        public PolicySettingsArgs build() {
            return new PolicySettingsArgs(fileUploadLimitInMb, maxRequestBodySizeInKb, mode, requestBodyCheck, state);
        }
    }
}
