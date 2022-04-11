// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.tags;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class TagBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagBindingArgs Empty = new TagBindingArgs();

    /**
     * The full resource name of the resource the TagValue is bound to. E.g. //cloudresourcemanager.googleapis.com/projects/123
     * 
     */
    @Import(name="parent", required=true)
      private final Output<String> parent;

    public Output<String> getParent() {
        return this.parent;
    }

    /**
     * The TagValue of the TagBinding. Must be of the form tagValues/456.
     * 
     */
    @Import(name="tagValue", required=true)
      private final Output<String> tagValue;

    public Output<String> getTagValue() {
        return this.tagValue;
    }

    public TagBindingArgs(
        Output<String> parent,
        Output<String> tagValue) {
        this.parent = Objects.requireNonNull(parent, "expected parameter 'parent' to be non-null");
        this.tagValue = Objects.requireNonNull(tagValue, "expected parameter 'tagValue' to be non-null");
    }

    private TagBindingArgs() {
        this.parent = Codegen.empty();
        this.tagValue = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> parent;
        private Output<String> tagValue;

        public Builder() {
    	      // Empty
        }

        public Builder(TagBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parent = defaults.parent;
    	      this.tagValue = defaults.tagValue;
        }

        public Builder parent(Output<String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder parent(String parent) {
            this.parent = Output.of(Objects.requireNonNull(parent));
            return this;
        }
        public Builder tagValue(Output<String> tagValue) {
            this.tagValue = Objects.requireNonNull(tagValue);
            return this;
        }
        public Builder tagValue(String tagValue) {
            this.tagValue = Output.of(Objects.requireNonNull(tagValue));
            return this;
        }        public TagBindingArgs build() {
            return new TagBindingArgs(parent, tagValue);
        }
    }
}
