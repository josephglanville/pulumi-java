// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetPropertyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetPropertyArgs Empty = new GetPropertyArgs();

    @InputImport(name="propId", required=true)
    private final String propId;

    public String getPropId() {
        return this.propId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serviceName", required=true)
    private final String serviceName;

    public String getServiceName() {
        return this.serviceName;
    }

    public GetPropertyArgs(
        String propId,
        String resourceGroupName,
        String serviceName) {
        this.propId = Objects.requireNonNull(propId, "expected parameter 'propId' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
    }

    private GetPropertyArgs() {
        this.propId = null;
        this.resourceGroupName = null;
        this.serviceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String propId;
        private String resourceGroupName;
        private String serviceName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPropertyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.propId = defaults.propId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
        }

        public Builder setPropId(String propId) {
            this.propId = Objects.requireNonNull(propId);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public GetPropertyArgs build() {
            return new GetPropertyArgs(propId, resourceGroupName, serviceName);
        }
    }
}
