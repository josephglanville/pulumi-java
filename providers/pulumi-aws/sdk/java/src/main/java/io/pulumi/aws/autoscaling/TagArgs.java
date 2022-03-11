// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling;

import io.pulumi.aws.autoscaling.inputs.TagTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class TagArgs extends io.pulumi.resources.ResourceArgs {

    public static final TagArgs Empty = new TagArgs();

    /**
     * The name of the Autoscaling Group to apply the tag to.
     * 
     */
    @InputImport(name="autoscalingGroupName", required=true)
      private final Output<String> autoscalingGroupName;

    public Output<String> getAutoscalingGroupName() {
        return this.autoscalingGroupName;
    }

    /**
     * The tag to create. The `tag` block is documented below.
     * 
     */
    @InputImport(name="tag", required=true)
      private final Output<TagTagArgs> tag;

    public Output<TagTagArgs> getTag() {
        return this.tag;
    }

    public TagArgs(
        Output<String> autoscalingGroupName,
        Output<TagTagArgs> tag) {
        this.autoscalingGroupName = Objects.requireNonNull(autoscalingGroupName, "expected parameter 'autoscalingGroupName' to be non-null");
        this.tag = Objects.requireNonNull(tag, "expected parameter 'tag' to be non-null");
    }

    private TagArgs() {
        this.autoscalingGroupName = Output.empty();
        this.tag = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TagArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> autoscalingGroupName;
        private Output<TagTagArgs> tag;

        public Builder() {
    	      // Empty
        }

        public Builder(TagArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingGroupName = defaults.autoscalingGroupName;
    	      this.tag = defaults.tag;
        }

        public Builder autoscalingGroupName(Output<String> autoscalingGroupName) {
            this.autoscalingGroupName = Objects.requireNonNull(autoscalingGroupName);
            return this;
        }

        public Builder autoscalingGroupName(String autoscalingGroupName) {
            this.autoscalingGroupName = Output.of(Objects.requireNonNull(autoscalingGroupName));
            return this;
        }

        public Builder tag(Output<TagTagArgs> tag) {
            this.tag = Objects.requireNonNull(tag);
            return this;
        }

        public Builder tag(TagTagArgs tag) {
            this.tag = Output.of(Objects.requireNonNull(tag));
            return this;
        }
        public TagArgs build() {
            return new TagArgs(autoscalingGroupName, tag);
        }
    }
}
