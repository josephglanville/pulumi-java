// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.accesscontextmanager_v1beta.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class VpcAccessibleServicesResponse {
    /**
     * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction' is True. You can specify a list of individual services, as well as include the 'RESTRICTED-SERVICES' value, which automatically includes all of the services protected by the perimeter.
     * 
     */
    private final List<String> allowedServices;
    /**
     * Whether to restrict API calls within the Service Perimeter to the list of APIs specified in 'allowed_services'.
     * 
     */
    private final Boolean enableRestriction;

    @CustomType.Constructor
    private VpcAccessibleServicesResponse(
        @CustomType.Parameter("allowedServices") List<String> allowedServices,
        @CustomType.Parameter("enableRestriction") Boolean enableRestriction) {
        this.allowedServices = allowedServices;
        this.enableRestriction = enableRestriction;
    }

    /**
     * The list of APIs usable within the Service Perimeter. Must be empty unless 'enable_restriction' is True. You can specify a list of individual services, as well as include the 'RESTRICTED-SERVICES' value, which automatically includes all of the services protected by the perimeter.
     * 
    */
    public List<String> getAllowedServices() {
        return this.allowedServices;
    }
    /**
     * Whether to restrict API calls within the Service Perimeter to the list of APIs specified in 'allowed_services'.
     * 
    */
    public Boolean getEnableRestriction() {
        return this.enableRestriction;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcAccessibleServicesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> allowedServices;
        private Boolean enableRestriction;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcAccessibleServicesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedServices = defaults.allowedServices;
    	      this.enableRestriction = defaults.enableRestriction;
        }

        public Builder allowedServices(List<String> allowedServices) {
            this.allowedServices = Objects.requireNonNull(allowedServices);
            return this;
        }
        public Builder allowedServices(String... allowedServices) {
            return allowedServices(List.of(allowedServices));
        }
        public Builder enableRestriction(Boolean enableRestriction) {
            this.enableRestriction = Objects.requireNonNull(enableRestriction);
            return this;
        }        public VpcAccessibleServicesResponse build() {
            return new VpcAccessibleServicesResponse(allowedServices, enableRestriction);
        }
    }
}
