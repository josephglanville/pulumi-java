// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs Empty = new ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs();

    /**
     * Value for `method` should be a valid method name for the corresponding
     * `serviceName` in `ApiOperation`. If `*` used as value for method,
     * then ALL methods and permissions are allowed.
     * 
     */
    @Import(name="method")
      private final @Nullable Output<String> method;

    public Output<String> getMethod() {
        return this.method == null ? Output.empty() : this.method;
    }

    /**
     * Value for permission should be a valid Cloud IAM permission for the
     * corresponding `serviceName` in `ApiOperation`.
     * 
     */
    @Import(name="permission")
      private final @Nullable Output<String> permission;

    public Output<String> getPermission() {
        return this.permission == null ? Output.empty() : this.permission;
    }

    public ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs(
        @Nullable Output<String> method,
        @Nullable Output<String> permission) {
        this.method = method;
        this.permission = permission;
    }

    private ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs() {
        this.method = Output.empty();
        this.permission = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> method;
        private @Nullable Output<String> permission;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.method = defaults.method;
    	      this.permission = defaults.permission;
        }

        public Builder method(@Nullable Output<String> method) {
            this.method = method;
            return this;
        }
        public Builder method(@Nullable String method) {
            this.method = Output.ofNullable(method);
            return this;
        }
        public Builder permission(@Nullable Output<String> permission) {
            this.permission = permission;
            return this;
        }
        public Builder permission(@Nullable String permission) {
            this.permission = Output.ofNullable(permission);
            return this;
        }        public ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs build() {
            return new ServicePerimeterStatusEgressPolicyEgressToOperationMethodSelectorGetArgs(method, permission);
        }
    }
}
