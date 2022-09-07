// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.myedgeorder.outputs.AvailabilityInformationResponse;
import com.pulumi.myedgeorder.outputs.CostInformationResponse;
import com.pulumi.myedgeorder.outputs.DescriptionResponse;
import com.pulumi.myedgeorder.outputs.FilterablePropertyResponse;
import com.pulumi.myedgeorder.outputs.HierarchyInformationResponse;
import com.pulumi.myedgeorder.outputs.ImageInformationResponse;
import com.pulumi.myedgeorder.outputs.ProductLineResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class ProductFamilyResponse {
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
     * @return List of product lines supported in the product family
     * 
     */
    private List<ProductLineResponse> productLines;

    private ProductFamilyResponse() {}
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
     * @return List of product lines supported in the product family
     * 
     */
    public List<ProductLineResponse> productLines() {
        return this.productLines;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductFamilyResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private AvailabilityInformationResponse availabilityInformation;
        private CostInformationResponse costInformation;
        private DescriptionResponse description;
        private String displayName;
        private List<FilterablePropertyResponse> filterableProperties;
        private HierarchyInformationResponse hierarchyInformation;
        private List<ImageInformationResponse> imageInformation;
        private List<ProductLineResponse> productLines;
        public Builder() {}
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
        }

        @CustomType.Setter
        public Builder availabilityInformation(AvailabilityInformationResponse availabilityInformation) {
            this.availabilityInformation = availabilityInformation;
            return this;
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
        @CustomType.Setter
        public Builder productLines(List<ProductLineResponse> productLines) {
            this.productLines = productLines;
            return this;
        }
        public Builder productLines(ProductLineResponse... productLines) {
            return productLines(List.of(productLines));
        }
        public ProductFamilyResponse build() {
            final var o = new ProductFamilyResponse();
            o.availabilityInformation = availabilityInformation;
            o.costInformation = costInformation;
            o.description = description;
            o.displayName = displayName;
            o.filterableProperties = filterableProperties;
            o.hierarchyInformation = hierarchyInformation;
            o.imageInformation = imageInformation;
            o.productLines = productLines;
            return o;
        }
    }
}
