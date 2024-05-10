// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.myedgeorder.inputs.FilterableProperty;
import com.pulumi.myedgeorder.inputs.HierarchyInformation;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Configuration filters
 * 
 */
public final class ConfigurationFilters extends com.pulumi.resources.InvokeArgs {

    public static final ConfigurationFilters Empty = new ConfigurationFilters();

    /**
     * Filters specific to product
     * 
     */
    @Import(name="filterableProperty")
    private @Nullable List<FilterableProperty> filterableProperty;

    /**
     * @return Filters specific to product
     * 
     */
    public Optional<List<FilterableProperty>> filterableProperty() {
        return Optional.ofNullable(this.filterableProperty);
    }

    /**
     * Product hierarchy information
     * 
     */
    @Import(name="hierarchyInformation", required=true)
    private HierarchyInformation hierarchyInformation;

    /**
     * @return Product hierarchy information
     * 
     */
    public HierarchyInformation hierarchyInformation() {
        return this.hierarchyInformation;
    }

    private ConfigurationFilters() {}

    private ConfigurationFilters(ConfigurationFilters $) {
        this.filterableProperty = $.filterableProperty;
        this.hierarchyInformation = $.hierarchyInformation;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationFilters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationFilters $;

        public Builder() {
            $ = new ConfigurationFilters();
        }

        public Builder(ConfigurationFilters defaults) {
            $ = new ConfigurationFilters(Objects.requireNonNull(defaults));
        }

        /**
         * @param filterableProperty Filters specific to product
         * 
         * @return builder
         * 
         */
        public Builder filterableProperty(@Nullable List<FilterableProperty> filterableProperty) {
            $.filterableProperty = filterableProperty;
            return this;
        }

        /**
         * @param filterableProperty Filters specific to product
         * 
         * @return builder
         * 
         */
        public Builder filterableProperty(FilterableProperty... filterableProperty) {
            return filterableProperty(List.of(filterableProperty));
        }

        /**
         * @param hierarchyInformation Product hierarchy information
         * 
         * @return builder
         * 
         */
        public Builder hierarchyInformation(HierarchyInformation hierarchyInformation) {
            $.hierarchyInformation = hierarchyInformation;
            return this;
        }

        public ConfigurationFilters build() {
            if ($.hierarchyInformation == null) {
                throw new MissingRequiredPropertyException("ConfigurationFilters", "hierarchyInformation");
            }
            return $;
        }
    }

}
