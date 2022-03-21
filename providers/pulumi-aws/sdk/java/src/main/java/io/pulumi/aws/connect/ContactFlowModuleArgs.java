// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.connect;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContactFlowModuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactFlowModuleArgs Empty = new ContactFlowModuleArgs();

    /**
     * Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    @Import(name="contentHash")
      private final @Nullable Output<String> contentHash;

    public Output<String> getContentHash() {
        return this.contentHash == null ? Output.empty() : this.contentHash;
    }

    /**
     * Specifies the description of the Contact Flow Module.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
     * 
     */
    @Import(name="filename")
      private final @Nullable Output<String> filename;

    public Output<String> getFilename() {
        return this.filename == null ? Output.empty() : this.filename;
    }

    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Import(name="instanceId", required=true)
      private final Output<String> instanceId;

    public Output<String> getInstanceId() {
        return this.instanceId;
    }

    /**
     * Specifies the name of the Contact Flow Module.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Tags to apply to the Contact Flow Module. If configured with a provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider [`default_tags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public ContactFlowModuleArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> contentHash,
        @Nullable Output<String> description,
        @Nullable Output<String> filename,
        Output<String> instanceId,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.content = content;
        this.contentHash = contentHash;
        this.description = description;
        this.filename = filename;
        this.instanceId = Objects.requireNonNull(instanceId, "expected parameter 'instanceId' to be non-null");
        this.name = name;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private ContactFlowModuleArgs() {
        this.content = Output.empty();
        this.contentHash = Output.empty();
        this.description = Output.empty();
        this.filename = Output.empty();
        this.instanceId = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactFlowModuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> contentHash;
        private @Nullable Output<String> description;
        private @Nullable Output<String> filename;
        private Output<String> instanceId;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactFlowModuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentHash = defaults.contentHash;
    	      this.description = defaults.description;
    	      this.filename = defaults.filename;
    	      this.instanceId = defaults.instanceId;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Output.ofNullable(content);
            return this;
        }
        public Builder contentHash(@Nullable Output<String> contentHash) {
            this.contentHash = contentHash;
            return this;
        }
        public Builder contentHash(@Nullable String contentHash) {
            this.contentHash = Output.ofNullable(contentHash);
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
        public Builder filename(@Nullable Output<String> filename) {
            this.filename = filename;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = Output.ofNullable(filename);
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
        }        public ContactFlowModuleArgs build() {
            return new ContactFlowModuleArgs(content, contentHash, description, filename, instanceId, name, tags, tagsAll);
        }
    }
}
