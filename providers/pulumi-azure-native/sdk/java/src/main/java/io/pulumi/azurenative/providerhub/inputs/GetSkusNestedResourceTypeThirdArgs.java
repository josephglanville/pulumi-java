// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSkusNestedResourceTypeThirdArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSkusNestedResourceTypeThirdArgs Empty = new GetSkusNestedResourceTypeThirdArgs();

    @InputImport(name="nestedResourceTypeFirst", required=true)
    private final String nestedResourceTypeFirst;

    public String getNestedResourceTypeFirst() {
        return this.nestedResourceTypeFirst;
    }

    @InputImport(name="nestedResourceTypeSecond", required=true)
    private final String nestedResourceTypeSecond;

    public String getNestedResourceTypeSecond() {
        return this.nestedResourceTypeSecond;
    }

    @InputImport(name="nestedResourceTypeThird", required=true)
    private final String nestedResourceTypeThird;

    public String getNestedResourceTypeThird() {
        return this.nestedResourceTypeThird;
    }

    @InputImport(name="providerNamespace", required=true)
    private final String providerNamespace;

    public String getProviderNamespace() {
        return this.providerNamespace;
    }

    @InputImport(name="resourceType", required=true)
    private final String resourceType;

    public String getPropResourceType() {
        return this.resourceType;
    }

    @InputImport(name="sku", required=true)
    private final String sku;

    public String getSku() {
        return this.sku;
    }

    public GetSkusNestedResourceTypeThirdArgs(
        String nestedResourceTypeFirst,
        String nestedResourceTypeSecond,
        String nestedResourceTypeThird,
        String providerNamespace,
        String resourceType,
        String sku) {
        this.nestedResourceTypeFirst = Objects.requireNonNull(nestedResourceTypeFirst, "expected parameter 'nestedResourceTypeFirst' to be non-null");
        this.nestedResourceTypeSecond = Objects.requireNonNull(nestedResourceTypeSecond, "expected parameter 'nestedResourceTypeSecond' to be non-null");
        this.nestedResourceTypeThird = Objects.requireNonNull(nestedResourceTypeThird, "expected parameter 'nestedResourceTypeThird' to be non-null");
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
        this.resourceType = Objects.requireNonNull(resourceType, "expected parameter 'resourceType' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private GetSkusNestedResourceTypeThirdArgs() {
        this.nestedResourceTypeFirst = null;
        this.nestedResourceTypeSecond = null;
        this.nestedResourceTypeThird = null;
        this.providerNamespace = null;
        this.resourceType = null;
        this.sku = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSkusNestedResourceTypeThirdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String nestedResourceTypeFirst;
        private String nestedResourceTypeSecond;
        private String nestedResourceTypeThird;
        private String providerNamespace;
        private String resourceType;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSkusNestedResourceTypeThirdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nestedResourceTypeFirst = defaults.nestedResourceTypeFirst;
    	      this.nestedResourceTypeSecond = defaults.nestedResourceTypeSecond;
    	      this.nestedResourceTypeThird = defaults.nestedResourceTypeThird;
    	      this.providerNamespace = defaults.providerNamespace;
    	      this.resourceType = defaults.resourceType;
    	      this.sku = defaults.sku;
        }

        public Builder setNestedResourceTypeFirst(String nestedResourceTypeFirst) {
            this.nestedResourceTypeFirst = Objects.requireNonNull(nestedResourceTypeFirst);
            return this;
        }

        public Builder setNestedResourceTypeSecond(String nestedResourceTypeSecond) {
            this.nestedResourceTypeSecond = Objects.requireNonNull(nestedResourceTypeSecond);
            return this;
        }

        public Builder setNestedResourceTypeThird(String nestedResourceTypeThird) {
            this.nestedResourceTypeThird = Objects.requireNonNull(nestedResourceTypeThird);
            return this;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public Builder setResourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public GetSkusNestedResourceTypeThirdArgs build() {
            return new GetSkusNestedResourceTypeThirdArgs(nestedResourceTypeFirst, nestedResourceTypeSecond, nestedResourceTypeThird, providerNamespace, resourceType, sku);
        }
    }
}
