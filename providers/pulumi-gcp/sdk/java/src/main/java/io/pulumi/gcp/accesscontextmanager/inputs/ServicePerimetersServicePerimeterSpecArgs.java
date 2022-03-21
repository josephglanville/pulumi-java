// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecEgressPolicyArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecIngressPolicyArgs;
import io.pulumi.gcp.accesscontextmanager.inputs.ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterSpecArgs Empty = new ServicePerimetersServicePerimeterSpecArgs();

    /**
     * A list of AccessLevel resource names that allow resources within
     * the ServicePerimeter to be accessed from the internet.
     * AccessLevels listed must be in the same policy as this
     * ServicePerimeter. Referencing a nonexistent AccessLevel is a
     * syntax error. If no AccessLevel names are listed, resources within
     * the perimeter can only be accessed via GCP calls with request
     * origins within the perimeter. For Service Perimeter Bridge, must
     * be empty.
     * Format: accessPolicies/{policy_id}/accessLevels/{access_level_name}
     * 
     */
    @Import(name="accessLevels")
      private final @Nullable Output<List<String>> accessLevels;

    public Output<List<String>> getAccessLevels() {
        return this.accessLevels == null ? Output.empty() : this.accessLevels;
    }

    /**
     * List of EgressPolicies to apply to the perimeter. A perimeter may
     * have multiple EgressPolicies, each of which is evaluated separately.
     * Access is granted if any EgressPolicy grants it. Must be empty for
     * a perimeter bridge.
     * Structure is documented below.
     * 
     */
    @Import(name="egressPolicies")
      private final @Nullable Output<List<ServicePerimetersServicePerimeterSpecEgressPolicyArgs>> egressPolicies;

    public Output<List<ServicePerimetersServicePerimeterSpecEgressPolicyArgs>> getEgressPolicies() {
        return this.egressPolicies == null ? Output.empty() : this.egressPolicies;
    }

    /**
     * List of `IngressPolicies` to apply to the perimeter. A perimeter may
     * have multiple `IngressPolicies`, each of which is evaluated
     * separately. Access is granted if any `Ingress Policy` grants it.
     * Must be empty for a perimeter bridge.
     * Structure is documented below.
     * 
     */
    @Import(name="ingressPolicies")
      private final @Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyArgs>> ingressPolicies;

    public Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyArgs>> getIngressPolicies() {
        return this.ingressPolicies == null ? Output.empty() : this.ingressPolicies;
    }

    /**
     * A list of resources, currently only projects in the form
     * `projects/<projectnumber>`, that match this to stanza. A request matches
     * if it contains a resource in this list. If * is specified for resources,
     * then this `EgressTo` rule will authorize access to all resources outside
     * the perimeter.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    /**
     * GCP services that are subject to the Service Perimeter
     * restrictions. Must contain a list of services. For example, if
     * `storage.googleapis.com` is specified, access to the storage
     * buckets inside the perimeter must meet the perimeter's access
     * restrictions.
     * 
     */
    @Import(name="restrictedServices")
      private final @Nullable Output<List<String>> restrictedServices;

    public Output<List<String>> getRestrictedServices() {
        return this.restrictedServices == null ? Output.empty() : this.restrictedServices;
    }

    /**
     * Specifies how APIs are allowed to communicate within the Service
     * Perimeter.
     * Structure is documented below.
     * 
     */
    @Import(name="vpcAccessibleServices")
      private final @Nullable Output<ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs> vpcAccessibleServices;

    public Output<ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs> getVpcAccessibleServices() {
        return this.vpcAccessibleServices == null ? Output.empty() : this.vpcAccessibleServices;
    }

    public ServicePerimetersServicePerimeterSpecArgs(
        @Nullable Output<List<String>> accessLevels,
        @Nullable Output<List<ServicePerimetersServicePerimeterSpecEgressPolicyArgs>> egressPolicies,
        @Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyArgs>> ingressPolicies,
        @Nullable Output<List<String>> resources,
        @Nullable Output<List<String>> restrictedServices,
        @Nullable Output<ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs> vpcAccessibleServices) {
        this.accessLevels = accessLevels;
        this.egressPolicies = egressPolicies;
        this.ingressPolicies = ingressPolicies;
        this.resources = resources;
        this.restrictedServices = restrictedServices;
        this.vpcAccessibleServices = vpcAccessibleServices;
    }

    private ServicePerimetersServicePerimeterSpecArgs() {
        this.accessLevels = Output.empty();
        this.egressPolicies = Output.empty();
        this.ingressPolicies = Output.empty();
        this.resources = Output.empty();
        this.restrictedServices = Output.empty();
        this.vpcAccessibleServices = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> accessLevels;
        private @Nullable Output<List<ServicePerimetersServicePerimeterSpecEgressPolicyArgs>> egressPolicies;
        private @Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyArgs>> ingressPolicies;
        private @Nullable Output<List<String>> resources;
        private @Nullable Output<List<String>> restrictedServices;
        private @Nullable Output<ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs> vpcAccessibleServices;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevels = defaults.accessLevels;
    	      this.egressPolicies = defaults.egressPolicies;
    	      this.ingressPolicies = defaults.ingressPolicies;
    	      this.resources = defaults.resources;
    	      this.restrictedServices = defaults.restrictedServices;
    	      this.vpcAccessibleServices = defaults.vpcAccessibleServices;
        }

        public Builder accessLevels(@Nullable Output<List<String>> accessLevels) {
            this.accessLevels = accessLevels;
            return this;
        }
        public Builder accessLevels(@Nullable List<String> accessLevels) {
            this.accessLevels = Output.ofNullable(accessLevels);
            return this;
        }
        public Builder accessLevels(String... accessLevels) {
            return accessLevels(List.of(accessLevels));
        }
        public Builder egressPolicies(@Nullable Output<List<ServicePerimetersServicePerimeterSpecEgressPolicyArgs>> egressPolicies) {
            this.egressPolicies = egressPolicies;
            return this;
        }
        public Builder egressPolicies(@Nullable List<ServicePerimetersServicePerimeterSpecEgressPolicyArgs> egressPolicies) {
            this.egressPolicies = Output.ofNullable(egressPolicies);
            return this;
        }
        public Builder egressPolicies(ServicePerimetersServicePerimeterSpecEgressPolicyArgs... egressPolicies) {
            return egressPolicies(List.of(egressPolicies));
        }
        public Builder ingressPolicies(@Nullable Output<List<ServicePerimetersServicePerimeterSpecIngressPolicyArgs>> ingressPolicies) {
            this.ingressPolicies = ingressPolicies;
            return this;
        }
        public Builder ingressPolicies(@Nullable List<ServicePerimetersServicePerimeterSpecIngressPolicyArgs> ingressPolicies) {
            this.ingressPolicies = Output.ofNullable(ingressPolicies);
            return this;
        }
        public Builder ingressPolicies(ServicePerimetersServicePerimeterSpecIngressPolicyArgs... ingressPolicies) {
            return ingressPolicies(List.of(ingressPolicies));
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder restrictedServices(@Nullable Output<List<String>> restrictedServices) {
            this.restrictedServices = restrictedServices;
            return this;
        }
        public Builder restrictedServices(@Nullable List<String> restrictedServices) {
            this.restrictedServices = Output.ofNullable(restrictedServices);
            return this;
        }
        public Builder restrictedServices(String... restrictedServices) {
            return restrictedServices(List.of(restrictedServices));
        }
        public Builder vpcAccessibleServices(@Nullable Output<ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs> vpcAccessibleServices) {
            this.vpcAccessibleServices = vpcAccessibleServices;
            return this;
        }
        public Builder vpcAccessibleServices(@Nullable ServicePerimetersServicePerimeterSpecVpcAccessibleServicesArgs vpcAccessibleServices) {
            this.vpcAccessibleServices = Output.ofNullable(vpcAccessibleServices);
            return this;
        }        public ServicePerimetersServicePerimeterSpecArgs build() {
            return new ServicePerimetersServicePerimeterSpecArgs(accessLevels, egressPolicies, ingressPolicies, resources, restrictedServices, vpcAccessibleServices);
        }
    }
}
