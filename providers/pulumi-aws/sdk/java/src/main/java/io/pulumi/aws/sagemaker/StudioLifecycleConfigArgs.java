// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.sagemaker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StudioLifecycleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final StudioLifecycleConfigArgs Empty = new StudioLifecycleConfigArgs();

    /**
     * The App type that the Lifecycle Configuration is attached to. Valid values are `JupyterServer` and `KernelGateway`.
     * 
     */
    @Import(name="studioLifecycleConfigAppType", required=true)
      private final Output<String> studioLifecycleConfigAppType;

    public Output<String> getStudioLifecycleConfigAppType() {
        return this.studioLifecycleConfigAppType;
    }

    /**
     * The content of your Studio Lifecycle Configuration script. This content must be base64 encoded.
     * 
     */
    @Import(name="studioLifecycleConfigContent", required=true)
      private final Output<String> studioLifecycleConfigContent;

    public Output<String> getStudioLifecycleConfigContent() {
        return this.studioLifecycleConfigContent;
    }

    /**
     * The name of the Studio Lifecycle Configuration to create.
     * 
     */
    @Import(name="studioLifecycleConfigName", required=true)
      private final Output<String> studioLifecycleConfigName;

    public Output<String> getStudioLifecycleConfigName() {
        return this.studioLifecycleConfigName;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public StudioLifecycleConfigArgs(
        Output<String> studioLifecycleConfigAppType,
        Output<String> studioLifecycleConfigContent,
        Output<String> studioLifecycleConfigName,
        @Nullable Output<Map<String,String>> tags) {
        this.studioLifecycleConfigAppType = Objects.requireNonNull(studioLifecycleConfigAppType, "expected parameter 'studioLifecycleConfigAppType' to be non-null");
        this.studioLifecycleConfigContent = Objects.requireNonNull(studioLifecycleConfigContent, "expected parameter 'studioLifecycleConfigContent' to be non-null");
        this.studioLifecycleConfigName = Objects.requireNonNull(studioLifecycleConfigName, "expected parameter 'studioLifecycleConfigName' to be non-null");
        this.tags = tags;
    }

    private StudioLifecycleConfigArgs() {
        this.studioLifecycleConfigAppType = Output.empty();
        this.studioLifecycleConfigContent = Output.empty();
        this.studioLifecycleConfigName = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StudioLifecycleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> studioLifecycleConfigAppType;
        private Output<String> studioLifecycleConfigContent;
        private Output<String> studioLifecycleConfigName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(StudioLifecycleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.studioLifecycleConfigAppType = defaults.studioLifecycleConfigAppType;
    	      this.studioLifecycleConfigContent = defaults.studioLifecycleConfigContent;
    	      this.studioLifecycleConfigName = defaults.studioLifecycleConfigName;
    	      this.tags = defaults.tags;
        }

        public Builder studioLifecycleConfigAppType(Output<String> studioLifecycleConfigAppType) {
            this.studioLifecycleConfigAppType = Objects.requireNonNull(studioLifecycleConfigAppType);
            return this;
        }
        public Builder studioLifecycleConfigAppType(String studioLifecycleConfigAppType) {
            this.studioLifecycleConfigAppType = Output.of(Objects.requireNonNull(studioLifecycleConfigAppType));
            return this;
        }
        public Builder studioLifecycleConfigContent(Output<String> studioLifecycleConfigContent) {
            this.studioLifecycleConfigContent = Objects.requireNonNull(studioLifecycleConfigContent);
            return this;
        }
        public Builder studioLifecycleConfigContent(String studioLifecycleConfigContent) {
            this.studioLifecycleConfigContent = Output.of(Objects.requireNonNull(studioLifecycleConfigContent));
            return this;
        }
        public Builder studioLifecycleConfigName(Output<String> studioLifecycleConfigName) {
            this.studioLifecycleConfigName = Objects.requireNonNull(studioLifecycleConfigName);
            return this;
        }
        public Builder studioLifecycleConfigName(String studioLifecycleConfigName) {
            this.studioLifecycleConfigName = Output.of(Objects.requireNonNull(studioLifecycleConfigName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public StudioLifecycleConfigArgs build() {
            return new StudioLifecycleConfigArgs(studioLifecycleConfigAppType, studioLifecycleConfigContent, studioLifecycleConfigName, tags);
        }
    }
}