// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolDeviceConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolDeviceConfigurationGetArgs Empty = new UserPoolDeviceConfigurationGetArgs();

    /**
     * Whether a challenge is required on a new device. Only applicable to a new device.
     * 
     */
    @Import(name="challengeRequiredOnNewDevice")
      private final @Nullable Output<Boolean> challengeRequiredOnNewDevice;

    public Output<Boolean> getChallengeRequiredOnNewDevice() {
        return this.challengeRequiredOnNewDevice == null ? Codegen.empty() : this.challengeRequiredOnNewDevice;
    }

    /**
     * Whether a device is only remembered on user prompt. `false` equates to "Always" remember, `true` is "User Opt In," and not using a `device_configuration` block is "No."
     * 
     */
    @Import(name="deviceOnlyRememberedOnUserPrompt")
      private final @Nullable Output<Boolean> deviceOnlyRememberedOnUserPrompt;

    public Output<Boolean> getDeviceOnlyRememberedOnUserPrompt() {
        return this.deviceOnlyRememberedOnUserPrompt == null ? Codegen.empty() : this.deviceOnlyRememberedOnUserPrompt;
    }

    public UserPoolDeviceConfigurationGetArgs(
        @Nullable Output<Boolean> challengeRequiredOnNewDevice,
        @Nullable Output<Boolean> deviceOnlyRememberedOnUserPrompt) {
        this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
        this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
    }

    private UserPoolDeviceConfigurationGetArgs() {
        this.challengeRequiredOnNewDevice = Codegen.empty();
        this.deviceOnlyRememberedOnUserPrompt = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolDeviceConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> challengeRequiredOnNewDevice;
        private @Nullable Output<Boolean> deviceOnlyRememberedOnUserPrompt;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolDeviceConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.challengeRequiredOnNewDevice = defaults.challengeRequiredOnNewDevice;
    	      this.deviceOnlyRememberedOnUserPrompt = defaults.deviceOnlyRememberedOnUserPrompt;
        }

        public Builder challengeRequiredOnNewDevice(@Nullable Output<Boolean> challengeRequiredOnNewDevice) {
            this.challengeRequiredOnNewDevice = challengeRequiredOnNewDevice;
            return this;
        }
        public Builder challengeRequiredOnNewDevice(@Nullable Boolean challengeRequiredOnNewDevice) {
            this.challengeRequiredOnNewDevice = Codegen.ofNullable(challengeRequiredOnNewDevice);
            return this;
        }
        public Builder deviceOnlyRememberedOnUserPrompt(@Nullable Output<Boolean> deviceOnlyRememberedOnUserPrompt) {
            this.deviceOnlyRememberedOnUserPrompt = deviceOnlyRememberedOnUserPrompt;
            return this;
        }
        public Builder deviceOnlyRememberedOnUserPrompt(@Nullable Boolean deviceOnlyRememberedOnUserPrompt) {
            this.deviceOnlyRememberedOnUserPrompt = Codegen.ofNullable(deviceOnlyRememberedOnUserPrompt);
            return this;
        }        public UserPoolDeviceConfigurationGetArgs build() {
            return new UserPoolDeviceConfigurationGetArgs(challengeRequiredOnNewDevice, deviceOnlyRememberedOnUserPrompt);
        }
    }
}
