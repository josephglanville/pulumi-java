// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1beta1.enums.AttributeDefinitionCategory;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttributeDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final AttributeDefinitionArgs Empty = new AttributeDefinitionArgs();

    /**
     * Possible values for the attribute. The number of allowed values must not exceed 500. An empty list is invalid. The list can only be expanded after creation.
     * 
     */
    @InputImport(name="allowedValues", required=true)
      private final Output<List<String>> allowedValues;

    public Output<List<String>> getAllowedValues() {
        return this.allowedValues;
    }

    @InputImport(name="attributeDefinitionId", required=true)
      private final Output<String> attributeDefinitionId;

    public Output<String> getAttributeDefinitionId() {
        return this.attributeDefinitionId;
    }

    /**
     * The category of the attribute. The value of this field cannot be changed after creation.
     * 
     */
    @InputImport(name="category", required=true)
      private final Output<AttributeDefinitionCategory> category;

    public Output<AttributeDefinitionCategory> getCategory() {
        return this.category;
    }

    /**
     * Optional. Default values of the attribute in Consents. If no default values are specified, it defaults to an empty value.
     * 
     */
    @InputImport(name="consentDefaultValues")
      private final @Nullable Output<List<String>> consentDefaultValues;

    public Output<List<String>> getConsentDefaultValues() {
        return this.consentDefaultValues == null ? Output.empty() : this.consentDefaultValues;
    }

    @InputImport(name="consentStoreId", required=true)
      private final Output<String> consentStoreId;

    public Output<String> getConsentStoreId() {
        return this.consentStoreId;
    }

    /**
     * Optional. Default value of the attribute in User data mappings. If no default value is specified, it defaults to an empty value. This field is only applicable to attributes of the category `RESOURCE`.
     * 
     */
    @InputImport(name="dataMappingDefaultValue")
      private final @Nullable Output<String> dataMappingDefaultValue;

    public Output<String> getDataMappingDefaultValue() {
        return this.dataMappingDefaultValue == null ? Output.empty() : this.dataMappingDefaultValue;
    }

    @InputImport(name="datasetId", required=true)
      private final Output<String> datasetId;

    public Output<String> getDatasetId() {
        return this.datasetId;
    }

    /**
     * Optional. A description of the attribute.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @InputImport(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Resource name of the Attribute definition, of the form `projects/{project_id}/locations/{location_id}/datasets/{dataset_id}/consentStores/{consent_store_id}/attributeDefinitions/{attribute_definition_id}`. Cannot be changed after creation.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public AttributeDefinitionArgs(
        Output<List<String>> allowedValues,
        Output<String> attributeDefinitionId,
        Output<AttributeDefinitionCategory> category,
        @Nullable Output<List<String>> consentDefaultValues,
        Output<String> consentStoreId,
        @Nullable Output<String> dataMappingDefaultValue,
        Output<String> datasetId,
        @Nullable Output<String> description,
        @Nullable Output<String> location,
        @Nullable Output<String> name,
        @Nullable Output<String> project) {
        this.allowedValues = Objects.requireNonNull(allowedValues, "expected parameter 'allowedValues' to be non-null");
        this.attributeDefinitionId = Objects.requireNonNull(attributeDefinitionId, "expected parameter 'attributeDefinitionId' to be non-null");
        this.category = Objects.requireNonNull(category, "expected parameter 'category' to be non-null");
        this.consentDefaultValues = consentDefaultValues;
        this.consentStoreId = Objects.requireNonNull(consentStoreId, "expected parameter 'consentStoreId' to be non-null");
        this.dataMappingDefaultValue = dataMappingDefaultValue;
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
        this.description = description;
        this.location = location;
        this.name = name;
        this.project = project;
    }

    private AttributeDefinitionArgs() {
        this.allowedValues = Output.empty();
        this.attributeDefinitionId = Output.empty();
        this.category = Output.empty();
        this.consentDefaultValues = Output.empty();
        this.consentStoreId = Output.empty();
        this.dataMappingDefaultValue = Output.empty();
        this.datasetId = Output.empty();
        this.description = Output.empty();
        this.location = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttributeDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> allowedValues;
        private Output<String> attributeDefinitionId;
        private Output<AttributeDefinitionCategory> category;
        private @Nullable Output<List<String>> consentDefaultValues;
        private Output<String> consentStoreId;
        private @Nullable Output<String> dataMappingDefaultValue;
        private Output<String> datasetId;
        private @Nullable Output<String> description;
        private @Nullable Output<String> location;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AttributeDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedValues = defaults.allowedValues;
    	      this.attributeDefinitionId = defaults.attributeDefinitionId;
    	      this.category = defaults.category;
    	      this.consentDefaultValues = defaults.consentDefaultValues;
    	      this.consentStoreId = defaults.consentStoreId;
    	      this.dataMappingDefaultValue = defaults.dataMappingDefaultValue;
    	      this.datasetId = defaults.datasetId;
    	      this.description = defaults.description;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
        }

        public Builder allowedValues(Output<List<String>> allowedValues) {
            this.allowedValues = Objects.requireNonNull(allowedValues);
            return this;
        }

        public Builder allowedValues(List<String> allowedValues) {
            this.allowedValues = Output.of(Objects.requireNonNull(allowedValues));
            return this;
        }

        public Builder attributeDefinitionId(Output<String> attributeDefinitionId) {
            this.attributeDefinitionId = Objects.requireNonNull(attributeDefinitionId);
            return this;
        }

        public Builder attributeDefinitionId(String attributeDefinitionId) {
            this.attributeDefinitionId = Output.of(Objects.requireNonNull(attributeDefinitionId));
            return this;
        }

        public Builder category(Output<AttributeDefinitionCategory> category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }

        public Builder category(AttributeDefinitionCategory category) {
            this.category = Output.of(Objects.requireNonNull(category));
            return this;
        }

        public Builder consentDefaultValues(@Nullable Output<List<String>> consentDefaultValues) {
            this.consentDefaultValues = consentDefaultValues;
            return this;
        }

        public Builder consentDefaultValues(@Nullable List<String> consentDefaultValues) {
            this.consentDefaultValues = Output.ofNullable(consentDefaultValues);
            return this;
        }

        public Builder consentStoreId(Output<String> consentStoreId) {
            this.consentStoreId = Objects.requireNonNull(consentStoreId);
            return this;
        }

        public Builder consentStoreId(String consentStoreId) {
            this.consentStoreId = Output.of(Objects.requireNonNull(consentStoreId));
            return this;
        }

        public Builder dataMappingDefaultValue(@Nullable Output<String> dataMappingDefaultValue) {
            this.dataMappingDefaultValue = dataMappingDefaultValue;
            return this;
        }

        public Builder dataMappingDefaultValue(@Nullable String dataMappingDefaultValue) {
            this.dataMappingDefaultValue = Output.ofNullable(dataMappingDefaultValue);
            return this;
        }

        public Builder datasetId(Output<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder datasetId(String datasetId) {
            this.datasetId = Output.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }

        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public AttributeDefinitionArgs build() {
            return new AttributeDefinitionArgs(allowedValues, attributeDefinitionId, category, consentDefaultValues, consentStoreId, dataMappingDefaultValue, datasetId, description, location, name, project);
        }
    }
}
