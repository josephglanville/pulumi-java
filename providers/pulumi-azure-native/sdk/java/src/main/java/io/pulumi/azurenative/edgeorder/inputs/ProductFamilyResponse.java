// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.AvailabilityInformationResponse;
import io.pulumi.azurenative.edgeorder.inputs.CostInformationResponse;
import io.pulumi.azurenative.edgeorder.inputs.DescriptionResponse;
import io.pulumi.azurenative.edgeorder.inputs.FilterablePropertyResponse;
import io.pulumi.azurenative.edgeorder.inputs.HierarchyInformationResponse;
import io.pulumi.azurenative.edgeorder.inputs.ImageInformationResponse;
import io.pulumi.azurenative.edgeorder.inputs.ProductLineResponse;
import io.pulumi.azurenative.edgeorder.inputs.ResourceProviderDetailsResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProductFamilyResponse extends io.pulumi.resources.InvokeArgs {

    public static final ProductFamilyResponse Empty = new ProductFamilyResponse();

    @InputImport(name="availabilityInformation", required=true)
    private final AvailabilityInformationResponse availabilityInformation;

    public AvailabilityInformationResponse getAvailabilityInformation() {
        return this.availabilityInformation;
    }

    @InputImport(name="costInformation", required=true)
    private final CostInformationResponse costInformation;

    public CostInformationResponse getCostInformation() {
        return this.costInformation;
    }

    @InputImport(name="description", required=true)
    private final DescriptionResponse description;

    public DescriptionResponse getDescription() {
        return this.description;
    }

    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="filterableProperties", required=true)
    private final List<FilterablePropertyResponse> filterableProperties;

    public List<FilterablePropertyResponse> getFilterableProperties() {
        return this.filterableProperties;
    }

    @InputImport(name="hierarchyInformation", required=true)
    private final HierarchyInformationResponse hierarchyInformation;

    public HierarchyInformationResponse getHierarchyInformation() {
        return this.hierarchyInformation;
    }

    @InputImport(name="imageInformation", required=true)
    private final List<ImageInformationResponse> imageInformation;

    public List<ImageInformationResponse> getImageInformation() {
        return this.imageInformation;
    }

    @InputImport(name="productLines", required=true)
    private final List<ProductLineResponse> productLines;

    public List<ProductLineResponse> getProductLines() {
        return this.productLines;
    }

    @InputImport(name="resourceProviderDetails")
    private final @Nullable List<ResourceProviderDetailsResponse> resourceProviderDetails;

    public List<ResourceProviderDetailsResponse> getResourceProviderDetails() {
        return this.resourceProviderDetails == null ? List.of() : this.resourceProviderDetails;
    }

    public ProductFamilyResponse(
        AvailabilityInformationResponse availabilityInformation,
        CostInformationResponse costInformation,
        DescriptionResponse description,
        String displayName,
        List<FilterablePropertyResponse> filterableProperties,
        HierarchyInformationResponse hierarchyInformation,
        List<ImageInformationResponse> imageInformation,
        List<ProductLineResponse> productLines,
        @Nullable List<ResourceProviderDetailsResponse> resourceProviderDetails) {
        this.availabilityInformation = Objects.requireNonNull(availabilityInformation, "expected parameter 'availabilityInformation' to be non-null");
        this.costInformation = Objects.requireNonNull(costInformation, "expected parameter 'costInformation' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.filterableProperties = Objects.requireNonNull(filterableProperties, "expected parameter 'filterableProperties' to be non-null");
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation, "expected parameter 'hierarchyInformation' to be non-null");
        this.imageInformation = Objects.requireNonNull(imageInformation, "expected parameter 'imageInformation' to be non-null");
        this.productLines = Objects.requireNonNull(productLines, "expected parameter 'productLines' to be non-null");
        this.resourceProviderDetails = resourceProviderDetails;
    }

    private ProductFamilyResponse() {
        this.availabilityInformation = null;
        this.costInformation = null;
        this.description = null;
        this.displayName = null;
        this.filterableProperties = List.of();
        this.hierarchyInformation = null;
        this.imageInformation = List.of();
        this.productLines = List.of();
        this.resourceProviderDetails = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductFamilyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<ProductLineResponse> productLines;
        private @Nullable List<ResourceProviderDetailsResponse> resourceProviderDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductFamilyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
    	      this.productLines = defaults.productLines;
    	      this.resourceProviderDetails = defaults.resourceProviderDetails;
        }

        public Builder setAvailabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = Objects.requireNonNull(availabilityInformation);
            return this;
        }

        public Builder setCostInformation(CostInformationResponse costInformation) {
            this.costInformation = Objects.requireNonNull(costInformation);
            return this;
        }

        public Builder setDescription(DescriptionResponse description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setFilterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            this.filterableProperties = Objects.requireNonNull(filterableProperties);
            return this;
        }

        public Builder setHierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation);
            return this;
        }

        public Builder setImageInformation(List<ImageInformationResponse> imageInformation) {
            this.imageInformation = Objects.requireNonNull(imageInformation);
            return this;
        }

        public Builder setProductLines(List<ProductLineResponse> productLines) {
            this.productLines = Objects.requireNonNull(productLines);
            return this;
        }

        public Builder setResourceProviderDetails(@Nullable List<ResourceProviderDetailsResponse> resourceProviderDetails) {
            this.resourceProviderDetails = resourceProviderDetails;
            return this;
        }

        public ProductFamilyResponse build() {
            return new ProductFamilyResponse(availabilityInformation, costInformation, description, displayName, filterableProperties, hierarchyInformation, imageInformation, productLines, resourceProviderDetails);
        }
    }
}
