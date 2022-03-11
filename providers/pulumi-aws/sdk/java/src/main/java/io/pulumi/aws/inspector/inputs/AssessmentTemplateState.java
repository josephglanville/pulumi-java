// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inspector.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AssessmentTemplateState extends io.pulumi.resources.ResourceArgs {

    public static final AssessmentTemplateState Empty = new AssessmentTemplateState();

    /**
     * The template assessment ARN.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The duration of the inspector run.
     * 
     */
    @InputImport(name="duration")
      private final @Nullable Output<Integer> duration;

    public Output<Integer> getDuration() {
        return this.duration == null ? Output.empty() : this.duration;
    }

    /**
     * The name of the assessment template.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The rules to be used during the run.
     * 
     */
    @InputImport(name="rulesPackageArns")
      private final @Nullable Output<List<String>> rulesPackageArns;

    public Output<List<String>> getRulesPackageArns() {
        return this.rulesPackageArns == null ? Output.empty() : this.rulesPackageArns;
    }

    /**
     * Key-value map of tags for the Inspector assessment template. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The assessment target ARN to attach the template to.
     * 
     */
    @InputImport(name="targetArn")
      private final @Nullable Output<String> targetArn;

    public Output<String> getTargetArn() {
        return this.targetArn == null ? Output.empty() : this.targetArn;
    }

    public AssessmentTemplateState(
        @Nullable Output<String> arn,
        @Nullable Output<Integer> duration,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> rulesPackageArns,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> targetArn) {
        this.arn = arn;
        this.duration = duration;
        this.name = name;
        this.rulesPackageArns = rulesPackageArns;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.targetArn = targetArn;
    }

    private AssessmentTemplateState() {
        this.arn = Output.empty();
        this.duration = Output.empty();
        this.name = Output.empty();
        this.rulesPackageArns = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.targetArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AssessmentTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<Integer> duration;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> rulesPackageArns;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> targetArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AssessmentTemplateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.duration = defaults.duration;
    	      this.name = defaults.name;
    	      this.rulesPackageArns = defaults.rulesPackageArns;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.targetArn = defaults.targetArn;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder duration(@Nullable Output<Integer> duration) {
            this.duration = duration;
            return this;
        }

        public Builder duration(@Nullable Integer duration) {
            this.duration = Output.ofNullable(duration);
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

        public Builder rulesPackageArns(@Nullable Output<List<String>> rulesPackageArns) {
            this.rulesPackageArns = rulesPackageArns;
            return this;
        }

        public Builder rulesPackageArns(@Nullable List<String> rulesPackageArns) {
            this.rulesPackageArns = Output.ofNullable(rulesPackageArns);
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

        public Builder targetArn(@Nullable Output<String> targetArn) {
            this.targetArn = targetArn;
            return this;
        }

        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = Output.ofNullable(targetArn);
            return this;
        }
        public AssessmentTemplateState build() {
            return new AssessmentTemplateState(arn, duration, name, rulesPackageArns, tags, tagsAll, targetArn);
        }
    }
}
