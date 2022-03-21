// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServicePerimeterStatusVpcAccessibleServices {
    /**
     * The list of APIs usable within the Service Perimeter.
     * Must be empty unless `enableRestriction` is True.
     * 
     */
    private final @Nullable List<String> allowedServices;
    /**
     * Whether to restrict API calls within the Service Perimeter to the
     * list of APIs specified in 'allowedServices'.
     * 
     */
    private final @Nullable Boolean enableRestriction;

    @CustomType.Constructor
    private ServicePerimeterStatusVpcAccessibleServices(
        @CustomType.Parameter("allowedServices") @Nullable List<String> allowedServices,
        @CustomType.Parameter("enableRestriction") @Nullable Boolean enableRestriction) {
        this.allowedServices = allowedServices;
        this.enableRestriction = enableRestriction;
    }

    /**
     * The list of APIs usable within the Service Perimeter.
     * Must be empty unless `enableRestriction` is True.
     * 
    */
    public List<String> getAllowedServices() {
        return this.allowedServices == null ? List.of() : this.allowedServices;
    }
    /**
     * Whether to restrict API calls within the Service Perimeter to the
     * list of APIs specified in 'allowedServices'.
     * 
    */
    public Optional<Boolean> getEnableRestriction() {
        return Optional.ofNullable(this.enableRestriction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimeterStatusVpcAccessibleServices defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedServices;
        private @Nullable Boolean enableRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimeterStatusVpcAccessibleServices defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedServices = defaults.allowedServices;
    	      this.enableRestriction = defaults.enableRestriction;
        }

        public Builder allowedServices(@Nullable List<String> allowedServices) {
            this.allowedServices = allowedServices;
            return this;
        }
        public Builder allowedServices(String... allowedServices) {
            return allowedServices(List.of(allowedServices));
        }
        public Builder enableRestriction(@Nullable Boolean enableRestriction) {
            this.enableRestriction = enableRestriction;
            return this;
        }        public ServicePerimeterStatusVpcAccessibleServices build() {
            return new ServicePerimeterStatusVpcAccessibleServices(allowedServices, enableRestriction);
        }
    }
}
