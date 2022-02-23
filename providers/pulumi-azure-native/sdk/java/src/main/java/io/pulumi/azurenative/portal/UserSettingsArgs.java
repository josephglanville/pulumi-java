// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.azurenative.portal.inputs.UserPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserSettingsArgs Empty = new UserSettingsArgs();

    /**
     * The cloud shell user settings properties.
     * 
     */
    @InputImport(name="properties", required=true)
      private final Input<UserPropertiesArgs> properties;

    public Input<UserPropertiesArgs> getProperties() {
        return this.properties;
    }

    /**
     * The name of the user settings
     * 
     */
    @InputImport(name="userSettingsName")
      private final @Nullable Input<String> userSettingsName;

    public Input<String> getUserSettingsName() {
        return this.userSettingsName == null ? Input.empty() : this.userSettingsName;
    }

    public UserSettingsArgs(
        Input<UserPropertiesArgs> properties,
        @Nullable Input<String> userSettingsName) {
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.userSettingsName = userSettingsName;
    }

    private UserSettingsArgs() {
        this.properties = Input.empty();
        this.userSettingsName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<UserPropertiesArgs> properties;
        private @Nullable Input<String> userSettingsName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
    	      this.userSettingsName = defaults.userSettingsName;
        }

        public Builder setProperties(Input<UserPropertiesArgs> properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }

        public Builder setProperties(UserPropertiesArgs properties) {
            this.properties = Input.of(Objects.requireNonNull(properties));
            return this;
        }

        public Builder setUserSettingsName(@Nullable Input<String> userSettingsName) {
            this.userSettingsName = userSettingsName;
            return this;
        }

        public Builder setUserSettingsName(@Nullable String userSettingsName) {
            this.userSettingsName = Input.ofNullable(userSettingsName);
            return this;
        }
        public UserSettingsArgs build() {
            return new UserSettingsArgs(properties, userSettingsName);
        }
    }
}
