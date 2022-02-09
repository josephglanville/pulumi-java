// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.outputs;

import io.pulumi.azurenative.hybridnetwork.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetVendorResult {
    private final String id;
    private final String name;
    private final String provisioningState;
    private final List<SubResourceResponse> skus;
    private final String type;

    @OutputCustomType.Constructor({"id","name","provisioningState","skus","type"})
    private GetVendorResult(
        String id,
        String name,
        String provisioningState,
        List<SubResourceResponse> skus,
        String type) {
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.skus = Objects.requireNonNull(skus);
        this.type = Objects.requireNonNull(type);
    }

    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public List<SubResourceResponse> getSkus() {
        return this.skus;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVendorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String name;
        private String provisioningState;
        private List<SubResourceResponse> skus;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVendorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.skus = defaults.skus;
    	      this.type = defaults.type;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setSkus(List<SubResourceResponse> skus) {
            this.skus = Objects.requireNonNull(skus);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetVendorResult build() {
            return new GetVendorResult(id, name, provisioningState, skus, type);
        }
    }
}
