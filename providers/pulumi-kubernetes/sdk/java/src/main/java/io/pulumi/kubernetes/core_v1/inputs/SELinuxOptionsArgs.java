// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SELinuxOptions are the labels to be applied to the container
 * 
 */
public final class SELinuxOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SELinuxOptionsArgs Empty = new SELinuxOptionsArgs();

    /**
     * Level is SELinux level label that applies to the container.
     * 
     */
    @InputImport(name="level")
      private final @Nullable Input<String> level;

    public Input<String> getLevel() {
        return this.level == null ? Input.empty() : this.level;
    }

    /**
     * Role is a SELinux role label that applies to the container.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    /**
     * Type is a SELinux type label that applies to the container.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * User is a SELinux user label that applies to the container.
     * 
     */
    @InputImport(name="user")
      private final @Nullable Input<String> user;

    public Input<String> getUser() {
        return this.user == null ? Input.empty() : this.user;
    }

    public SELinuxOptionsArgs(
        @Nullable Input<String> level,
        @Nullable Input<String> role,
        @Nullable Input<String> type,
        @Nullable Input<String> user) {
        this.level = level;
        this.role = role;
        this.type = type;
        this.user = user;
    }

    private SELinuxOptionsArgs() {
        this.level = Input.empty();
        this.role = Input.empty();
        this.type = Input.empty();
        this.user = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SELinuxOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> level;
        private @Nullable Input<String> role;
        private @Nullable Input<String> type;
        private @Nullable Input<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(SELinuxOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.level = defaults.level;
    	      this.role = defaults.role;
    	      this.type = defaults.type;
    	      this.user = defaults.user;
        }

        public Builder setLevel(@Nullable Input<String> level) {
            this.level = level;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = Input.ofNullable(level);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUser(@Nullable Input<String> user) {
            this.user = user;
            return this;
        }

        public Builder setUser(@Nullable String user) {
            this.user = Input.ofNullable(user);
            return this;
        }
        public SELinuxOptionsArgs build() {
            return new SELinuxOptionsArgs(level, role, type, user);
        }
    }
}
