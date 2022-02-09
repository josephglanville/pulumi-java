// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.authorization.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PolicyDefinitionGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final PolicyDefinitionGroupArgs Empty = new PolicyDefinitionGroupArgs();

    @InputImport(name="additionalMetadataId")
    private final @Nullable Input<String> additionalMetadataId;

    public Input<String> getAdditionalMetadataId() {
        return this.additionalMetadataId == null ? Input.empty() : this.additionalMetadataId;
    }

    @InputImport(name="category")
    private final @Nullable Input<String> category;

    public Input<String> getCategory() {
        return this.category == null ? Input.empty() : this.category;
    }

    @InputImport(name="description")
    private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public PolicyDefinitionGroupArgs(
        @Nullable Input<String> additionalMetadataId,
        @Nullable Input<String> category,
        @Nullable Input<String> description,
        @Nullable Input<String> displayName,
        Input<String> name) {
        this.additionalMetadataId = additionalMetadataId;
        this.category = category;
        this.description = description;
        this.displayName = displayName;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private PolicyDefinitionGroupArgs() {
        this.additionalMetadataId = Input.empty();
        this.category = Input.empty();
        this.description = Input.empty();
        this.displayName = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyDefinitionGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> additionalMetadataId;
        private @Nullable Input<String> category;
        private @Nullable Input<String> description;
        private @Nullable Input<String> displayName;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyDefinitionGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.additionalMetadataId = defaults.additionalMetadataId;
    	      this.category = defaults.category;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.name = defaults.name;
        }

        public Builder setAdditionalMetadataId(@Nullable Input<String> additionalMetadataId) {
            this.additionalMetadataId = additionalMetadataId;
            return this;
        }

        public Builder setAdditionalMetadataId(@Nullable String additionalMetadataId) {
            this.additionalMetadataId = Input.ofNullable(additionalMetadataId);
            return this;
        }

        public Builder setCategory(@Nullable Input<String> category) {
            this.category = category;
            return this;
        }

        public Builder setCategory(@Nullable String category) {
            this.category = Input.ofNullable(category);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public PolicyDefinitionGroupArgs build() {
            return new PolicyDefinitionGroupArgs(additionalMetadataId, category, description, displayName, name);
        }
    }
}
