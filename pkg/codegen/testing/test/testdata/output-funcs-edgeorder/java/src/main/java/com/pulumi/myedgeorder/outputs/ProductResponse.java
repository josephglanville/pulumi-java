// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.myedgeorder.outputs.AvailabilityInformationResponse;
import com.pulumi.myedgeorder.outputs.ConfigurationResponse;
import com.pulumi.myedgeorder.outputs.CostInformationResponse;
import com.pulumi.myedgeorder.outputs.DescriptionResponse;
import com.pulumi.myedgeorder.outputs.FilterablePropertyResponse;
import com.pulumi.myedgeorder.outputs.HierarchyInformationResponse;
import com.pulumi.myedgeorder.outputs.ImageInformationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ProductResponse {
    /**
     * @return Availability information of the product system.
     * 
     */
    private AvailabilityInformationResponse availabilityInformation;
    /**
     * @return List of configurations for the product
     * 
     */
    private List<ConfigurationResponse> configurations;
    /**
     * @return Cost information for the product system.
     * 
     */
    private CostInformationResponse costInformation;
    /**
     * @return Description related to the product system.
     * 
     */
    private DescriptionResponse description;
    /**
     * @return Display Name for the product system.
     * 
     */
    private String displayName;
    /**
     * @return list of filters supported for a product
     * 
     */
    private List<FilterablePropertyResponse> filterableProperties;
    /**
     * @return Hierarchy information of a product.
     * 
     */
    private HierarchyInformationResponse hierarchyInformation;
    /**
     * @return Image information for the product system.
     * 
     */
    private List<ImageInformationResponse> imageInformation;

    private ProductResponse() {}
    /**
     * @return Availability information of the product system.
     * 
     */
    public AvailabilityInformationResponse availabilityInformation() {
        return this.availabilityInformation;
    }
    /**
     * @return List of configurations for the product
     * 
     */
    public List<ConfigurationResponse> configurations() {
        return this.configurations;
    }
    /**
     * @return Cost information for the product system.
     * 
     */
    public CostInformationResponse costInformation() {
        return this.costInformation;
    }
    /**
     * @return Description related to the product system.
     * 
     */
    public DescriptionResponse description() {
        return this.description;
    }
    /**
     * @return Display Name for the product system.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return list of filters supported for a product
     * 
     */
    public List<FilterablePropertyResponse> filterableProperties() {
        return this.filterableProperties;
    }
    /**
     * @return Hierarchy information of a product.
     * 
     */
    public HierarchyInformationResponse hierarchyInformation() {
        return this.hierarchyInformation;
    }
    /**
     * @return Image information for the product system.
     * 
     */
    public List<ImageInformationResponse> imageInformation() {
        return this.imageInformation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private List<ConfigurationResponse> configurations;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        public Builder() {}
        public Builder(ProductResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityInformation = defaults.availabilityInformation;
    	      this.configurations = defaults.configurations;
    	      this.costInformation = defaults.costInformation;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.hierarchyInformation = defaults.hierarchyInformation;
    	      this.imageInformation = defaults.imageInformation;
        }

        @CustomType.Setter
        public Builder availabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = availabilityInformation;
            return this;
        }
        @CustomType.Setter
        public Builder configurations(List<ConfigurationResponse> configurations) {
            this.configurations = configurations;
            return this;
        }
        public Builder configurations(ConfigurationResponse... configurations) {
            return configurations(List.of(configurations));
        }
        @CustomType.Setter
        public Builder costInformation(CostInformationResponse costInformation) {
            this.costInformation = costInformation;
            return this;
        }
        @CustomType.Setter
        public Builder description(DescriptionResponse description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder filterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            this.filterableProperties = filterableProperties;
            return this;
        }
        public Builder filterableProperties(FilterablePropertyResponse... filterableProperties) {
            return filterableProperties(List.of(filterableProperties));
        }
        @CustomType.Setter
        public Builder hierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            this.hierarchyInformation = hierarchyInformation;
            return this;
        }
        @CustomType.Setter
        public Builder imageInformation(List<ImageInformationResponse> imageInformation) {
            this.imageInformation = imageInformation;
            return this;
        }
        public Builder imageInformation(ImageInformationResponse... imageInformation) {
            return imageInformation(List.of(imageInformation));
        }
        public ProductResponse build() {
            final var o = new ProductResponse();
            o.availabilityInformation = availabilityInformation;
            o.configurations = configurations;
            o.costInformation = costInformation;
            o.description = description;
            o.displayName = displayName;
            o.filterableProperties = filterableProperties;
            o.hierarchyInformation = hierarchyInformation;
            o.imageInformation = imageInformation;
            return o;
        }
    }
}
