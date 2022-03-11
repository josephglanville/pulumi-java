// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimeterSpecVpcAccessibleServicesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimeterSpecVpcAccessibleServicesArgs Empty = new ServicePerimeterSpecVpcAccessibleServicesArgs();

    /**
     * The list of APIs usable within the Service Perimeter.
     * Must be empty unless `enableRestriction` is True.
     * 
     */
    @InputImport(name="allowedServices")
      private final @Nullable Output<List<String>> allowedServices;

    public Output<List<String>> getAllowedServices() {
        return this.allowedServices == null ? Output.empty() : this.allowedServices;
    }

    /**
     * Whether to restrict API calls within the Service Perimeter to the
     * list of APIs specified in 'allowedServices'.
     * 
     */
    @InputImport(name="enableRestriction")
      private final @Nullable Output<Boolean> enableRestriction;

    public Output<Boolean> getEnableRestriction() {
        return this.enableRestriction == null ? Output.empty() : this.enableRestriction;
    }

    public ServicePerimeterSpecVpcAccessibleServicesArgs(
        @Nullable Output<List<String>> allowedServices,
        @Nullable Output<Boolean> enableRestriction) {
        this.allowedServices = allowedServices;
        this.enableRestriction = enableRestriction;
    }

    private ServicePerimeterSpecVpcAccessibleServicesArgs() {
        this.allowedServices = Output.empty();
        this.enableRestriction = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterSpecVpcAccessibleServicesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> allowedServices;
        private @Nullable Output<Boolean> enableRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterSpecVpcAccessibleServicesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedServices = defaults.allowedServices;
    	      this.enableRestriction = defaults.enableRestriction;
        }

        public Builder allowedServices(@Nullable Output<List<String>> allowedServices) {
            this.allowedServices = allowedServices;
            return this;
        }

        public Builder allowedServices(@Nullable List<String> allowedServices) {
            this.allowedServices = Output.ofNullable(allowedServices);
            return this;
        }

        public Builder enableRestriction(@Nullable Output<Boolean> enableRestriction) {
            this.enableRestriction = enableRestriction;
            return this;
        }

        public Builder enableRestriction(@Nullable Boolean enableRestriction) {
            this.enableRestriction = Output.ofNullable(enableRestriction);
            return this;
        }
        public ServicePerimeterSpecVpcAccessibleServicesArgs build() {
            return new ServicePerimeterSpecVpcAccessibleServicesArgs(allowedServices, enableRestriction);
        }
    }
}
