// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotsitewise.inputs;

import io.pulumi.awsnative.iotsitewise.inputs.AssetModelPropertyArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains a composite model definition in an asset model. This composite model definition is applied to all assets created from the asset model.
 * 
 */
public final class AssetModelCompositeModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final AssetModelCompositeModelArgs Empty = new AssetModelCompositeModelArgs();

    /**
     * The property definitions of the asset model. You can specify up to 200 properties per asset model.
     * 
     */
    @Import(name="compositeModelProperties")
      private final @Nullable Output<List<AssetModelPropertyArgs>> compositeModelProperties;

    public Output<List<AssetModelPropertyArgs>> getCompositeModelProperties() {
        return this.compositeModelProperties == null ? Output.empty() : this.compositeModelProperties;
    }

    /**
     * A description for the asset composite model.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A unique, friendly name for the asset composite model.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The type of the composite model. For alarm composite models, this type is AWS/ALARM
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AssetModelCompositeModelArgs(
        @Nullable Output<List<AssetModelPropertyArgs>> compositeModelProperties,
        @Nullable Output<String> description,
        Output<String> name,
        Output<String> type) {
        this.compositeModelProperties = compositeModelProperties;
        this.description = description;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AssetModelCompositeModelArgs() {
        this.compositeModelProperties = Output.empty();
        this.description = Output.empty();
        this.name = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssetModelCompositeModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AssetModelPropertyArgs>> compositeModelProperties;
        private @Nullable Output<String> description;
        private Output<String> name;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AssetModelCompositeModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compositeModelProperties = defaults.compositeModelProperties;
    	      this.description = defaults.description;
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder compositeModelProperties(@Nullable Output<List<AssetModelPropertyArgs>> compositeModelProperties) {
            this.compositeModelProperties = compositeModelProperties;
            return this;
        }
        public Builder compositeModelProperties(@Nullable List<AssetModelPropertyArgs> compositeModelProperties) {
            this.compositeModelProperties = Output.ofNullable(compositeModelProperties);
            return this;
        }
        public Builder compositeModelProperties(AssetModelPropertyArgs... compositeModelProperties) {
            return compositeModelProperties(List.of(compositeModelProperties));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AssetModelCompositeModelArgs build() {
            return new AssetModelCompositeModelArgs(compositeModelProperties, description, name, type);
        }
    }
}
