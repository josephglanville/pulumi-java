// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.vertex;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.vertex.inputs.AiFeatureStoreOnlineServingConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AiFeatureStoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final AiFeatureStoreArgs Empty = new AiFeatureStoreArgs();

    /**
     * If set to true, any EntityTypes and Features for this Featurestore will also be deleted
     * 
     */
    @InputImport(name="forceDestroy")
      private final @Nullable Input<Boolean> forceDestroy;

    public Input<Boolean> getForceDestroy() {
        return this.forceDestroy == null ? Input.empty() : this.forceDestroy;
    }

    /**
     * A set of key/value label pairs to assign to this Featurestore.
     * 
     */
    @InputImport(name="labels")
      private final @Nullable Input<Map<String,String>> labels;

    public Input<Map<String,String>> getLabels() {
        return this.labels == null ? Input.empty() : this.labels;
    }

    /**
     * The name of the Featurestore. This value may be up to 60 characters, and valid characters are [a-z0-9_]. The first character cannot be a number.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * Config for online serving resources.
     * Structure is documented below.
     * 
     */
    @InputImport(name="onlineServingConfig")
      private final @Nullable Input<AiFeatureStoreOnlineServingConfigArgs> onlineServingConfig;

    public Input<AiFeatureStoreOnlineServingConfigArgs> getOnlineServingConfig() {
        return this.onlineServingConfig == null ? Input.empty() : this.onlineServingConfig;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The region of the dataset. eg us-central1
     * 
     */
    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    public AiFeatureStoreArgs(
        @Nullable Input<Boolean> forceDestroy,
        @Nullable Input<Map<String,String>> labels,
        @Nullable Input<String> name,
        @Nullable Input<AiFeatureStoreOnlineServingConfigArgs> onlineServingConfig,
        @Nullable Input<String> project,
        @Nullable Input<String> region) {
        this.forceDestroy = forceDestroy;
        this.labels = labels;
        this.name = name;
        this.onlineServingConfig = onlineServingConfig;
        this.project = project;
        this.region = region;
    }

    private AiFeatureStoreArgs() {
        this.forceDestroy = Input.empty();
        this.labels = Input.empty();
        this.name = Input.empty();
        this.onlineServingConfig = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AiFeatureStoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> forceDestroy;
        private @Nullable Input<Map<String,String>> labels;
        private @Nullable Input<String> name;
        private @Nullable Input<AiFeatureStoreOnlineServingConfigArgs> onlineServingConfig;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(AiFeatureStoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.forceDestroy = defaults.forceDestroy;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.onlineServingConfig = defaults.onlineServingConfig;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder setForceDestroy(@Nullable Input<Boolean> forceDestroy) {
            this.forceDestroy = forceDestroy;
            return this;
        }

        public Builder setForceDestroy(@Nullable Boolean forceDestroy) {
            this.forceDestroy = Input.ofNullable(forceDestroy);
            return this;
        }

        public Builder setLabels(@Nullable Input<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder setLabels(@Nullable Map<String,String> labels) {
            this.labels = Input.ofNullable(labels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setOnlineServingConfig(@Nullable Input<AiFeatureStoreOnlineServingConfigArgs> onlineServingConfig) {
            this.onlineServingConfig = onlineServingConfig;
            return this;
        }

        public Builder setOnlineServingConfig(@Nullable AiFeatureStoreOnlineServingConfigArgs onlineServingConfig) {
            this.onlineServingConfig = Input.ofNullable(onlineServingConfig);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }
        public AiFeatureStoreArgs build() {
            return new AiFeatureStoreArgs(forceDestroy, labels, name, onlineServingConfig, project, region);
        }
    }
}
