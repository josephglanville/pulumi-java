// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TagKeyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagKeyArgs Empty = new TagKeyArgs();

    /**
     * User-assigned description of the TagKey. Must not exceed 256 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Input only. The resource name of the new TagKey's parent. Must be of the form organizations/{org_id}.
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }

    /**
     * Input only. The user friendly name for a TagKey. The short name should be unique for TagKeys within the same tag namespace.
     * The short name must be 1-63 characters, beginning and ending with an alphanumeric character ([a-z0-9A-Z]) with dashes (-), underscores (_), dots (.), and alphanumerics between.
     * 
     */
    @Import(name="shortName", required=true)
      private final Output<String> shortName;

    public Output<String> getShortName() {
        return this.shortName;
    }

    public TagKeyArgs(
        @Nullable Output<String> description,
        Output<String> parent,
        Output<String> shortName) {
        this.description = description;
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.shortName = Objects.requireNonNull(shortName, "expected parameter 'shortName' to be non-null");
    }

    private TagKeyArgs() {
        this.description = Codegen.empty();
        this.parent = Codegen.empty();
        this.shortName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagKeyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private Output<String> parent;
        private Output<String> shortName;

        public Builder() {
    	      // Empty
        }

        public Builder(TagKeyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.parent = defaults.parent;
    	      this.shortName = defaults.shortName;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }
        public Builder shortName(Output<String> shortName) {
            this.shortName = Objects.requireNonNull(shortName);
            return this;
        }
        public Builder shortName(String shortName) {
            this.shortName = Output.of(Objects.requireNonNull(shortName));
            return this;
        }        public TagKeyArgs build() {
            return new TagKeyArgs(description, parent, shortName);
        }
    }
}
