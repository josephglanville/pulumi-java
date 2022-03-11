// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Managed Identity used for CMK.
 * 
 */
public final class CMKIdentityDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final CMKIdentityDefinitionArgs Empty = new CMKIdentityDefinitionArgs();

    /**
     * The resource id of the user assigned identity to authenticate to customer's key vault.
     * 
     */
    @InputImport(name="userAssignedIdentity")
      private final @Nullable Output<String> userAssignedIdentity;

    public Output<String> getUserAssignedIdentity() {
        return this.userAssignedIdentity == null ? Output.empty() : this.userAssignedIdentity;
    }

    public CMKIdentityDefinitionArgs(@Nullable Output<String> userAssignedIdentity) {
        this.userAssignedIdentity = userAssignedIdentity;
    }

    private CMKIdentityDefinitionArgs() {
        this.userAssignedIdentity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CMKIdentityDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> userAssignedIdentity;

        public Builder() {
    	      // Empty
        }

        public Builder(CMKIdentityDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userAssignedIdentity = defaults.userAssignedIdentity;
        }

        public Builder userAssignedIdentity(@Nullable Output<String> userAssignedIdentity) {
            this.userAssignedIdentity = userAssignedIdentity;
            return this;
        }

        public Builder userAssignedIdentity(@Nullable String userAssignedIdentity) {
            this.userAssignedIdentity = Output.ofNullable(userAssignedIdentity);
            return this;
        }
        public CMKIdentityDefinitionArgs build() {
            return new CMKIdentityDefinitionArgs(userAssignedIdentity);
        }
    }
}
