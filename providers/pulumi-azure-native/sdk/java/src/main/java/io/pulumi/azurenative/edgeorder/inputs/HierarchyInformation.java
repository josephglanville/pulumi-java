// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Holds details about product hierarchy information
 * 
 */
public final class HierarchyInformation extends io.pulumi.resources.InvokeArgs {

    public static final HierarchyInformation Empty = new HierarchyInformation();

    /**
     * Represents configuration name that uniquely identifies configuration
     * 
     */
    @InputImport(name="configurationName")
      private final @Nullable String configurationName;

    public Optional<String> getConfigurationName() {
        return this.configurationName == null ? Optional.empty() : Optional.ofNullable(this.configurationName);
    }

    /**
     * Represents product family name that uniquely identifies product family
     * 
     */
    @InputImport(name="productFamilyName")
      private final @Nullable String productFamilyName;

    public Optional<String> getProductFamilyName() {
        return this.productFamilyName == null ? Optional.empty() : Optional.ofNullable(this.productFamilyName);
    }

    /**
     * Represents product line name that uniquely identifies product line
     * 
     */
    @InputImport(name="productLineName")
      private final @Nullable String productLineName;

    public Optional<String> getProductLineName() {
        return this.productLineName == null ? Optional.empty() : Optional.ofNullable(this.productLineName);
    }

    /**
     * Represents product name that uniquely identifies product
     * 
     */
    @InputImport(name="productName")
      private final @Nullable String productName;

    public Optional<String> getProductName() {
        return this.productName == null ? Optional.empty() : Optional.ofNullable(this.productName);
    }

    public HierarchyInformation(
        @Nullable String configurationName,
        @Nullable String productFamilyName,
        @Nullable String productLineName,
        @Nullable String productName) {
        this.configurationName = configurationName;
        this.productFamilyName = productFamilyName;
        this.productLineName = productLineName;
        this.productName = productName;
    }

    private HierarchyInformation() {
        this.configurationName = null;
        this.productFamilyName = null;
        this.productLineName = null;
        this.productName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HierarchyInformation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String configurationName;
        private @Nullable String productFamilyName;
        private @Nullable String productLineName;
        private @Nullable String productName;

        public Builder() {
    	      // Empty
        }

        public Builder(HierarchyInformation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationName = defaults.configurationName;
    	      this.productFamilyName = defaults.productFamilyName;
    	      this.productLineName = defaults.productLineName;
    	      this.productName = defaults.productName;
        }

        public Builder setConfigurationName(@Nullable String configurationName) {
            this.configurationName = configurationName;
            return this;
        }

        public Builder setProductFamilyName(@Nullable String productFamilyName) {
            this.productFamilyName = productFamilyName;
            return this;
        }

        public Builder setProductLineName(@Nullable String productLineName) {
            this.productLineName = productLineName;
            return this;
        }

        public Builder setProductName(@Nullable String productName) {
            this.productName = productName;
            return this;
        }
        public HierarchyInformation build() {
            return new HierarchyInformation(configurationName, productFamilyName, productLineName, productName);
        }
    }
}
