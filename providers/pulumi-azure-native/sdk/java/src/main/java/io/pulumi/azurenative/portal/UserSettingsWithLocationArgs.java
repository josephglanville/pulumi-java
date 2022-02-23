// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal;

import io.pulumi.azurenative.portal.inputs.UserPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserSettingsWithLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserSettingsWithLocationArgs Empty = new UserSettingsWithLocationArgs();

    /**
     * The provider location
     * 
     */
    @InputImport(name="location", required=true)
      private final Input<String> location;

    public Input<String> getLocation() {
        return this.location;
    }

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

    public UserSettingsWithLocationArgs(
        Input<String> location,
        Input<UserPropertiesArgs> properties,
        @Nullable Input<String> userSettingsName) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.properties = Objects.requireNonNull(properties, "expected parameter 'properties' to be non-null");
        this.userSettingsName = userSettingsName;
    }

    private UserSettingsWithLocationArgs() {
        this.location = Input.empty();
        this.properties = Input.empty();
        this.userSettingsName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserSettingsWithLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> location;
        private Input<UserPropertiesArgs> properties;
        private @Nullable Input<String> userSettingsName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserSettingsWithLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.properties = defaults.properties;
    	      this.userSettingsName = defaults.userSettingsName;
        }

        public Builder setLocation(Input<String> location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Input.of(Objects.requireNonNull(location));
            return this;
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
        public UserSettingsWithLocationArgs build() {
            return new UserSettingsWithLocationArgs(location, properties, userSettingsName);
        }
    }
}
