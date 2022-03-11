// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The key authorization type integration runtime.
 * 
 */
public final class LinkedIntegrationRuntimeKeyAuthorizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final LinkedIntegrationRuntimeKeyAuthorizationArgs Empty = new LinkedIntegrationRuntimeKeyAuthorizationArgs();

    /**
     * The authorization type for integration runtime sharing.
     * Expected value is 'Key'.
     * 
     */
    @InputImport(name="authorizationType", required=true)
      private final Output<String> authorizationType;

    public Output<String> getAuthorizationType() {
        return this.authorizationType;
    }

    /**
     * The key used for authorization.
     * 
     */
    @InputImport(name="key", required=true)
      private final Output<SecureStringArgs> key;

    public Output<SecureStringArgs> getKey() {
        return this.key;
    }

    public LinkedIntegrationRuntimeKeyAuthorizationArgs(
        Output<String> authorizationType,
        Output<SecureStringArgs> key) {
        this.authorizationType = Objects.requireNonNull(authorizationType, "expected parameter 'authorizationType' to be non-null");
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
    }

    private LinkedIntegrationRuntimeKeyAuthorizationArgs() {
        this.authorizationType = Output.empty();
        this.key = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LinkedIntegrationRuntimeKeyAuthorizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> authorizationType;
        private Output<SecureStringArgs> key;

        public Builder() {
    	      // Empty
        }

        public Builder(LinkedIntegrationRuntimeKeyAuthorizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationType = defaults.authorizationType;
    	      this.key = defaults.key;
        }

        public Builder authorizationType(Output<String> authorizationType) {
            this.authorizationType = Objects.requireNonNull(authorizationType);
            return this;
        }

        public Builder authorizationType(String authorizationType) {
            this.authorizationType = Output.of(Objects.requireNonNull(authorizationType));
            return this;
        }

        public Builder key(Output<SecureStringArgs> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(SecureStringArgs key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }
        public LinkedIntegrationRuntimeKeyAuthorizationArgs build() {
            return new LinkedIntegrationRuntimeKeyAuthorizationArgs(authorizationType, key);
        }
    }
}
