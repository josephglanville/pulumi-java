// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie.inputs;

import io.pulumi.aws.macie.inputs.FindingsFilterFindingCriteriaGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FindingsFilterState extends io.pulumi.resources.ResourceArgs {

    public static final FindingsFilterState Empty = new FindingsFilterState();

    /**
     * The action to perform on findings that meet the filter criteria (`finding_criteria`). Valid values are: `ARCHIVE`, suppress (automatically archive) the findings; and, `NOOP`, don't perform any action on the findings.
     * 
     */
    @Import(name="action")
      private final @Nullable Output<String> action;

    public Output<String> getAction() {
        return this.action == null ? Output.empty() : this.action;
    }

    /**
     * The Amazon Resource Name (ARN) of the Findings Filter.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A custom description of the filter. The description can contain as many as 512 characters.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The criteria to use to filter findings.
     * 
     */
    @Import(name="findingCriteria")
      private final @Nullable Output<FindingsFilterFindingCriteriaGetArgs> findingCriteria;

    public Output<FindingsFilterFindingCriteriaGetArgs> getFindingCriteria() {
        return this.findingCriteria == null ? Output.empty() : this.findingCriteria;
    }

    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Creates a unique name beginning with the specified prefix. Conflicts with `name`.
     * 
     */
    @Import(name="namePrefix")
      private final @Nullable Output<String> namePrefix;

    public Output<String> getNamePrefix() {
        return this.namePrefix == null ? Output.empty() : this.namePrefix;
    }

    /**
     * The position of the filter in the list of saved filters on the Amazon Macie console. This value also determines the order in which the filter is applied to findings, relative to other filters that are also applied to the findings.
     * 
     */
    @Import(name="position")
      private final @Nullable Output<Integer> position;

    public Output<Integer> getPosition() {
        return this.position == null ? Output.empty() : this.position;
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the filter.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public FindingsFilterState(
        @Nullable Output<String> action,
        @Nullable Output<String> arn,
        @Nullable Output<String> description,
        @Nullable Output<FindingsFilterFindingCriteriaGetArgs> findingCriteria,
        @Nullable Output<String> name,
        @Nullable Output<String> namePrefix,
        @Nullable Output<Integer> position,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.action = action;
        this.arn = arn;
        this.description = description;
        this.findingCriteria = findingCriteria;
        this.name = name;
        this.namePrefix = namePrefix;
        this.position = position;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private FindingsFilterState() {
        this.action = Output.empty();
        this.arn = Output.empty();
        this.description = Output.empty();
        this.findingCriteria = Output.empty();
        this.name = Output.empty();
        this.namePrefix = Output.empty();
        this.position = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FindingsFilterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> action;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> description;
        private @Nullable Output<FindingsFilterFindingCriteriaGetArgs> findingCriteria;
        private @Nullable Output<String> name;
        private @Nullable Output<String> namePrefix;
        private @Nullable Output<Integer> position;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(FindingsFilterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.findingCriteria = defaults.findingCriteria;
    	      this.name = defaults.name;
    	      this.namePrefix = defaults.namePrefix;
    	      this.position = defaults.position;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder action(@Nullable Output<String> action) {
            this.action = action;
            return this;
        }
        public Builder action(@Nullable String action) {
            this.action = Output.ofNullable(action);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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
        public Builder findingCriteria(@Nullable Output<FindingsFilterFindingCriteriaGetArgs> findingCriteria) {
            this.findingCriteria = findingCriteria;
            return this;
        }
        public Builder findingCriteria(@Nullable FindingsFilterFindingCriteriaGetArgs findingCriteria) {
            this.findingCriteria = Output.ofNullable(findingCriteria);
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
        public Builder namePrefix(@Nullable Output<String> namePrefix) {
            this.namePrefix = namePrefix;
            return this;
        }
        public Builder namePrefix(@Nullable String namePrefix) {
            this.namePrefix = Output.ofNullable(namePrefix);
            return this;
        }
        public Builder position(@Nullable Output<Integer> position) {
            this.position = position;
            return this;
        }
        public Builder position(@Nullable Integer position) {
            this.position = Output.ofNullable(position);
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
        }        public FindingsFilterState build() {
            return new FindingsFilterState(action, arn, description, findingCriteria, name, namePrefix, position, tags, tagsAll);
        }
    }
}