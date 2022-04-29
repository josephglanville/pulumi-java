// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.AiVision.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.AiVision.outputs.GetModelsFilter;
import com.pulumi.oci.AiVision.outputs.GetModelsModelCollection;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetModelsResult {
    /**
     * @return Compartment Identifier
     * 
     */
    private final @Nullable String compartmentId;
    /**
     * @return Model Identifier, can be renamed
     * 
     */
    private final @Nullable String displayName;
    private final @Nullable List<GetModelsFilter> filters;
    /**
     * @return Unique identifier that is immutable on creation
     * 
     */
    private final @Nullable String id;
    /**
     * @return The list of model_collection.
     * 
     */
    private final List<GetModelsModelCollection> modelCollections;
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the model.
     * 
     */
    private final @Nullable String projectId;
    /**
     * @return The current state of the Model.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private GetModelsResult(
        @CustomType.Parameter("compartmentId") @Nullable String compartmentId,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("filters") @Nullable List<GetModelsFilter> filters,
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("modelCollections") List<GetModelsModelCollection> modelCollections,
        @CustomType.Parameter("projectId") @Nullable String projectId,
        @CustomType.Parameter("state") @Nullable String state) {
        this.compartmentId = compartmentId;
        this.displayName = displayName;
        this.filters = filters;
        this.id = id;
        this.modelCollections = modelCollections;
        this.projectId = projectId;
        this.state = state;
    }

    /**
     * @return Compartment Identifier
     * 
     */
    public Optional<String> compartmentId() {
        return Optional.ofNullable(this.compartmentId);
    }
    /**
     * @return Model Identifier, can be renamed
     * 
     */
    public Optional<String> displayName() {
        return Optional.ofNullable(this.displayName);
    }
    public List<GetModelsFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return Unique identifier that is immutable on creation
     * 
     */
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return The list of model_collection.
     * 
     */
    public List<GetModelsModelCollection> modelCollections() {
        return this.modelCollections;
    }
    /**
     * @return The [OCID](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/identifiers.htm) of the project to associate with the model.
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }
    /**
     * @return The current state of the Model.
     * 
     */
    public Optional<String> state() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetModelsResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String compartmentId;
        private @Nullable String displayName;
        private @Nullable List<GetModelsFilter> filters;
        private @Nullable String id;
        private List<GetModelsModelCollection> modelCollections;
        private @Nullable String projectId;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetModelsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.displayName = defaults.displayName;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.modelCollections = defaults.modelCollections;
    	      this.projectId = defaults.projectId;
    	      this.state = defaults.state;
        }

        public Builder compartmentId(@Nullable String compartmentId) {
            this.compartmentId = compartmentId;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder filters(@Nullable List<GetModelsFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetModelsFilter... filters) {
            return filters(List.of(filters));
        }
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder modelCollections(List<GetModelsModelCollection> modelCollections) {
            this.modelCollections = Objects.requireNonNull(modelCollections);
            return this;
        }
        public Builder modelCollections(GetModelsModelCollection... modelCollections) {
            return modelCollections(List.of(modelCollections));
        }
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public GetModelsResult build() {
            return new GetModelsResult(compartmentId, displayName, filters, id, modelCollections, projectId, state);
        }
    }
}
