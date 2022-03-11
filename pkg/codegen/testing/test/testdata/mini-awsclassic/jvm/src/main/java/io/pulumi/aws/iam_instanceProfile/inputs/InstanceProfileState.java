// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam_instanceProfile.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceProfileState extends io.pulumi.resources.ResourceArgs {

    public static final InstanceProfileState Empty = new InstanceProfileState();

    /**
     * Name of the role to add to the profile.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public InstanceProfileState(@Nullable Output<String> role) {
        this.role = role;
    }

    private InstanceProfileState() {
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceProfileState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceProfileState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.role = defaults.role;
        }

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }
        public InstanceProfileState build() {
            return new InstanceProfileState(role);
        }
    }
}
