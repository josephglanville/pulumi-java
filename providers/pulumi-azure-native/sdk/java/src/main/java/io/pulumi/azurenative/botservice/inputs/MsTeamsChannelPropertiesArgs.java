// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The parameters to provide for the Microsoft Teams channel.
 * 
 */
public final class MsTeamsChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MsTeamsChannelPropertiesArgs Empty = new MsTeamsChannelPropertiesArgs();

    /**
     * Whether this channel accepted terms
     * 
     */
    @InputImport(name="acceptedTerms")
      private final @Nullable Output<Boolean> acceptedTerms;

    public Output<Boolean> getAcceptedTerms() {
        return this.acceptedTerms == null ? Output.empty() : this.acceptedTerms;
    }

    /**
     * Webhook for Microsoft Teams channel calls
     * 
     */
    @InputImport(name="callingWebHook")
      private final @Nullable Output<String> callingWebHook;

    public Output<String> getCallingWebHook() {
        return this.callingWebHook == null ? Output.empty() : this.callingWebHook;
    }

    /**
     * Deployment environment for Microsoft Teams channel calls
     * 
     */
    @InputImport(name="deploymentEnvironment")
      private final @Nullable Output<String> deploymentEnvironment;

    public Output<String> getDeploymentEnvironment() {
        return this.deploymentEnvironment == null ? Output.empty() : this.deploymentEnvironment;
    }

    /**
     * Enable calling for Microsoft Teams channel
     * 
     */
    @InputImport(name="enableCalling")
      private final @Nullable Output<Boolean> enableCalling;

    public Output<Boolean> getEnableCalling() {
        return this.enableCalling == null ? Output.empty() : this.enableCalling;
    }

    /**
     * Webhook for Microsoft Teams channel calls
     * 
     */
    @InputImport(name="incomingCallRoute")
      private final @Nullable Output<String> incomingCallRoute;

    public Output<String> getIncomingCallRoute() {
        return this.incomingCallRoute == null ? Output.empty() : this.incomingCallRoute;
    }

    /**
     * Whether this channel is enabled for the bot
     * 
     */
    @InputImport(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    public MsTeamsChannelPropertiesArgs(
        @Nullable Output<Boolean> acceptedTerms,
        @Nullable Output<String> callingWebHook,
        @Nullable Output<String> deploymentEnvironment,
        @Nullable Output<Boolean> enableCalling,
        @Nullable Output<String> incomingCallRoute,
        Output<Boolean> isEnabled) {
        this.acceptedTerms = acceptedTerms == null ? Output.ofNullable(true) : acceptedTerms;
        this.callingWebHook = callingWebHook;
        this.deploymentEnvironment = deploymentEnvironment;
        this.enableCalling = enableCalling;
        this.incomingCallRoute = incomingCallRoute;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
    }

    private MsTeamsChannelPropertiesArgs() {
        this.acceptedTerms = Output.empty();
        this.callingWebHook = Output.empty();
        this.deploymentEnvironment = Output.empty();
        this.enableCalling = Output.empty();
        this.incomingCallRoute = Output.empty();
        this.isEnabled = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MsTeamsChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> acceptedTerms;
        private @Nullable Output<String> callingWebHook;
        private @Nullable Output<String> deploymentEnvironment;
        private @Nullable Output<Boolean> enableCalling;
        private @Nullable Output<String> incomingCallRoute;
        private Output<Boolean> isEnabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MsTeamsChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptedTerms = defaults.acceptedTerms;
    	      this.callingWebHook = defaults.callingWebHook;
    	      this.deploymentEnvironment = defaults.deploymentEnvironment;
    	      this.enableCalling = defaults.enableCalling;
    	      this.incomingCallRoute = defaults.incomingCallRoute;
    	      this.isEnabled = defaults.isEnabled;
        }

        public Builder acceptedTerms(@Nullable Output<Boolean> acceptedTerms) {
            this.acceptedTerms = acceptedTerms;
            return this;
        }

        public Builder acceptedTerms(@Nullable Boolean acceptedTerms) {
            this.acceptedTerms = Output.ofNullable(acceptedTerms);
            return this;
        }

        public Builder callingWebHook(@Nullable Output<String> callingWebHook) {
            this.callingWebHook = callingWebHook;
            return this;
        }

        public Builder callingWebHook(@Nullable String callingWebHook) {
            this.callingWebHook = Output.ofNullable(callingWebHook);
            return this;
        }

        public Builder deploymentEnvironment(@Nullable Output<String> deploymentEnvironment) {
            this.deploymentEnvironment = deploymentEnvironment;
            return this;
        }

        public Builder deploymentEnvironment(@Nullable String deploymentEnvironment) {
            this.deploymentEnvironment = Output.ofNullable(deploymentEnvironment);
            return this;
        }

        public Builder enableCalling(@Nullable Output<Boolean> enableCalling) {
            this.enableCalling = enableCalling;
            return this;
        }

        public Builder enableCalling(@Nullable Boolean enableCalling) {
            this.enableCalling = Output.ofNullable(enableCalling);
            return this;
        }

        public Builder incomingCallRoute(@Nullable Output<String> incomingCallRoute) {
            this.incomingCallRoute = incomingCallRoute;
            return this;
        }

        public Builder incomingCallRoute(@Nullable String incomingCallRoute) {
            this.incomingCallRoute = Output.ofNullable(incomingCallRoute);
            return this;
        }

        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }
        public MsTeamsChannelPropertiesArgs build() {
            return new MsTeamsChannelPropertiesArgs(acceptedTerms, callingWebHook, deploymentEnvironment, enableCalling, incomingCallRoute, isEnabled);
        }
    }
}
