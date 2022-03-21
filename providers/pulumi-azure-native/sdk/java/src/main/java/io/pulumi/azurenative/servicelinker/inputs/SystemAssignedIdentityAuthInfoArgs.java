// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicelinker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The authentication info when authType is systemAssignedIdentity
 * 
 */
public final class SystemAssignedIdentityAuthInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final SystemAssignedIdentityAuthInfoArgs Empty = new SystemAssignedIdentityAuthInfoArgs();

    /**
     * The authentication type.
     * Expected value is 'systemAssignedIdentity'.
     * 
     */
    @Import(name="authType", required=true)
      private final Output<String> authType;

    public Output<String> getAuthType() {
        return this.authType;
    }

    public SystemAssignedIdentityAuthInfoArgs(Output<String> authType) {
        this.authType = Objects.requireNonNull(authType, "expected parameter 'authType' to be non-null");
    }

    private SystemAssignedIdentityAuthInfoArgs() {
        this.authType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SystemAssignedIdentityAuthInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authType;

        public Builder() {
    	      // Empty
        }

        public Builder(SystemAssignedIdentityAuthInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authType = defaults.authType;
        }

        public Builder authType(Output<String> authType) {
            this.authType = Objects.requireNonNull(authType);
            return this;
        }
        public Builder authType(String authType) {
            this.authType = Output.of(Objects.requireNonNull(authType));
            return this;
        }        public SystemAssignedIdentityAuthInfoArgs build() {
            return new SystemAssignedIdentityAuthInfoArgs(authType);
        }
    }
}
