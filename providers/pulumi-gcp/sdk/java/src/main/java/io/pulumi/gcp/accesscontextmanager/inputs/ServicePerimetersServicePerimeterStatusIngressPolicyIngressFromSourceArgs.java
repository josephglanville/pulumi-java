// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs Empty = new ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs();

    /**
     * An `AccessLevel` resource name that allow resources within the
     * `ServicePerimeters` to be accessed from the internet. `AccessLevels` listed
     * must be in the same policy as this `ServicePerimeter`. Referencing a nonexistent
     * `AccessLevel` will cause an error. If no `AccessLevel` names are listed,
     * resources within the perimeter can only be accessed via Google Cloud calls
     * with request origins within the perimeter.
     * Example `accessPolicies/MY_POLICY/accessLevels/MY_LEVEL.`
     * If * is specified, then all IngressSources will be allowed.
     * 
     */
    @InputImport(name="accessLevel")
      private final @Nullable Input<String> accessLevel;

    public Input<String> getAccessLevel() {
        return this.accessLevel == null ? Input.empty() : this.accessLevel;
    }

    /**
     * A Google Cloud resource that is allowed to ingress the perimeter.
     * Requests from these resources will be allowed to access perimeter data.
     * Currently only projects are allowed. Format `projects/{project_number}`
     * The project may be in any Google Cloud organization, not just the
     * organization that the perimeter is defined in. `*` is not allowed, the case
     * of allowing all Google Cloud resources only is not supported.
     * 
     */
    @InputImport(name="resource")
      private final @Nullable Input<String> resource;

    public Input<String> getResource() {
        return this.resource == null ? Input.empty() : this.resource;
    }

    public ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs(
        @Nullable Input<String> accessLevel,
        @Nullable Input<String> resource) {
        this.accessLevel = accessLevel;
        this.resource = resource;
    }

    private ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs() {
        this.accessLevel = Input.empty();
        this.resource = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessLevel;
        private @Nullable Input<String> resource;

        public Builder() {
    	      // Empty
        }

        public Builder(ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLevel = defaults.accessLevel;
    	      this.resource = defaults.resource;
        }

        public Builder setAccessLevel(@Nullable Input<String> accessLevel) {
            this.accessLevel = accessLevel;
            return this;
        }

        public Builder setAccessLevel(@Nullable String accessLevel) {
            this.accessLevel = Input.ofNullable(accessLevel);
            return this;
        }

        public Builder setResource(@Nullable Input<String> resource) {
            this.resource = resource;
            return this;
        }

        public Builder setResource(@Nullable String resource) {
            this.resource = Input.ofNullable(resource);
            return this;
        }
        public ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs build() {
            return new ServicePerimetersServicePerimeterStatusIngressPolicyIngressFromSourceArgs(accessLevel, resource);
        }
    }
}
