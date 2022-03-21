// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Authorization-related information used by Cloud Audit Logging.
 * 
 */
public final class AuthorizationLoggingOptionsResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthorizationLoggingOptionsResponse Empty = new AuthorizationLoggingOptionsResponse();

    /**
     * The type of the permission that was checked.
     * 
     */
    @Import(name="permissionType", required=true)
      private final String permissionType;

    public String getPermissionType() {
        return this.permissionType;
    }

    public AuthorizationLoggingOptionsResponse(String permissionType) {
        this.permissionType = Objects.requireNonNull(permissionType, "expected parameter 'permissionType' to be non-null");
    }

    private AuthorizationLoggingOptionsResponse() {
        this.permissionType = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthorizationLoggingOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String permissionType;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthorizationLoggingOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.permissionType = defaults.permissionType;
        }

        public Builder permissionType(String permissionType) {
            this.permissionType = Objects.requireNonNull(permissionType);
            return this;
        }        public AuthorizationLoggingOptionsResponse build() {
            return new AuthorizationLoggingOptionsResponse(permissionType);
        }
    }
}
