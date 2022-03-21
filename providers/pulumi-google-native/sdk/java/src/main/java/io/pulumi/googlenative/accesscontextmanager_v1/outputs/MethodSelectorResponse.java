// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class MethodSelectorResponse {
    /**
     * Value for `method` should be a valid method name for the corresponding `service_name` in ApiOperation. If `*` used as value for `method`, then ALL methods and permissions are allowed.
     * 
     */
    private final String method;
    /**
     * Value for `permission` should be a valid Cloud IAM permission for the corresponding `service_name` in ApiOperation.
     * 
     */
    private final String permission;

    @CustomType.Constructor
    private MethodSelectorResponse(
        @CustomType.Parameter("method") String method,
        @CustomType.Parameter("permission") String permission) {
        this.method = method;
        this.permission = permission;
    }

    /**
     * Value for `method` should be a valid method name for the corresponding `service_name` in ApiOperation. If `*` used as value for `method`, then ALL methods and permissions are allowed.
     * 
    */
    public String getMethod() {
        return this.method;
    }
    /**
     * Value for `permission` should be a valid Cloud IAM permission for the corresponding `service_name` in ApiOperation.
     * 
    */
    public String getPermission() {
        return this.permission;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodSelectorResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String method;
        private String permission;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodSelectorResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.permission = defaults.permission;
        }

        public Builder method(String method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder permission(String permission) {
            this.permission = Objects.requireNonNull(permission);
            return this;
        }        public MethodSelectorResponse build() {
            return new MethodSelectorResponse(method, permission);
        }
    }
}
