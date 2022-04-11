// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inspector.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The duration of the inspector run.
     * 
     */
    @Import(name="duration")
      private final @Nullable Output<Integer> duration;

    public Output<Integer> getDuration() {
        return this.duration == null ? Codegen.empty() : this.duration;
    }

    /**
     * The name of the assessment template.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The rules to be used during the run.
     * 
     */
    @Import(name="rulesPackageArns")
      private final @Nullable Output<List<String>> rulesPackageArns;

    public Output<List<String>> getRulesPackageArns() {
        return this.rulesPackageArns == null ? Codegen.empty() : this.rulesPackageArns;
    }

    /**
     * Key-value map of tags for the Inspector assessment template. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The assessment target ARN to attach the template to.
     * 
     */
    @Import(name="targetArn")
      private final @Nullable Output<String> targetArn;

    public Output<String> getTargetArn() {
        return this.targetArn == null ? Codegen.empty() : this.targetArn;
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
        this.arn = Codegen.empty();
        this.duration = Codegen.empty();
        this.name = Codegen.empty();
        this.rulesPackageArns = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.targetArn = Codegen.empty();
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
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder duration(@Nullable Output<Integer> duration) {
            this.duration = duration;
            return this;
        }
        public Builder duration(@Nullable Integer duration) {
            this.duration = Codegen.ofNullable(duration);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder rulesPackageArns(@Nullable Output<List<String>> rulesPackageArns) {
            this.rulesPackageArns = rulesPackageArns;
            return this;
        }
        public Builder rulesPackageArns(@Nullable List<String> rulesPackageArns) {
            this.rulesPackageArns = Codegen.ofNullable(rulesPackageArns);
            return this;
        }
        public Builder rulesPackageArns(String... rulesPackageArns) {
            return rulesPackageArns(List.of(rulesPackageArns));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder targetArn(@Nullable Output<String> targetArn) {
            this.targetArn = targetArn;
            return this;
        }
        public Builder targetArn(@Nullable String targetArn) {
            this.targetArn = Codegen.ofNullable(targetArn);
            return this;
        }        public AssessmentTemplateState build() {
            return new AssessmentTemplateState(arn, duration, name, rulesPackageArns, tags, tagsAll, targetArn);
        }
    }
}
