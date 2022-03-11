// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioLifecycleConfigState extends io.pulumi.resources.ResourceArgs {

    public static final StudioLifecycleConfigState Empty = new StudioLifecycleConfigState();

    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Studio Lifecycle Config.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The App type that the Lifecycle Configuration is attached to. Valid values are `JupyterServer` and `KernelGateway`.
     * 
     */
    @InputImport(name="studioLifecycleConfigAppType")
      private final @Nullable Output<String> studioLifecycleConfigAppType;

    public Output<String> getStudioLifecycleConfigAppType() {
        return this.studioLifecycleConfigAppType == null ? Output.empty() : this.studioLifecycleConfigAppType;
    }

    /**
     * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * 
     */
    @InputImport(name="studioLifecycleConfigContent")
      private final @Nullable Output<String> studioLifecycleConfigContent;

    public Output<String> getStudioLifecycleConfigContent() {
        return this.studioLifecycleConfigContent == null ? Output.empty() : this.studioLifecycleConfigContent;
    }

    /**
     * The name of the Studio Lifecycle Configuration to create.
     * 
     */
    @InputImport(name="studioLifecycleConfigName")
      private final @Nullable Output<String> studioLifecycleConfigName;

    public Output<String> getStudioLifecycleConfigName() {
        return this.studioLifecycleConfigName == null ? Output.empty() : this.studioLifecycleConfigName;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public StudioLifecycleConfigState(
        @Nullable Output<String> arn,
        @Nullable Output<String> studioLifecycleConfigAppType,
        @Nullable Output<String> studioLifecycleConfigContent,
        @Nullable Output<String> studioLifecycleConfigName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.arn = arn;
        this.studioLifecycleConfigAppType = studioLifecycleConfigAppType;
        this.studioLifecycleConfigContent = studioLifecycleConfigContent;
        this.studioLifecycleConfigName = studioLifecycleConfigName;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private StudioLifecycleConfigState() {
        this.arn = Output.empty();
        this.studioLifecycleConfigAppType = Output.empty();
        this.studioLifecycleConfigContent = Output.empty();
        this.studioLifecycleConfigName = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioLifecycleConfigState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<String> studioLifecycleConfigAppType;
        private @Nullable Output<String> studioLifecycleConfigContent;
        private @Nullable Output<String> studioLifecycleConfigName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioLifecycleConfigState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.studioLifecycleConfigAppType = defaults.studioLifecycleConfigAppType;
    	      this.studioLifecycleConfigContent = defaults.studioLifecycleConfigContent;
    	      this.studioLifecycleConfigName = defaults.studioLifecycleConfigName;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder studioLifecycleConfigAppType(@Nullable Output<String> studioLifecycleConfigAppType) {
            this.studioLifecycleConfigAppType = studioLifecycleConfigAppType;
            return this;
        }

        public Builder studioLifecycleConfigAppType(@Nullable String studioLifecycleConfigAppType) {
            this.studioLifecycleConfigAppType = Output.ofNullable(studioLifecycleConfigAppType);
            return this;
        }

        public Builder studioLifecycleConfigContent(@Nullable Output<String> studioLifecycleConfigContent) {
            this.studioLifecycleConfigContent = studioLifecycleConfigContent;
            return this;
        }

        public Builder studioLifecycleConfigContent(@Nullable String studioLifecycleConfigContent) {
            this.studioLifecycleConfigContent = Output.ofNullable(studioLifecycleConfigContent);
            return this;
        }

        public Builder studioLifecycleConfigName(@Nullable Output<String> studioLifecycleConfigName) {
            this.studioLifecycleConfigName = studioLifecycleConfigName;
            return this;
        }

        public Builder studioLifecycleConfigName(@Nullable String studioLifecycleConfigName) {
            this.studioLifecycleConfigName = Output.ofNullable(studioLifecycleConfigName);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public StudioLifecycleConfigState build() {
            return new StudioLifecycleConfigState(arn, studioLifecycleConfigAppType, studioLifecycleConfigContent, studioLifecycleConfigName, tags, tagsAll);
        }
    }
}
