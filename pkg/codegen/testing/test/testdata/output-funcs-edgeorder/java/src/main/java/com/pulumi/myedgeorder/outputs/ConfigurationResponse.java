// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.myedgeorder.outputs.AvailabilityInformationResponse;
import com.pulumi.myedgeorder.outputs.CostInformationResponse;
import com.pulumi.myedgeorder.outputs.DescriptionResponse;
import com.pulumi.myedgeorder.outputs.DimensionsResponse;
import com.pulumi.myedgeorder.outputs.FilterablePropertyResponse;
import com.pulumi.myedgeorder.outputs.HierarchyInformationResponse;
import com.pulumi.myedgeorder.outputs.ImageInformationResponse;
import com.pulumi.myedgeorder.outputs.SpecificationResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ConfigurationResponse {
    /**
     * @return Availability information of the product system.
     * 
     */
    private AvailabilityInformationResponse availabilityInformation;
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
     * @return Dimensions of the configuration
     * 
     */
    private DimensionsResponse dimensions;
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
    /**
     * @return Specifications of the configuration
     * 
     */
    private List<SpecificationResponse> specifications;

    private ConfigurationResponse() {}
    /**
     * @return Availability information of the product system.
     * 
     */
    public AvailabilityInformationResponse availabilityInformation() {
        return this.availabilityInformation;
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
     * @return Dimensions of the configuration
     * 
     */
    public DimensionsResponse dimensions() {
        return this.dimensions;
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
    /**
     * @return Specifications of the configuration
     * 
     */
    public List<SpecificationResponse> specifications() {
        return this.specifications;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
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
        public Builder() {}
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

        @CustomType.Setter
        public Builder availabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            if (availabilityInformation == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "availabilityInformation");
            }
            this.availabilityInformation = availabilityInformation;
            return this;
        }
        @CustomType.Setter
        public Builder costInformation(CostInformationResponse costInformation) {
            if (costInformation == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "costInformation");
            }
            this.costInformation = costInformation;
            return this;
        }
        @CustomType.Setter
        public Builder description(DescriptionResponse description) {
            if (description == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "description");
            }
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder dimensions(DimensionsResponse dimensions) {
            if (dimensions == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "dimensions");
            }
            this.dimensions = dimensions;
            return this;
        }
        @CustomType.Setter
        public Builder displayName(String displayName) {
            if (displayName == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "displayName");
            }
            this.displayName = displayName;
            return this;
        }
        @CustomType.Setter
        public Builder filterableProperties(List<FilterablePropertyResponse> filterableProperties) {
            if (filterableProperties == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "filterableProperties");
            }
            this.filterableProperties = filterableProperties;
            return this;
        }
        public Builder filterableProperties(FilterablePropertyResponse... filterableProperties) {
            return filterableProperties(List.of(filterableProperties));
        }
        @CustomType.Setter
        public Builder hierarchyInformation(HierarchyInformationResponse hierarchyInformation) {
            if (hierarchyInformation == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "hierarchyInformation");
            }
            this.hierarchyInformation = hierarchyInformation;
            return this;
        }
        @CustomType.Setter
        public Builder imageInformation(List<ImageInformationResponse> imageInformation) {
            if (imageInformation == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "imageInformation");
            }
            this.imageInformation = imageInformation;
            return this;
        }
        public Builder imageInformation(ImageInformationResponse... imageInformation) {
            return imageInformation(List.of(imageInformation));
        }
        @CustomType.Setter
        public Builder specifications(List<SpecificationResponse> specifications) {
            if (specifications == null) {
                throw new MissingRequiredPropertyException("ConfigurationResponse", "specifications");
            }
            this.specifications = specifications;
            return this;
        }
        public Builder specifications(SpecificationResponse... specifications) {
            return specifications(List.of(specifications));
        }
        public ConfigurationResponse build() {
            final var o = new ConfigurationResponse();
            o.availabilityInformation = availabilityInformation;
            o.costInformation = costInformation;
            o.description = description;
            o.dimensions = dimensions;
            o.displayName = displayName;
            o.filterableProperties = filterableProperties;
            o.hierarchyInformation = hierarchyInformation;
            o.imageInformation = imageInformation;
            o.specifications = specifications;
            return o;
        }
    }
}
