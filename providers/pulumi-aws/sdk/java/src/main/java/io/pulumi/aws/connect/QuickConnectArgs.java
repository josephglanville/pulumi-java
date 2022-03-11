// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.aws.connect.inputs.QuickConnectQuickConnectConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuickConnectArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuickConnectArgs Empty = new QuickConnectArgs();

    /**
     * Specifies the description of the Quick Connect.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @InputImport(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Specifies the name of the Quick Connect.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A block that defines the configuration information for the Quick Connect: `quick_connect_type` and one of `phone_config`, `queue_config`, `user_config` . The Quick Connect Config block is documented below.
     * 
     */
    @InputImport(name="quickConnectConfig", required=true)
      private final Output<QuickConnectQuickConnectConfigArgs> quickConnectConfig;

    public Output<QuickConnectQuickConnectConfigArgs> getQuickConnectConfig() {
        return this.quickConnectConfig;
    }

    /**
     * Tags to apply to the Quick Connect. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public QuickConnectArgs(
        @Nullable Output<String> description,
        Output<String> instanceId,
        @Nullable Output<String> name,
        Output<QuickConnectQuickConnectConfigArgs> quickConnectConfig,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.description = description;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.quickConnectConfig = Objects.requireNonNull(quickConnectConfig, "expected parameter 'quickConnectConfig' to be non-null");
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private QuickConnectArgs() {
        this.description = Output.empty();
        this.instanceId = Output.empty();
        this.name = Output.empty();
        this.quickConnectConfig = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuickConnectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> instanceId;
        private @Nullable Output<String> name;
        private Output<QuickConnectQuickConnectConfigArgs> quickConnectConfig;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(QuickConnectArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.quickConnectConfig = defaults.quickConnectConfig;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder instanceId(Output<String> instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }

        public Builder instanceId(String instanceId) {
            this.instanceId = Output.of(Objects.requireNonNull(instanceId));
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

        public Builder quickConnectConfig(Output<QuickConnectQuickConnectConfigArgs> quickConnectConfig) {
            this.quickConnectConfig = Objects.requireNonNull(quickConnectConfig);
            return this;
        }

        public Builder quickConnectConfig(QuickConnectQuickConnectConfigArgs quickConnectConfig) {
            this.quickConnectConfig = Output.of(Objects.requireNonNull(quickConnectConfig));
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
        public QuickConnectArgs build() {
            return new QuickConnectArgs(description, instanceId, name, quickConnectConfig, tags, tagsAll);
        }
    }
}
