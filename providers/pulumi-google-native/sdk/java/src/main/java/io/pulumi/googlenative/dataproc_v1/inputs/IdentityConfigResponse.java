// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;


/**
 * Identity related configuration, including service account based secure multi-tenancy user mappings.
 * 
 */
public final class IdentityConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final IdentityConfigResponse Empty = new IdentityConfigResponse();

    /**
     * Map of user to service account.
     * 
     */
    @Import(name="userServiceAccountMapping", required=true)
      private final Map<String,String> userServiceAccountMapping;

    public Map<String,String> getUserServiceAccountMapping() {
        return this.userServiceAccountMapping;
    }

    public IdentityConfigResponse(Map<String,String> userServiceAccountMapping) {
        this.userServiceAccountMapping = Objects.requireNonNull(userServiceAccountMapping, "expected parameter 'userServiceAccountMapping' to be non-null");
    }

    private IdentityConfigResponse() {
        this.userServiceAccountMapping = Map.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,String> userServiceAccountMapping;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.userServiceAccountMapping = defaults.userServiceAccountMapping;
        }

        public Builder userServiceAccountMapping(Map<String,String> userServiceAccountMapping) {
            this.userServiceAccountMapping = Objects.requireNonNull(userServiceAccountMapping);
            return this;
        }        public IdentityConfigResponse build() {
            return new IdentityConfigResponse(userServiceAccountMapping);
        }
    }
}
