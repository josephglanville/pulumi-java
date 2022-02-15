// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.AvailabilityInformationResponse;
import io.pulumi.azurenative.edgeorder.inputs.CostInformationResponse;
import io.pulumi.azurenative.edgeorder.inputs.DescriptionResponse;
import io.pulumi.azurenative.edgeorder.inputs.DimensionsResponse;
import io.pulumi.azurenative.edgeorder.inputs.FilterablePropertyResponse;
import io.pulumi.azurenative.edgeorder.inputs.HierarchyInformationResponse;
import io.pulumi.azurenative.edgeorder.inputs.ImageInformationResponse;
import io.pulumi.azurenative.edgeorder.inputs.SpecificationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class ConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConfigurationResponse Empty = new ConfigurationResponse();

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

    @InputImport(name="dimensions", required=true)
    private final DimensionsResponse dimensions;

    public DimensionsResponse getDimensions() {
        return this.dimensions;
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

    @InputImport(name="specifications", required=true)
    private final List<SpecificationResponse> specifications;

    public List<SpecificationResponse> getSpecifications() {
        return this.specifications;
    }

    public ConfigurationResponse(
        AvailabilityInformationResponse availabilityInformation,
        CostInformationResponse costInformation,
        DescriptionResponse description,
        DimensionsResponse dimensions,
        String displayName,
        List<FilterablePropertyResponse> filterableProperties,
        HierarchyInformationResponse hierarchyInformation,
        List<ImageInformationResponse> imageInformation,
        List<SpecificationResponse> specifications) {
        this.availabilityInformation = Objects.requireNonNull(availabilityInformation, "expected parameter 'availabilityInformation' to be non-null");
        this.costInformation = Objects.requireNonNull(costInformation, "expected parameter 'costInformation' to be non-null");
        this.description = Objects.requireNonNull(description, "expected parameter 'description' to be non-null");
        this.dimensions = Objects.requireNonNull(dimensions, "expected parameter 'dimensions' to be non-null");
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.filterableProperties = Objects.requireNonNull(filterableProperties, "expected parameter 'filterableProperties' to be non-null");
        this.hierarchyInformation = Objects.requireNonNull(hierarchyInformation, "expected parameter 'hierarchyInformation' to be non-null");
        this.imageInformation = Objects.requireNonNull(imageInformation, "expected parameter 'imageInformation' to be non-null");
        this.specifications = Objects.requireNonNull(specifications, "expected parameter 'specifications' to be non-null");
    }

    private ConfigurationResponse() {
        this.availabilityInformation = null;
        this.costInformation = null;
        this.description = null;
        this.dimensions = null;
        this.displayName = null;
        this.filterableProperties = List.of();
        this.hierarchyInformation = null;
        this.imageInformation = List.of();
        this.specifications = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private DimensionsResponse dimensions;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<SpecificationResponse> specifications;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.dimensions = defaults.dimensions;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
    	      this.specifications = defaults.specifications;
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

        public Builder setDimensions(DimensionsResponse dimensions) {
            this.dimensions = Objects.requireNonNull(dimensions);
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

        public Builder setSpecifications(List<SpecificationResponse> specifications) {
            this.specifications = Objects.requireNonNull(specifications);
            return this;
        }

        public ConfigurationResponse build() {
            return new ConfigurationResponse(availabilityInformation, costInformation, description, dimensions, displayName, filterableProperties, hierarchyInformation, imageInformation, specifications);
        }
    }
}