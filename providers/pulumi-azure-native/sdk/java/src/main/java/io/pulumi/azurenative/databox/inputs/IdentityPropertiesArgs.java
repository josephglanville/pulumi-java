// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.azurenative.databox.inputs.UserAssignedPropertiesArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPropertiesArgs Empty = new IdentityPropertiesArgs();

    @InputImport(name="type")
    private final @Nullable Input<String> type;

    public Input<String> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    @InputImport(name="userAssigned")
    private final @Nullable Input<UserAssignedPropertiesArgs> userAssigned;

    public Input<UserAssignedPropertiesArgs> getUserAssigned() {
        return this.userAssigned == null ? Input.empty() : this.userAssigned;
    }

    public IdentityPropertiesArgs(
        @Nullable Input<String> type,
        @Nullable Input<UserAssignedPropertiesArgs> userAssigned) {
        this.type = type;
        this.userAssigned = userAssigned;
    }

    private IdentityPropertiesArgs() {
        this.type = Input.empty();
        this.userAssigned = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> type;
        private @Nullable Input<UserAssignedPropertiesArgs> userAssigned;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.userAssigned = defaults.userAssigned;
        }

        public Builder setType(@Nullable Input<String> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable String type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setUserAssigned(@Nullable Input<UserAssignedPropertiesArgs> userAssigned) {
            this.userAssigned = userAssigned;
            return this;
        }

        public Builder setUserAssigned(@Nullable UserAssignedPropertiesArgs userAssigned) {
            this.userAssigned = Input.ofNullable(userAssigned);
            return this;
        }

        public IdentityPropertiesArgs build() {
            return new IdentityPropertiesArgs(type, userAssigned);
        }
    }
}
