// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.alertsmanagement.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The detector information. By default this is not populated, unless it's specified in expandDetector
 * 
 */
public final class DetectorArgs extends io.pulumi.resources.ResourceArgs {

    public static final DetectorArgs Empty = new DetectorArgs();

    /**
     * The Smart Detector description. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The detector id.
     * 
     */
    @Import(name="id", required=true)
      private final Output<String> id;

    public Output<String> getId() {
        return this.id;
    }

    /**
     * The Smart Detector image path. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    @Import(name="imagePaths")
      private final @Nullable Output<List<String>> imagePaths;

    public Output<List<String>> getImagePaths() {
        return this.imagePaths == null ? Output.empty() : this.imagePaths;
    }

    /**
     * The Smart Detector name. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The detector's parameters.'
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,Object>> parameters;

    public Output<Map<String,Object>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The Smart Detector supported resource types. By default this is not populated, unless it's specified in expandDetector
     * 
     */
    @Import(name="supportedResourceTypes")
      private final @Nullable Output<List<String>> supportedResourceTypes;

    public Output<List<String>> getSupportedResourceTypes() {
        return this.supportedResourceTypes == null ? Output.empty() : this.supportedResourceTypes;
    }

    public DetectorArgs(
        @Nullable Output<String> description,
        Output<String> id,
        @Nullable Output<List<String>> imagePaths,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,Object>> parameters,
        @Nullable Output<List<String>> supportedResourceTypes) {
        this.description = description;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.imagePaths = imagePaths;
        this.name = name;
        this.parameters = parameters;
        this.supportedResourceTypes = supportedResourceTypes;
    }

    private DetectorArgs() {
        this.description = Output.empty();
        this.id = Output.empty();
        this.imagePaths = Output.empty();
        this.name = Output.empty();
        this.parameters = Output.empty();
        this.supportedResourceTypes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DetectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> id;
        private @Nullable Output<List<String>> imagePaths;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,Object>> parameters;
        private @Nullable Output<List<String>> supportedResourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DetectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.imagePaths = defaults.imagePaths;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.supportedResourceTypes = defaults.supportedResourceTypes;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder id(Output<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder id(String id) {
            this.id = Output.of(Objects.requireNonNull(id));
            return this;
        }
        public Builder imagePaths(@Nullable Output<List<String>> imagePaths) {
            this.imagePaths = imagePaths;
            return this;
        }
        public Builder imagePaths(@Nullable List<String> imagePaths) {
            this.imagePaths = Output.ofNullable(imagePaths);
            return this;
        }
        public Builder imagePaths(String... imagePaths) {
            return imagePaths(List.of(imagePaths));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder supportedResourceTypes(@Nullable Output<List<String>> supportedResourceTypes) {
            this.supportedResourceTypes = supportedResourceTypes;
            return this;
        }
        public Builder supportedResourceTypes(@Nullable List<String> supportedResourceTypes) {
            this.supportedResourceTypes = Output.ofNullable(supportedResourceTypes);
            return this;
        }
        public Builder supportedResourceTypes(String... supportedResourceTypes) {
            return supportedResourceTypes(List.of(supportedResourceTypes));
        }        public DetectorArgs build() {
            return new DetectorArgs(description, id, imagePaths, name, parameters, supportedResourceTypes);
        }
    }
}
