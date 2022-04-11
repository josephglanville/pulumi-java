// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.retail_v2alpha.enums.GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecMode;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The specifications of dynamically generated facets.
 * 
 */
public final class GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs Empty = new GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs();

    /**
     * Mode of the DynamicFacet feature. Defaults to Mode.DISABLED if it's unset.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecMode> mode;

    public Output<GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecMode> getMode() {
        return this.mode == null ? Codegen.empty() : this.mode;
    }

    public GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs(@Nullable Output<GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecMode> mode) {
        this.mode = mode;
    }

    private GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs() {
        this.mode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecMode> mode;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
        }

        public Builder mode(@Nullable Output<GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecMode> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecMode mode) {
            this.mode = Codegen.ofNullable(mode);
            return this;
        }        public GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs build() {
            return new GoogleCloudRetailV2alphaSearchRequestDynamicFacetSpecArgs(mode);
        }
    }
}
