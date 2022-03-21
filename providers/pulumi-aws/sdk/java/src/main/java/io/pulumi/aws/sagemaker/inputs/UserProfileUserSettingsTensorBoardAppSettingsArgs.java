// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.aws.sagemaker.inputs.UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class UserProfileUserSettingsTensorBoardAppSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserProfileUserSettingsTensorBoardAppSettingsArgs Empty = new UserProfileUserSettingsTensorBoardAppSettingsArgs();

    /**
     * The default instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance. see Default Resource Spec below.
     * 
     */
    @Import(name="defaultResourceSpec", required=true)
      private final Output<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

    public Output<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> getDefaultResourceSpec() {
        return this.defaultResourceSpec;
    }

    public UserProfileUserSettingsTensorBoardAppSettingsArgs(Output<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
        this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec, "expected parameter 'defaultResourceSpec' to be non-null");
    }

    private UserProfileUserSettingsTensorBoardAppSettingsArgs() {
        this.defaultResourceSpec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserProfileUserSettingsTensorBoardAppSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec;

        public Builder() {
    	      // Empty
        }

        public Builder(UserProfileUserSettingsTensorBoardAppSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultResourceSpec = defaults.defaultResourceSpec;
        }

        public Builder defaultResourceSpec(Output<UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs> defaultResourceSpec) {
            this.defaultResourceSpec = Objects.requireNonNull(defaultResourceSpec);
            return this;
        }
        public Builder defaultResourceSpec(UserProfileUserSettingsTensorBoardAppSettingsDefaultResourceSpecArgs defaultResourceSpec) {
            this.defaultResourceSpec = Output.of(Objects.requireNonNull(defaultResourceSpec));
            return this;
        }        public UserProfileUserSettingsTensorBoardAppSettingsArgs build() {
            return new UserProfileUserSettingsTensorBoardAppSettingsArgs(defaultResourceSpec);
        }
    }
}
