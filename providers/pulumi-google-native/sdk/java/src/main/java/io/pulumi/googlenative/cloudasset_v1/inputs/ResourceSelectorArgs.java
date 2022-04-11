// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudasset_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * Specifies the resource to analyze for access policies, which may be set directly on the resource, or on ancestors such as organizations, folders or projects.
 * 
 */
public final class ResourceSelectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSelectorArgs Empty = new ResourceSelectorArgs();

    /**
     * The [full resource name] (https://cloud.google.com/asset-inventory/docs/resource-name-format) of a resource of [supported resource types](https://cloud.google.com/asset-inventory/docs/supported-asset-types#analyzable_asset_types).
     * 
     */
    @Import(name="fullResourceName", required=true)
      private final Output<String> fullResourceName;

    public Output<String> getFullResourceName() {
        return this.fullResourceName;
    }

    public ResourceSelectorArgs(Output<String> fullResourceName) {
        this.fullResourceName = Objects.requireNonNull(fullResourceName, "expected parameter 'fullResourceName' to be non-null");
    }

    private ResourceSelectorArgs() {
        this.fullResourceName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSelectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> fullResourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSelectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullResourceName = defaults.fullResourceName;
        }

        public Builder fullResourceName(Output<String> fullResourceName) {
            this.fullResourceName = Objects.requireNonNull(fullResourceName);
            return this;
        }
        public Builder fullResourceName(String fullResourceName) {
            this.fullResourceName = Output.of(Objects.requireNonNull(fullResourceName));
            return this;
        }        public ResourceSelectorArgs build() {
            return new ResourceSelectorArgs(fullResourceName);
        }
    }
}
