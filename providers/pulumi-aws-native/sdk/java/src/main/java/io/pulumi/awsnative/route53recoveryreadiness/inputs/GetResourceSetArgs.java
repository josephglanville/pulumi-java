// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53recoveryreadiness.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetResourceSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourceSetArgs Empty = new GetResourceSetArgs();

    /**
     * The name of the resource set to create.
     * 
     */
    @InputImport(name="resourceSetName", required=true)
      private final String resourceSetName;

    public String getResourceSetName() {
        return this.resourceSetName;
    }

    public GetResourceSetArgs(String resourceSetName) {
        this.resourceSetName = Objects.requireNonNull(resourceSetName, "expected parameter 'resourceSetName' to be non-null");
    }

    private GetResourceSetArgs() {
        this.resourceSetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceSetName = defaults.resourceSetName;
        }

        public Builder setResourceSetName(String resourceSetName) {
            this.resourceSetName = Objects.requireNonNull(resourceSetName);
            return this;
        }
        public GetResourceSetArgs build() {
            return new GetResourceSetArgs(resourceSetName);
        }
    }
}
